package FacadDesign;

public class Facad {
	private Facebook fb;
	private Instagram in;
	private Twitter tw;
	
	public Facad(){
		fb= new Facebook();
		in=new Instagram();
		tw=new Twitter();
		
		
		
	}
	public void printFacebook(){
		fb.printType();
	}
	public void printInstagram(){
		in.printType();
	}
	public void printTwitter(){
		tw.printType();
	}
}
