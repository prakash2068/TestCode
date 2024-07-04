package com.Inc.UserManagement.Model;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="users", schema = "public")
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "User_Id")
    private int userId;

    @Column(name = "Address1")
    private String address;

    @Column(name = "Country")
    private String country;

    @Column(name = "Created_At")
    private Date createdAt;

    @Column(name = "Email")
    private String userEmail;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Last_Login")
    private Date lastLogin;

    @Column(name = "Password")
    private String password;

    @Column(name = "Reset_Token")
    private String resetToken;

    @Column(name = "State")
    private String state;

    @Column(name = "Updated_At")
    private Date updatedAt;

    @Column(name = "Username")
    private String username;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private Role role;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "organization_id", referencedColumnName = "organization_id")
    private Organization org;



    public User() {
        super();
    }


    public User(int userId, String address, String country, Date createdAt, String userEmail, String firstName, String lastName, Date lastLogin, String password,
                String resetToken, String state, Date updatedAt, String username, Role role, Organization org) {
        this.userId = userId;
        this.address = address;
        this.country = country;
        this.createdAt = createdAt;
        this.userEmail = userEmail;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastLogin = lastLogin;
        this.password = password;
        this.resetToken = resetToken;
        this.state = state;
        this.updatedAt = updatedAt;
        this.username = username;
        this.role = role;
        this.org = org;
    }


    public User(int id, String address, String country, Date createdAt, String userEmail, String lastName, String firstName,
                Date lastLogin, String password, String resetToken, String state, Date updatedAt, String username) {
        this.userId = userId;
        this.address = address;
        this.country = country;
        this.createdAt = createdAt;
        this.userEmail = userEmail;
        this.lastName = lastName;
        this.firstName = firstName;
        this.lastLogin = lastLogin;
        this.password = password;
        this.resetToken = resetToken;
        this.state = state;
        this.updatedAt = updatedAt;
        this.username = username;
    }


    public User(Organization org, Role role) {
        this.org = org;
        this.role = role;
    }


    /**
     * get field
     *
     * @return id
     */
    public int getUserId() {
        return this.userId;
    }

    /**
     * set field
     *
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * get field
     *
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * set field
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * get field
     *
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * set field
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * get field
     *
     * @return createdAt
     */
    public Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * set field
     *
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * get field
     *
     * @return userEmail
     */
    public String getUserEmail() {
        return this.userEmail;
    }

    /**
     * set field
     *
     * @param userEmail
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * get field
     *
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * set field
     *
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get field
     *
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * set field
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * get field
     *
     * @return lastLogin
     */
    public Date getLastLogin() {
        return this.lastLogin;
    }

    /**
     * set field
     *
     * @param lastLogin
     */
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    /**
     * get field
     *
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * set field
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * get field
     *
     * @return resetToken
     */
    public String getResetToken() {
        return this.resetToken;
    }

    /**
     * set field
     *
     * @param resetToken
     */
    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    /**
     * get field
     *
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * set field
     *
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * get field
     *
     * @return updatedAt
     */
    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * set field
     *
     * @param updatedAt
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * get field
     *
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * set field
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }


    /**
     * get field

     */
    public Organization getOrg() {
        return this.org;
    }

    /**
     * set field

     */
    public void setOrg(Organization org) {
        this.org = org;
    }

    /**
     * get field

     */
    public Role getRole() {
        return this.role;
    }

    /**
     * set field

     */
    public void setRole(Role role) {
        this.role = role;
    }
}
