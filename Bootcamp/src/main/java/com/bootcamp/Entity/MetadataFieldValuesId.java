package com.bootcamp.Entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class MetadataFieldValuesId implements Serializable {


    private Category categoryId;
    private CategoryMetadataField categoryMetadataFieldId;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MetadataFieldValuesId)) return false;
        MetadataFieldValuesId that = (MetadataFieldValuesId) obj;
        return Objects.equals(categoryId, that.categoryId) &&
                Objects.equals(categoryMetadataFieldId, that.categoryMetadataFieldId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId, categoryMetadataFieldId);
    }
}
