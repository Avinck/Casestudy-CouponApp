package com.example.Coupons.MyntraCouponService.Service;


import com.example.Coupons.MyntraCouponService.Model.Coupon;
import com.example.Coupons.MyntraCouponService.Repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CouponService {

    @Autowired
    private CouponRepository couponRepository;


    public List<Coupon> getAllCoupons() {
        return couponRepository.findAll();
    }


    public Coupon addCoupon( Coupon coupon) {
        couponRepository.save(coupon);
        return coupon;
    }


    public String deleteCoupon( String couponID) {
        couponRepository.deleteById(couponID);
        return "coupon with id = "+ couponID +" deleted successfully";
    }

    public Coupon updateCoupon( Coupon coupon,String couponID) {
        return couponRepository.save(coupon);
    }


    public List<Coupon> findByprovider(String provider)
	{
		return couponRepository.findByprovider(provider);
	}


	


	
    
    

}
