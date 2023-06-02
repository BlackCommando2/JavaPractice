abstract class Animal{
	public String name;
	public int age;
	public abstract void makeSound();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

class Dog extends Animal{
	public void makeSound()
	{
		System.out.println("WOOOOOFFFFFFF");
	}
}

class Cat extends Animal{
	public void makeSound()
	{
		System.out.println("PURR....MEOW....");
	}
}

public class AnimalSound {

	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.setAge(1);
		d.setName("GULU");
		c.setAge(1);
		c.setName("CHOTU");
		d.makeSound();
		c.makeSound();
	}
}
