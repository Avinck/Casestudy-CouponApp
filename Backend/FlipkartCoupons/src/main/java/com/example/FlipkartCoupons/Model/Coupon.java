package com.example.FlipkartCoupons.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "coupons")
public class Coupon {

    @Id
    private String id;
    private String provider;
    private String RedeemCode;
    private String price;
    private String Title;

    

    public Coupon() {
    }

    public Coupon(String price) {
        this.price = price;
    }

    public Coupon(String id, String provider, String RedeemCode, String Title) {
        super();
        this.id = id;
        this.provider = provider;
        this.RedeemCode = RedeemCode;
        this.Title = Title;
    }

    public Coupon(String s, String myntra, String end10, String s1, String s2) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRedeemCode() {
        return RedeemCode;
    }

    public void setRedeemCode(String redeemCode) {
        this.RedeemCode = redeemCode;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id='" + id + '\'' +
                ", provider='" + provider + '\'' +
                ", RedeemCode='" + RedeemCode + '\'' +
                ", price='" + price + '\'' +
                ", Title='" + Title + '\'' +
                '}';
    }
}

