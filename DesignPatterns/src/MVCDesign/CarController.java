package MVCDesign;

public class CarController {
	CarModel model;
	CarView view;
	public CarController(CarModel m,CarView v){
		this.model=m;
		this.view=v;
	}
	
	public void setCarName(String s){
		model.setCarName(s);
	}
	
	public String getCarName(){
		return model.getCarName();
	}
	
	public void setcarCompany(String s){
		model.setCarCompany(s);
	}
	public String getcarCompany(){
		return model.getCarCompany();
	}
	
	public void PrintCarInformation(){
		view.printCarInfo(getCarName(),getcarCompany());
	}
	

}
