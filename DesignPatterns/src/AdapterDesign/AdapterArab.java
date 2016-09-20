package AdapterDesign;

public class AdapterArab  implements AmericanLang{
    ArabicLang AR;
    public AdapterArab (ArabicLang ar){
    	this.AR=ar;
    }

	public void EnLanguage() {
		// TODO Auto-generated method stub
	AR.Language();	
		
	}

}
