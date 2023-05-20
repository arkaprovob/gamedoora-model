CREATE TABLE IF NOT EXISTS public.users
(
    id
    bigint
    NOT
    NULL,
    active
    boolean,
    created_by
    character
    varying
(
    255
) COLLATE pg_catalog."default",
    created_on timestamp without time zone,
    update_by character varying
(
    255
) COLLATE pg_catalog."default",
    update_on timestamp
                         without time zone,
    current_sign_in timestamp
                         without time zone,
    current_sign_ip character varying
(
    255
) COLLATE pg_catalog."default",
    email character varying
(
    255
) COLLATE pg_catalog."default" NOT NULL,
    first_name character varying
(
    255
) COLLATE pg_catalog."default",
    last_name character varying
(
    255
) COLLATE pg_catalog."default",
    last_sign_in timestamp
                         without time zone,
    last_sign_ip character varying
(
    255
) COLLATE pg_catalog."default",
    password character varying
(
    255
) COLLATE pg_catalog."default",
    phone_number character varying
(
    255
) COLLATE pg_catalog."default",
    photo_url character varying
(
    255
) COLLATE pg_catalog."default",
    provider_id bigint,
    provider_token character varying
(
    255
) COLLATE pg_catalog."default" NOT NULL,
    reset_password_token character varying
(
    255
) COLLATE pg_catalog."default",
    session_token character varying
(
    255
) COLLATE pg_catalog."default",
    sign_in_count integer,
    CONSTRAINT users_pkey PRIMARY KEY
(
    id
),
    CONSTRAINT email_unKey UNIQUE
(
    email
)
    );

CREATE TABLE IF NOT EXISTS public.roles
(
    id
    bigint
    NOT
    NULL,
    active
    boolean,
    created_by
    character
    varying
(
    255
) COLLATE pg_catalog."default",
    created_on timestamp without time zone,
    update_by character varying
(
    255
) COLLATE pg_catalog."default",
    update_on timestamp
                         without time zone,
    role_description character varying
(
    255
) COLLATE pg_catalog."default",
    role_name character varying
(
    255
) COLLATE pg_catalog."default",
    CONSTRAINT roles_pkey PRIMARY KEY
(
    id
)
    );

CREATE TABLE IF NOT EXISTS public.skills
(
    id
    bigint
    NOT
    NULL,
    active
    boolean,
    created_by
    character
    varying
(
    255
) COLLATE pg_catalog."default",
    created_on timestamp without time zone,
    update_by character varying
(
    255
) COLLATE pg_catalog."default",
    update_on timestamp
                         without time zone,
    skill_description character varying
(
    255
) COLLATE pg_catalog."default",
    skill_name character varying
(
    255
) COLLATE pg_catalog."default",
    CONSTRAINT skills_pkey PRIMARY KEY
(
    id
)
    );

CREATE TABLE IF NOT EXISTS public.sources
(
    id
    bigint
    NOT
    NULL,
    active
    boolean,
    created_by
    character
    varying
(
    255
) COLLATE pg_catalog."default",
    created_on timestamp without time zone,
    update_by character varying
(
    255
) COLLATE pg_catalog."default",
    update_on timestamp
                         without time zone,
    source_name character varying
(
    255
) COLLATE pg_catalog."default",
    CONSTRAINT sources_pkey PRIMARY KEY
(
    id
)
    );

CREATE TABLE IF NOT EXISTS public.providers
(
    id
    bigint
    NOT
    NULL,
    active
    boolean,
    created_by
    character
    varying
(
    255
) COLLATE pg_catalog."default",
    created_on timestamp without time zone,
    update_by character varying
(
    255
) COLLATE pg_catalog."default",
    update_on timestamp
                         without time zone,
    provider_id character varying
(
    255
) COLLATE pg_catalog."default",
    provider_name character varying
(
    255
) COLLATE pg_catalog."default",
    CONSTRAINT providers_pkey PRIMARY KEY
(
    id
)
    );

CREATE TABLE IF NOT EXISTS public.highlights
(
    id
    bigint
    NOT
    NULL,
    active
    boolean,
    created_by
    character
    varying
(
    255
) COLLATE pg_catalog."default",
    created_on timestamp without time zone,
    update_by character varying
(
    255
) COLLATE pg_catalog."default",
    update_on timestamp
                         without time zone,
    url_details bigint,
    user_id bigint,
    CONSTRAINT highlights_pkey PRIMARY KEY
(
    id
)
    );

CREATE TABLE IF NOT EXISTS public.users_roles
(
    id
    bigint
    NOT
    NULL,
    user_id
    bigint,
    role_id
    bigint,
    CONSTRAINT
    users_roles_pkey
    PRIMARY
    KEY
(
    id
),
    CONSTRAINT fk_user_id FOREIGN KEY
(
    user_id
)
    REFERENCES public.users
(
    id
) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    CONSTRAINT fk_role_id FOREIGN KEY
(
    role_id
)
    REFERENCES public.roles
(
    id
) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    );

CREATE TABLE IF NOT EXISTS public.user_skills
(
    id
    bigint
    NOT
    NULL,
    user_id
    bigint,
    skill_id
    bigint,
    CONSTRAINT
    user_skills_pkey
    PRIMARY
    KEY
(
    id
),
    CONSTRAINT fk_user_id FOREIGN KEY
(
    user_id
)
    REFERENCES public.users
(
    id
) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    CONSTRAINT fk_skill_id FOREIGN KEY
(
    skill_id
)
    REFERENCES public.skills
(
    id
) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    );

CREATE TABLE IF NOT EXISTS public.skills_sources
(
    id
    bigint
    NOT
    NULL,
    source_id
    bigint,
    skill_id
    bigint,
    CONSTRAINT
    skills_sources_pkey
    PRIMARY
    KEY
(
    id
),
    CONSTRAINT fk_source_id FOREIGN KEY
(
    source_id
)
    REFERENCES public.sources
(
    id
) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    CONSTRAINT fk_skill_id FOREIGN KEY
(
    skill_id
)
    REFERENCES public.skills
(
    id
) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    );

CREATE TABLE IF NOT EXISTS public.roles_skills
(
    id
    bigint
    NOT
    NULL,
    role_id
    bigint,
    skill_id
    bigint,
    CONSTRAINT
    roles_skills_pkey
    PRIMARY
    KEY
(
    id
),
    CONSTRAINT fk_role_id FOREIGN KEY
(
    role_id
)
    REFERENCES public.roles
(
    id
) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION,
    CONSTRAINT fk_skill_id FOREIGN KEY
(
    skill_id
)
    REFERENCES public.skills
(
    id
) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
    );
