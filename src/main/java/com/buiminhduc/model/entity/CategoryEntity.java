package com.buiminhduc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class CategoryEntity extends BaseEntity {

    @Column(name = "category_name")
    String categoryName;

    @OneToMany(mappedBy = "category")
    private List<ProductEntity> productEntities= new ArrayList<>();
}
