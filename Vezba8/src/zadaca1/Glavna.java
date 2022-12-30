package zadaca1;

public class Glavna {

	public static void main(String[] args) {
		Vraboten vraboten = new Vraboten();
		vraboten.setIme("Stefan");
		vraboten.setPrezime("Stefanovski");
		vraboten.setPlata("10000");
		
		XML xml = new XML ();
		xml.kreirajXMLdokument("src\\zadaca1\\imeDatoteka.xml", vraboten);

	}

}
