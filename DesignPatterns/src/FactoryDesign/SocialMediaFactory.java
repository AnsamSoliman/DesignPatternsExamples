package FactoryDesign;



public class SocialMediaFactory {

	public SocialMedia getSocialType(String socialType) {
		// TODO Auto-generated method stub
		
		if(socialType==null)
		return null;
		
		if(socialType.equalsIgnoreCase("Facebook")){
			return new Facebook();
			
		}
		
		if(socialType.equalsIgnoreCase("Twitter")){
			return new Twitter();
			
		}
		
		if(socialType.equalsIgnoreCase("Instagram")){
			return new Instagram();
			
		}
		
	return null;
	}

}
