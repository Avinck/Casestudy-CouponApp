package com.example.Coupons.MyntraCouponService.Repository;



import com.example.Coupons.MyntraCouponService.Model.Coupon;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;


public interface CouponRepository extends MongoRepository<Coupon, String> {

	

	List<Coupon> findByprovider(String provider);


}
