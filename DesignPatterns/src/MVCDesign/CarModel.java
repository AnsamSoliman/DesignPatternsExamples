package MVCDesign;

public class CarModel {
  String CarName;
  String CarCompany;
  public CarModel(){
	 this.CarName=null;
	 this.CarCompany=null;
  }
public String getCarName() {
	return CarName;
}
public void setCarName(String carName) {
	CarName = carName;
}
public String getCarCompany() {
	return CarCompany;
}
public void setCarCompany(String carCompany) {
	CarCompany = carCompany;
}
  
}
