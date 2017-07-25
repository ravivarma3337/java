package molmor;

class Vehicle{
    public void veh(){
        System.out.println("hatchback");
    }
}
class Truck extends Vehicle{
    public void veh1(){
        System.out.println("sedan");
    }
 
    public void veh(){
        System.out.println("suv");
    }
}
 class Test1{
	 public void meth() {
		 Vehicle car = new Vehicle();
	    	car.veh();
	        Vehicle car1 = new Truck();
	        car1.veh();
	 }
 }
public class OverridingTest{
    public static void main(String [] args){
        Test1 t = new Test1();
        t.meth();
    }
}