import java.io.BufferedReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String nom = "rom�o" ;
		String surnom = nom;
		String renom = new String(nom) ;
		
		System.out.println(nom == surnom);
		System.out.println(nom == renom);
		System.out.println(renom == "rom�o");
		System.out.println(nom.equals(renom));
		System.out.println("rom�o".equals(renom));
		System.out.println(surnom.equals("rom�o"));
		
		Personnage rom�o = null;
		Personnage juliette = null;
		Personnage[] acte2scene2 = {rom�o, juliette,} ;
		
		
		System.out.println(acte2scene2.length);
		
			java.math.BigDecimal value = new java.math.BigDecimal("10");
			java.math.BigDecimal anotherValue = new java.math.BigDecimal("20");
			value.add(anotherValue) ;
			System.out.println(value) ; // message 1
			
			byte b = 0;
			Short s = 0;
			char c = '0';
			int i = 0;
			showShort((short)'1');
			
			boolean valeur = false;
			if(!valeur) System.out.println("pas ok");
			
			 
			
			
//			BufferedReader bufr = null ;
//			// initialisations diverses
//			try {
//				if(bufr.readLine() == null) {
//				// ici code qui arr�te
//				}
//				else if(bufr.readLine().equals("STOP")) {
//				// aure code qui arr�te
//				} else {
//				System.out.println(bufr.readLine()) ;
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			
			
			
	}
	
	public static void showShort(short sh) {
		System.out.println(sh);
	}

}
