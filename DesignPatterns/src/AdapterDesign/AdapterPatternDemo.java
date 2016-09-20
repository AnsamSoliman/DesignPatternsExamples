package AdapterDesign;

public class AdapterPatternDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArabPer arP=new ArabPer();
		EngPers enP=new EngPers();
	    AmericanLang AdapterArab= new AdapterArab(arP);
		arP.Language();
		enP.EnLanguage();
	    AdapterArab.EnLanguage();

	}

}
