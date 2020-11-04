package com.buiminhduc.model.entity;

import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Cart")
@NaturalIdCache
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class CartEntity extends BaseEntity {

    @Column(name = "total")
    private String total;

    @OneToOne
    @JoinColumn(name = "cart_id")
    private UserEntity userEntity;

    @OneToMany(mappedBy = "cart")
    private List<CartProduct> products= new ArrayList<>();
}
