package com.gamedoora.model.dao;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Users extends Audit implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    long id;

    @Column(name = "provider_token", nullable = false)
    String providerToken;

    @Column(name = "email", nullable = false)
    String email;

    @Column(name = "first_name")
    String firstName;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "provider_id")
    long providerId;

    @Column(name = "password")
    String password;

    @Column(name = "sign_in_count")
    int signInCount;

    @Column(name = "session_token")
    String sessionToken;

    @Column(name = "reset_password_token")
    String resetPasswordToken;

    @Column(name = "photo_url")
    String photoUrl;

    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "last_sign_in")
    @Temporal(TemporalType.TIMESTAMP)
    Date lastSignIn;

    @Column(name = "last_sign_ip")
    String lastSignIp;

    @Column(name = "current_sign_ip")
    String currentSignIp;

    @Column(name = "current_sign_in")
    @Temporal(TemporalType.TIMESTAMP)
    Date currentSignIn;

    @OneToMany(mappedBy = "users")
    Set<UserRole> userRole;

    @OneToMany(mappedBy = "users")
    Set<UserSkills> userSkills;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProviderToken() {
        return providerToken;
    }

    public void setProviderToken(String providerToken) {
        this.providerToken = providerToken;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getProviderId() {
        return providerId;
    }

    public void setProviderId(long providerId) {
        this.providerId = providerId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSignInCount() {
        return signInCount;
    }

    public void setSignInCount(int signInCount) {
        this.signInCount = signInCount;
    }

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getResetPasswordToken() {
        return resetPasswordToken;
    }

    public void setResetPasswordToken(String resetPasswordToken) {
        this.resetPasswordToken = resetPasswordToken;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getLastSignIn() {
        return lastSignIn;
    }

    public void setLastSignIn(Date lastSignIn) {
        this.lastSignIn = lastSignIn;
    }

    public String getLastSignIp() {
        return lastSignIp;
    }

    public void setLastSignIp(String lastSignIp) {
        this.lastSignIp = lastSignIp;
    }

    public String getCurrentSignIp() {
        return currentSignIp;
    }

    public void setCurrentSignIp(String currentSignIp) {
        this.currentSignIp = currentSignIp;
    }

    public Date getCurrentSignIn() {
        return currentSignIn;
    }

    public void setCurrentSignIn(Date currentSignIn) {
        this.currentSignIn = currentSignIn;
    }

    public Set<UserRole> getUserRole() {
        return userRole;
    }

    public void setUserRole(Set<UserRole> userRole) {
        this.userRole = userRole;
    }

    public Set<UserSkills> getUserSkills() {
        return userSkills;
    }

    public void setUserSkills(Set<UserSkills> userSkills) {
        this.userSkills = userSkills;
    }

}
