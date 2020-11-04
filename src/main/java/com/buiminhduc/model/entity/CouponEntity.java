package com.buiminhduc.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coupon")
public class CouponEntity{
    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "discount")
    private int discount;

    @Column(name = "amount")
    private int amount;


}
