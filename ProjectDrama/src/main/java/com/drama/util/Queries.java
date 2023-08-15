package com.drama.util;

public class Queries {

	
public static final String CREATEQUERY = "create table drama (dramaName varchar(20), dramaId integer primary key auto_increment,genre varchar(20), episodes integer,diction varchar(20),rating integer)";
public static final String INSERTQUERY="insert into drama(dramaName, genre ,episodes,diction,rating) values(?,?,?,?,?)";

			
public static final String UPDATEQUERY =
		            "update drama set diction=? where dramaId=?";
		    
		   
public static final String GETALLQUERY =
					"select * from drama ";

public static final String DELETEBYDRAMAID ="delete from drama where dramaId=?";
			
public static final String QUERYBYDICTION = "select * from drama where diction=?";
public static final String QUERYBYDICTIONRATING = "select * from drama where diction=? and rating=?";
public static final String QUERYBYDICTIONEPISODES = "select * from drama where diction=? and episodes=?";
public static final String QUERYBYDRAMAID ="select * from drama where dramaId=?";
					
					
					
					
				
					
}
