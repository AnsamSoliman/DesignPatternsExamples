package MVCDesign;

public class MVCPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 CarModel cm=new CarModel();
		 cm.setCarName("Mercedes-Benz");
		 cm.setCarCompany("Mercedes Company");
		 CarView cv=new CarView();
		 CarController cc=new CarController(cm,cv);
		 cc.PrintCarInformation();
		 
		 cm.setCarName("BMW");
		 cm.setCarCompany("BMW Company");
		 
		 cc.setCarName("BMW");
		 cc.setcarCompany("BMW Company");
		 cc.PrintCarInformation();
	}

}
