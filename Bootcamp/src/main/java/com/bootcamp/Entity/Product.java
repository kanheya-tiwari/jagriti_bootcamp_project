package com.bootcamp.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(generator = "UUID")
    @UuidGenerator
    private UUID id;

  //catehory k sath one to many
    //seller k sath one to many

    @Column( nullable = false)
    private String name;


    private String description;

    @Column(nullable = false)
    private boolean cancellable;

    @Column( nullable = false)
    private boolean returnable;


    private String brand;

    @Column(nullable = false)
    private boolean active;

    @Column( nullable = false)
    private boolean deleted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id",referencedColumnName = "user_id")
    private Seller seller;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",referencedColumnName = "id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<ProductVariation> productVariationList;
}
