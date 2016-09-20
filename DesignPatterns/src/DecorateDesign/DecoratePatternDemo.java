package DecorateDesign;
public class DecoratePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coffee espresso=new Espresso();
		Coffee Mocha=new MochaCoffee(new Espresso());
		espresso.Description();
		Mocha.Description();

	}

}
