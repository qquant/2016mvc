package com.mvc2.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvc2.model.GuestDao;

public class ListController implements CMDimp{

	public String execute(HttpServletRequest request, HttpServletResponse response){
		System.out.println("POJO 클래스 실행-list");
		

		GuestDao dao = null;
		request.setAttribute("list", dao.selectAll());
		
		
		return "list";
	}


	
	
}
