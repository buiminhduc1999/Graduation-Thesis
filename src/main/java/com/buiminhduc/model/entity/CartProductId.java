package com.buiminhduc.model.entity;//package sunny.com.model.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import java.io.Serializable;
//import java.util.Objects;
//
//@Embeddable
//public class CartProductId  {
//
//    @Column(name="cart_id")
//    private int cartId;
//
//    @Column(name = "product_id")
//    private int productId;
//
//    public CartProductId(int cartId, int productId) {
//        this.cartId = cartId;
//        this.productId = productId;
//    }
//
//    public CartProductId() {
//
//    }
//
//    public int getCartId() {
//        return cartId;
//    }
//
//    public void setCartId(int cartId) {
//        this.cartId = cartId;
//    }
//
//    public int getProductId() {
//        return productId;
//    }
//
//    public void setProductId(int productId) {
//        this.productId = productId;
//    }
//
////    @Override
////    public boolean equals(Object o) {
////        if (this == o) return true;
////
////        if (o == null || getClass() != o.getClass())
////            return false;
////
////        CartProductId that = (CartProductId) o;
////        return Objects.equals(cartId, that.cartId) &&
////                Objects.equals(productId, that.productId);
////    }
////
////    @Override
////    public int hashCode() {
////        return Objects.hash(cartId, productId);
////    }
//}
