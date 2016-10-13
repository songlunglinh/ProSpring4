package com.pvthuan.utils;

public class CheckFile {
	public static boolean isCheck(String file){
		return (file!=null) && file.toLowerCase().endsWith("img");
	}
	public static void main(String[] args) {
		if(isCheck("tos.img")) {
			System.out.println("nothing");
		} else {
			System.out.println("hello");
		}
	}
}
