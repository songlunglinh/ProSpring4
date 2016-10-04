package com.pvthuan.spring4.ch4.kindergarten;

import java.util.ArrayList;
import java.util.List;
import com.pvthuan.spring4.ch4.Food;
import com.pvthuan.spring4.ch4.FoodProviderService;

public class FoodProviderServiceImpl implements FoodProviderService {
	@Override
	public List<Food> provideLunchSet() {
		List<Food> lunchSet = new ArrayList<Food>();
		lunchSet.add(new Food("Milk"));
		lunchSet.add(new Food("Biscuits"));
		return lunchSet;
	}
}