package zadaca2;

import java.io.File;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XML {
	public void kreirajXMLdokument (String imeDatoteka, List<Vraboten> vraboten)
	{
		try
		{
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder =documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			
			Element root = document.createElement("Vraboteni");
			document.appendChild(root);
			
			for (Vraboten v : vraboten)
			{
				Element vrabotenElement = document.createElement("Vraboten");
				root.appendChild(vrabotenElement);
				
				Element ime = document.createElement("Ime");
				vrabotenElement.appendChild(ime);
				Element prezime = document.createElement("Prezime");
				vrabotenElement.appendChild(prezime);
				Element plata = document.createElement("Plata");
				
				ime.appendChild(document.createTextNode(v.getIme()));
				prezime.appendChild(document.createTextNode(v.getPrezime()));
				plata.appendChild(document.createTextNode(v.getPlata()));
			}
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
