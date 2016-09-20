package TemplateDesign;

public class TemplatePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Game game=new BasketBall();
		game.Template();
		
		game=new Football();
		game.Template();

	}

}
