package com.cn.db.dao;

import com.cn.db.model.Persion;

public interface PersionMapper {

	Persion selectPersion(Integer id);
	
	void insert(Persion persion);
}
