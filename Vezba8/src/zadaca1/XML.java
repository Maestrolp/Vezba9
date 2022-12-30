package zadaca1;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML {
	public void kreirajXMLdokument (String imeDatoteka, Vraboten vraboten)
	{
		try
		{
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder =documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			
			Element root = document.createElement("Vraboten");
			document.appendChild(root);
			Element ime = document.createElement("Ime");
			root.appendChild(ime);
			Element prezime = document.createElement("Prezime");
			root.appendChild(prezime);
			Element plata = document.createElement("Plata");
			root.appendChild(plata);
			
			ime.appendChild(document.createTextNode(vraboten.getIme()));
			prezime.appendChild(document.createTextNode(vraboten.getPrezime()));
			plata.appendChild(document.createTextNode(vraboten.getPlata()));
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transform = transformerFactory.newTransformer();
			DOMSource izvor = new DOMSource(document);
			StreamResult rezultat = new StreamResult(new File(imeDatoteka));
			transform.transform (izvor,rezultat);
			System.out.println("Fajlot e kreiran, imeto e " +imeDatoteka);
			System.out.println("Fajlot e zacuvan.");
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}

}
