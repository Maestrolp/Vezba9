package zadaca2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import zadaca1.XML;

public class Glavna {

	public static void main(String[] args) {
		
		List<Vraboten> v = new ArrayList<Vraboten>();
		
		v.add(new Vraboten ("Stefan","Stefanovski","10000"));
		v.add(new Vraboten ("Aleksandar","Ristevski","15000"));
		
		XML xml = new XML ();
		xml.kreirajXMLdokument("xml21.xml", v);

	}

}
