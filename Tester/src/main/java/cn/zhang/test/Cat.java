package cn.zhang.test;

public class Cat extends Animal{
	public Cat() {
		System.out.println("�?");
	}
	int num=80;
	static int age=90;
	String name="tomcat";
	@Override
	public void eat() {
		System.out.println("猫在吃饭");
	}
	public static void sleep(){
		System.out.println("猫在睡觉");
	}
	public void catchMouse(){
		System.out.println("猫在抓�?�鼠");
	}
}
