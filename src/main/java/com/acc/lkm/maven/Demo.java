package com.acc.lkm.maven;

public class Demo {

	int id;
	String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		
		demo.setId(01);
		demo.setName("Srijeeta");
		
		System.out.println("Demo:"+demo.getId()+"\n"+demo.getName());

	}

}
