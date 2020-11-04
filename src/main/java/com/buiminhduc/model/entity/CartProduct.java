package com.buiminhduc.model.entity;

import javax.persistence.*;
@Entity
@Table(name = "cart_product")
public class CartProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("cartId")
    private CartEntity cart;

    @ManyToOne(fetch = FetchType.LAZY)
//    @MapsId("productId")
    private ProductEntity product;

    @Column(name = "quantity")
    private int quantity;

}
