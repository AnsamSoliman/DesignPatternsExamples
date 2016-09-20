package DecorateDesign;





public abstract class DecorateCoffee implements Coffee {
protected Coffee DCoffee;

    public DecorateCoffee(Coffee c){
    	this.DCoffee=c;
    }
	public void Description() {
		// TODO Auto-generated method stub
		
		DCoffee.Description();
		
	}

}
