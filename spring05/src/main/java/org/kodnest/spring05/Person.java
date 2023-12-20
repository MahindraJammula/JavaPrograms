package org.kodnest.spring05;

public class Person {

	String name;
	int age;
	Mobile mobile;

	public Person() {
		super();
		System.out.println("--->No Argu Constructor");
	}

	public Person(String name, int age, Mobile mobile) {
		super();
		this.name = name;
		this.age = age;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("---->Name");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		System.out.println("------>age");
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
		System.out.println("-------->Mobile");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", mobile=" + mobile + "]";
	}

}
