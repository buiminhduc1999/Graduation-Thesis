package com.buiminhduc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "brand")
public class BrandEntity extends BaseEntity {

    @Column(name = "brand_name")
    String brandName;

    @OneToMany(mappedBy = "brand")
    private List<ProductEntity> productEntities= new ArrayList<>();

}
