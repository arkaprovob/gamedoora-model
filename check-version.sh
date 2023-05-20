#!/bin/bash

VERSION=$(mvn -q -Dexec.executable=echo -Dexec.args='${project.version}' --non-recursive exec:exec)
URL=https://maven.pkg.github.com/arkaprovob/gamedoora-model/com/gamedoora/gamedoora-model/$VERSION/gamedoora-model-$VERSION.pom
STATUS_CODE=$(curl --silent --output /dev/null --write-out "%{http_code}\n" -u ${USER}:${PAT} $URL)

if [ $STATUS_CODE -eq 200 ]; then
  echo "::set-output name=exists::true"
  echo "Version $VERSION already exists."
else
  echo "::set-output name=exists::false"
  echo "Version $VERSION does not exist, proceeding with the artifact upload."
fi
