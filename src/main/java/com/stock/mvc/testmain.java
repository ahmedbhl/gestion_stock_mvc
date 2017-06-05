package com.stock.mvc;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.stock.mvc.dao.impl.FlickrDaoImpl;

public class testmain {

	public static void main(String[] args) {

		// f.auth();

		FlickrDaoImpl f = new FlickrDaoImpl();
		InputStream s;
		try {
			s = new FileInputStream(new File("D:\\iphone.png"));
			f.savePhoto(s, "iphone");
			System.out.println("ok");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
