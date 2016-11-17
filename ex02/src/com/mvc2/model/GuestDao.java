package com.mvc2.model;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import sun.security.util.Password;

public class GuestDao {
	

	private String driver;
	private String user;
	private String url;
	private String Password;
	
	
	
	
	public GuestDao(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			DriverManager.getConnection(url, user, Password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<GuestVo> selectAll(){
		ArrayList<GuestVo> list = new ArrayList<GuestVo>();
		
		return list;
	}
	public void insertOne(GuestVo vo){
		
	}
	
	public GuestVo selectOne(int sabun){
		GuestVo vo = null;
		return vo;
	}
	
	public void updateOne(GuestVo vo){
		
	}
	public void deleteOne(int sabun){
		
	}
	
}
