package AdvancedConcept;

import AccessModifiers.DefaultExample;
import AccessModifiers.ProtectedExample;

public class RaghuTest extends RaghuNewCar{

	public static void main(String[] args) {
		RaghuTest rt=new RaghuTest();
		rt.start();
		rt.Accel();
		rt.Stop();
		
		DefaultExample de=new DefaultExample();
		//de.defaultTest();
		
		
	}
	
	
	public void Accel() {
		System.out.println("Accel");
		
	}

	
	public void Stop() {
		System.out.println("Stop");
		
	}

	


	

}
