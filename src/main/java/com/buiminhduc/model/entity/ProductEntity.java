package com.buiminhduc.model.entity;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
@NaturalIdCache
//@Cache(
//        usage = CacheConcurrencyStrategy.READ_WRITE
//)
public class ProductEntity extends BaseEntity {

    @Column(name = "product_name")
    private String productName;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private String size;

    @Column(name = "description")
    private String description;

    @Column(name = "tag")
    private String tag;

    @Column(name = "price")
    private Double price;

    @Column(name = "stock")
    private int sold;

    @Column(name="quanlity")
    private int quanlity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="brand_id")
    private BrandEntity brand;

    @OneToMany(mappedBy = "product")
    private List<CartProduct> carts= new ArrayList<>();
}
