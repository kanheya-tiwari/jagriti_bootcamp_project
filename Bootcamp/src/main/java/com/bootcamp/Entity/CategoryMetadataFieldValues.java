package com.bootcamp.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import jakarta.persistence.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoryMetadataFieldValues {

   @EmbeddedId
    private MetadataFieldValuesId id;


//mapping define krni hain


    // Comma-separated values like "Red,Blue,Green"
    @Column( nullable = false)
    private String values;

}
