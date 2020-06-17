import java.util.*;

import javax.swing.JOptionPane;

class vehicle {
	protected String brand = "Mazda";
	public void honk() {
		System.out.println("Tuut, tuut!");		
	}
	public void lionType(String perform) {
		String modelType = "";
		
		switch (perform) {
		case "low":
			modelType = "CX-3";
			break;
		case "average":
			modelType = "CX-5";
			break;
		case "above average":
			modelType = "CX-7";
			break;
		default:
			modelType = "Invaild performance";
			break;
		}		
		System.out.println("Type: "+modelType);
	}
}

class Car extends vehicle {
	private String modelName = "CX";
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.honk();
		String perform = JOptionPane.showInputDialog("Performance: (low / average / above average)", "");
		System.out.println(myCar.brand+" "+myCar.modelName);
		myCar.lionType(perform);
		
		Ford myFord = new Ford();
		System.out.println(myFord.toString());
	}
}

class Ford extends vehicle {
	
	public Ford() {
		fbrand = "Ford";
		// TODO Auto-generated constructor stub
	}
	
	public String getFbrand() {
		return fbrand;
	}

	public void setFbrand(String fbrand) {
		Ford.fbrand = fbrand;
	}

	private static String fbrand;
	private String[] arr = new String[] {"F-150", "F-250", "F-350", "F-450"};
	
	public String toString() {
		return fbrand +" "+ arr[3];
	}	
}