package SingltonDesign;

public class Singlton {
	private static Singlton s=new Singlton();
	private Singlton(){}
	public static Singlton getInstance(){
		
		return s;
	}
	public void print(){
		
		System.out.println("you get new instance");
	}
	

}
