package AdvancedConcept;

public class RaghuCars implements Car{

	public static void main(String[] args) {
		RaghuCars rc=new RaghuCars();
		rc.start();
		rc.Accel();
		rc.Stop();
		rc.Horn();
		
		Car c=new RaghuCars();
		c.start();
		c.Accel();
		c.Stop();

	}

	public void start() {
	System.out.println("Start the Car");	
		
	}
	public void Accel() {
		System.out.println("Accel the Car");
		
	}
	public void Stop() {
		System.out.println("Stop the Car");
		
	}
	public void Horn() {
		System.out.println("Horn the Car");
		
	}

}
