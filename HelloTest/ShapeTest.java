class rectangle implements Shape {
	float length, breath;

	rectangle(float l, float b) {
		this.length = l;
		this.breath = b;
	}

	public float getArea() {
		return length * breath;
	}
}

class circle implements Shape {
	float radius;

	circle(float r) {
		this.radius = r;
	}

	public float getArea() {
		return 3.14f * this.radius * this.radius;
	}
}

class triangle implements Shape {
	float height, breath;

	triangle(float h, float b) {
		this.height = h;
		this.breath = b;
	}

	public float getArea() {
		return (height * breath) / 2;
	}
}

public class ShapeTest {

	public static void main(String[] args) {
		rectangle r = new rectangle(2f, 3f);
		System.out.println(r.getArea());
		circle c = new circle(2f);
		System.out.println(c.getArea());
		triangle t = new triangle(2f, 3f);
		System.out.println(t.getArea());
	}
}
