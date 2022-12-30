package primer1;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Xml {
	public void kreirajXMLdokument (String fileName)
	{
		try
		{
			// kreiranje na dokument
			DocumentBuilderFactory documentBuilderFactory = 
					DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder =
					documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.newDocument();
			
			// Kreiranje na elementi na dokumentot
			// Kreiranje na root elementot
			Element root = document.createElement("Student");
			document.appendChild(root);
			
			// Kreiranje na elementot - ime
			Element ime = document.createElement("Ime");
			root.appendChild(ime);
			
			// Kreiranje na elementot - prezime
			Element prezime = document.createElement("Prezime");
			root.appendChild(prezime);
			
			// Kreiranje na elementot - index
			Element index = document.createElement("Index");
			root.appendChild(index);
			
			// Dodeluvanje vrednosti
			ime.appendChild(document.createTextNode("Petar"));
			prezime.appendChild(document.createTextNode("Petrov"));
			index.appendChild(document.createTextNode("101"));
			
			TransformerFactory transformerFactory = 
					TransformerFactory.newInstance();
			Transformer transform = 
					transformerFactory.newTransformer();
			DOMSource izvor = new DOMSource(document);
			// Fajl
			StreamResult rezultat = new StreamResult(new File(fileName));
			// Konzola
			StreamResult rezultat1 = new StreamResult(System.out);
			
			transform.transform (izvor,rezultat);
			System.out.println("Fajlot e kreiran, imeto e " +fileName);
			
			System.out.println(rezultat1);
			
			System.out.println("Fajlot e zacuvan.");
			}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}

}
