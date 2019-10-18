package com.example.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Controller 
{

	@Autowired
    private Jpainterface jpainterface;
	@GetMapping(value="/charts")
	public ArrayList<Integer> post()
	  {
		    ArrayList<Integer> list = new ArrayList<Integer>();
		    list.add(jpainterface.billing());
		    list.add(jpainterface.plumbing());
		    return list;
	  }
}
