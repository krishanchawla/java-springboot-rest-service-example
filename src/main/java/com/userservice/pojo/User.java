package com.userservice.pojo;

/* -----------------------------------------------------------------------
   - ** Java Springboot Rest Service Example Project **
   - Author: Krishan Chawla (krishanchawla1467@gmail.com)
   - Git Repo: https://github.com/krishanchawla/java-springboot-rest-service-example
   ----------------------------------------------------------------------- */
public class User {

    private String id;
    private String userid;
    private String firstname;
    private String lastname;
    private String emailid;
    private String role;
    private int status;

    public User (String id, String userid, String firstname, String lastname, String emailid, String role, int status) {
        this.id = id;
        this.userid = userid;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.role = role;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userid='" + userid + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", emailid='" + emailid + '\'' +
                ", role='" + role + '\'' +
                ", status=" + status +
                '}';
    }
}
