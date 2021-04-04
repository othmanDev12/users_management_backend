package com.supportportal.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "id")
    private Long id;
    @Column(name = "user_ids")
    private String userId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "user_name")
    private String username;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "profile_image_url")
    private String profileImageUrl;
    @Column(name = "last_login_date")
    private Date lastLoginDate;
    @Column(name = "last_login_date_display")
    private Date lastLoginDateDisplay;
    @Column(name = "join_date")
    private Date joinDate;
    @Column(name = "roles")
    private String role; //ROLE_USER{ read, edit }, ROLE_ADMIN {delete}
    @Column(name = "authorities")
    private String[] authorities;
    @Column(name = "is_active")
    private boolean isActive;
    @Column(name = "is_not_locked")
    private boolean isNotLocked;
}
