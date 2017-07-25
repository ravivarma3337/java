package molmor;

class Vehicle2{
	public void veh(){
        System.out.println("hatchback");
    }
	
	public void veh(String name) {
		System.out.println(name);
	}
	
	public void veh(int vehNumber) {
		System.out.println(vehNumber);
	}
	
	public void veh(Long model) {
		System.out.println(model);
	}
	
}

class Test{
	public void meth() {
	Vehicle2 v = new Vehicle2();
	v.veh();
	v.veh("Car");
	v.veh(1234);
	v.veh(2017l);
	}
}

public class OverloadingTest {
	public static void main(String[] args) {
		Test t = new Test();
		t.meth();
	}
	
}
