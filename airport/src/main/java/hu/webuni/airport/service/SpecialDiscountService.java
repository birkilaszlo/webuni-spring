package hu.webuni.airport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import hu.webuni.airport.config.AirportConfigProperties;

@Service
public class SpecialDiscountService implements DiscountService{

	@Autowired
	AirportConfigProperties config;
	
	@Override
	public int getDiscountPercent(int totalPrice) {
		return totalPrice > config.getDiscount().getSecial().getLimit()
				? config.getDiscount().getSecial().getPercent()
				: config.getDiscount().getDef().getPercent();
				
	}

}
