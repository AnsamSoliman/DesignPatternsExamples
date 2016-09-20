package FactoryDesign;




public class FactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SocialMediaFactory socialFactory=new SocialMediaFactory ();
		
		SocialMedia social_1=socialFactory.getSocialType("Facebook");
		social_1.print();
		
		SocialMedia social_2=socialFactory.getSocialType("instagram");
		social_2.print();
        
		SocialMedia social_3=socialFactory.getSocialType("Twitter");
		social_3.print();
	}

}
