package cn.zhang.test;

public class DemoTest {
	public static void main(String[] args) {
		Animal am=new Cat();
		am.eat();
		am.sleep();
		am.run();
		
		System.out.println(am.num);
		System.out.println(am.age);
		System.out.println("------------------");
		Cat cat=(Cat) am;
		cat.eat();
		cat.sleep();
		cat.run();
		cat.catchMouse();
		
		System.out.println(cat.num);
		System.out.println(cat.age);
	}
}
