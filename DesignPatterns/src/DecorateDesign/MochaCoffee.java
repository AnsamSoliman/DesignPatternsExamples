package DecorateDesign;





public class MochaCoffee extends DecorateCoffee {

	public MochaCoffee(Coffee c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	public void Description() {
		// TODO Auto-generated method stub
		
		DCoffee.Description();
		AddMilk();
		
	}

	private void AddMilk() {
		// TODO Auto-generated method stub
		System.out.println("pluse add hot Milk So,it's Mocha");
		
	}

}
