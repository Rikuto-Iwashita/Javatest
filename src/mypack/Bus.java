package mypack;

public class Bus extends Vehicle implements Stopable{

	public Bus(int crewNum) {
		this.crewNum = crewNum;
	}
	
	@Override
	public void showCrewNum() {
		System.out.println("バスの乗客：" + crewNum);
	}
	@Override
	public void stop() {
		System.out.println("次止まります");
	}

}
