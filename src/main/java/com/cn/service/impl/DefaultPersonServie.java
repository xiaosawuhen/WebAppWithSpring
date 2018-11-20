package com.cn.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.db.dao.PersionMapper;
import com.cn.db.model.Persion;
import com.cn.service.PersonServie;

@Service("personServie")
public class DefaultPersonServie implements PersonServie{
	
	@Autowired
	PersionMapper persionMapper; 

	public Persion getPersionById(Integer id) {
		return persionMapper.selectPersion(id);
	}

	public List<Persion> getAllPersion() {
		return persionMapper.selectPersionList();
	}

	public Integer addPersion(Persion persion) {
		return persionMapper.insert(persion);
	}

	public Integer updatePersionById(Persion persion) {
		return persionMapper.updateById(persion);
	}

	public Integer deletePersionById(Integer id) {
		return persionMapper.deleteById(id);
	}

}
