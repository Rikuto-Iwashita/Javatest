package test;

class Animal {
	public String name;
	public int age;
	
	public void showprofile() {
		System.out.println("名前は" + name + "、" + age + "歳です");
	}
	public void Speak() {
		System.out.println("......");
	}
}

class Cat extends Animal{
	public void Sleep() {
		System.out.println("スースー");
	}
	public void Speak() {
		System.out.println("にゃー");
	}
}
class Dog extends Animal {
	public void Run() {
		System.out.println("トコトコ");
	}
	public void Speak() {
		System.out.println("ワンワン");
	}
}