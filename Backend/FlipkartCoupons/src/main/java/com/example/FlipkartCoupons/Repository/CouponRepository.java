package com.example.FlipkartCoupons.Repository;



import com.example.FlipkartCoupons.Model.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface CouponRepository extends MongoRepository<Coupon, String> {

	

	List<Coupon> findByprovider(String provider);


}
