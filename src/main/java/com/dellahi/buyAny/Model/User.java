package com.dellahi.buyAny.Model;

import javax.persistence.*;

@Entity(name= "User")
@Table(
        name = "user",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_email_unique", columnNames = "user_email")
        }
)
public class User {

    @Id
    @Column(name = "user_name")
    private String userName;

    @Column(
            name = "user_email",
            nullable = false
    )
    private String userEmail;

    @Column(
            name = "password",
            nullable = false
    )
    private String password;

    public User(String userName, String userEmail,String password) {
        this.userName = userName;
        this.password = password;
        this.userEmail= userEmail;
    }

    public User() {
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getUserEmail()
    {
        return userEmail;
    }

    public void setUserEmail(String userEmail)
    {
        this.userEmail = userEmail;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
