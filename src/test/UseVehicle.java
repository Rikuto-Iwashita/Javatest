package test;
import mypack.Bus;
import mypack.Stopable;
import mypack.Taxi;
import mypack.Vehicle;

public class UseVehicle {

	public static void main(String[] args) {
		Vehicle[] v = new Vehicle[2];
		v[0] = new Taxi(3);
		v[1] = new Bus(15);
		
		for(int i = 0; i < v.length; i++) {
			v[i].showCrewNum();
			if(v[i] instanceof Stopable) {
				Stopable s = (Stopable)v[i];
				s.stop();
			}
		}
	}

}
