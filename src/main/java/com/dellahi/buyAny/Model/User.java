package com.dellahi.buyAny.Model;

import lombok.*;

import javax.persistence.*;

@Entity(name= "User")
@Table(
        name = "user",
        uniqueConstraints = {
                @UniqueConstraint(name = "user_email_unique", columnNames = "user_email")
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
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
}
