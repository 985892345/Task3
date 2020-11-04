package Lv4;

import java.lang.reflect.*;

public class Task3{
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException{
		String s = "123";
		Data data = new Data();
		Class getData = data.getClass();
		try{
			Field field = getData.getDeclaredField("data");
			field.setAccessible(true);
			if(field.getType().toString().endsWith("String")){
				System.out.println("该属性为String");
				field.set(data, s);
			}else if(field.getType().toString().endsWith("int")){
				System.out.println("该属性为int");
				field.set(data, Integer.parseInt(s));
			}
			data.print();
		}
		catch (NoSuchFieldException e){
			System.out.println("没有该名字的变量");
		}
	}
}

class Data{
	public int data;
	public void print(){
		System.out.println(data);
	}
}
