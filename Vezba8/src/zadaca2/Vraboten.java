package zadaca2;

public class Vraboten {
	private String ime;
	private String prezime;
	private String plata;
	
	public Vraboten (String ime, String prezime, String plata)
	{
		this.ime = ime;
		this.prezime = prezime;
		this.plata = plata;
	}
	
	public String getIme ()
	{
		return ime;
	}
	public String getPrezime ()
	{
		return prezime;
	}
	public String getPlata ()
	{
		return plata;
	}
	public void setIme(String ime)
	{
		this.ime = ime;
	}
	public void setPrezime(String prezime)
	{
		this.prezime = prezime;
	}
	public void setPlata(String plata)
	{
		this.plata = plata;
	}

}