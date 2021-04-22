package zohoInterviewQstns;

class Auto {
	void drive(Auto a) {
		System.out.println("A drives");
	}
}

class Car extends Auto {
	void drive(Car a) {
		System.out.println("ACAr drives");
	}
}

class Tesla extends Car {
	void drive(Tesla a) {
		System.out.println("Tes drives");
	}
}

public class Inter19012021 {
	
	public void run(Object obj) {
		System.out.println("Obj run");
	}
	
	public void run(String obj) {
		System.out.println("run");
	}
	public static void main(String[] args) {
		Inter19012021 sd = new Inter19012021();
		Auto a = new Tesla();
		Car cx = new Tesla();
		Integer c = null;
		cx.drive(a);
		sd.run("a");
		sd.run(0);
		sd.run(0.0d);
		sd.run(new Integer(0));
		sd.run(null);
		sd.run(c);
	}

}
