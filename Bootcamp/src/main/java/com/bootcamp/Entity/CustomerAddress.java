package com.bootcamp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerAddress {

    @Column(name = "customer_address_city", nullable = false)
    private String city;

    @Column(name = "customer_address_state", nullable = false)
    private String state;

    @Column(name = "customer_address_country", nullable = false)
    private String country;

    @Column(name = "customer_address_addressline", nullable = false)
    private String addressLine;

    @Column(name = "customer_address_zipcode", nullable = false)
    private String zipCode;

  
    @Column(name = "customer_address_label")
    private String label;


}

