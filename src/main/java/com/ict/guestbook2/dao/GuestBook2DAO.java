package com.ict.guestbook2.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ict.guestbook2.dao.GuestBook2DAO;

public class GuestBook2DAO {
	private static final Logger logger = LoggerFactory.getLogger(GuestBook2DAO.class);
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
	public List<GuestBook2VO> getGuestBook2List(){
		try {
			return sqlSessionTemplate.selectList("guestbook2.list");
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
