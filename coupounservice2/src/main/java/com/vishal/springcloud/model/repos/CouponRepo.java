package com.vishal.springcloud.model.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);
	
	

}
