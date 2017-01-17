package System.ObslugaKlienta.Klienci;

public class Klient {

	private String imie;
	private String nazwisko;
	private String email;
	private String telefon;
	private Adres adres;
	private String pesel;
	private boolean rabat;
	private boolean zbanowany;

	public String getImie() {
		return this.imie;
	}

	/**
	 * 
	 * @param imie
	 */
	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	/**
	 * 
	 * @param nazwisko
	 */
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getEmail() {
		return this.email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefon() {
		return this.telefon;
	}

	/**
	 * 
	 * @param telefon
	 */
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Adres getAdres() {
		return this.adres;
	}

	/**
	 * 
	 * @param adres
	 */
	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public String getPesel() {
		return this.pesel;
	}

	/**
	 * 
	 * @param pesel
	 */
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public boolean isRabar() {
		// TODO - implement Klient.isRabar
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rabat
	 */
	public void setRabat(boolean rabat) {
		this.rabat = rabat;
	}

	public boolean isZbanowany() {
		return this.zbanowany;
	}

	/**
	 * 
	 * @param zbanowany
	 */
	public void setZbanowany(boolean zbanowany) {
		this.zbanowany = zbanowany;
	}

}