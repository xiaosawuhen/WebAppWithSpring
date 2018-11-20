package com.cn.db.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.db.model.Persion;

public interface PersionMapper {

	Persion selectPersion(Integer id);

	List<Persion> selectPersionList();
	
	Integer insert(Persion persion);
	
	Integer updateById(Persion persion);
	
	Integer deleteById(@Param("id") Integer id);
}
