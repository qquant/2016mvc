package com.mvc2.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddController implements CMDimp{

	public String execute(HttpServletRequest request, HttpServletResponse response){
		System.out.println("POJO Ŭ���� ����-add");
		
		
		
		return "form";
	}


	
	
}
