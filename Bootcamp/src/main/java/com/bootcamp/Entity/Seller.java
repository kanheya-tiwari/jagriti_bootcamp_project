package com.bootcamp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name="user_id")
public class Seller extends User{

    @Column(nullable = false, unique = true)
    private String gst;

    @Column(nullable=false,unique = true)
    private String companyContact;


    private String companyName;

    //to string exclude krna h
    @OneToMany(mappedBy = "seller",cascade = CascadeType.ALL)
    private Set<Product> productSet;

}
