package com.bootcamp.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public class User {


    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    @Column(name = "id", nullable = false)
    private UUID id;


    @Column( nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String firstName;


    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String password;


    private boolean isDeleted;


    private boolean isActive;


    private boolean isExpired;


    private boolean isLocked;


    private int invalidAttemptCount;


    private LocalDateTime passwordUpdateDate;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="user_id",referencedColumnName = "id")
    private Set<Address> addressSet;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id",referencedColumnName = "id")
    private Role role;

}
