package mypack;

public class Taxi extends Vehicle implements Stopable{

	public Taxi(int crewNum) {
		this.crewNum = crewNum;
	}
	
	@Override
	public void showCrewNum() {
		System.out.println("タクシーの乗客：" + crewNum);
	}
	@Override
	public void stop() {
		System.out.println("ここでおります");
	}

}
