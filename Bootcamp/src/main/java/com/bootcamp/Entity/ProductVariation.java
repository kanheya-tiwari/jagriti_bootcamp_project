package com.bootcamp.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductVariation {
    @Id
    @GeneratedValue(generator = "UUID")
   @UuidGenerator
    private UUID id;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;


    @Column( nullable = false)
    private int quantityAvailable;


    @Column( nullable = false)
    private BigDecimal price;



    @Column( columnDefinition = "json")
    private String metadata;


    private String primaryImageName;


    @Column(nullable = false)
    private boolean isActive;
}
