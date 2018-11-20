package com.cn.service;

import java.util.List;

import com.cn.db.model.Persion;

public interface PersonServie {

	Persion getPersionById(Integer id);
	
	List<Persion> getAllPersion();
	
	Integer addPersion(Persion persion);
	
	Integer updatePersionById(Persion persion);
	
	Integer deletePersionById(Integer id);
}
