package System.ObslugaKlienta.Klienci;

public class Adres {

	private String ulica;
	private String numerMieszkania;
	private int numerDomu;
	private String miejscowosc;
	private String kodPocztowy;

	public String getUlica() {
		return this.ulica;
	}

	/**
	 * 
	 * @param ulica
	 */
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public String getNumerMieszkania() {
		return this.numerMieszkania;
	}

	/**
	 * 
	 * @param numerMieszkania
	 */
	public void setNumerMieszkania(String numerMieszkania) {
		this.numerMieszkania = numerMieszkania;
	}

	public int getNumerDomu() {
		return this.numerDomu;
	}

	/**
	 * 
	 * @param numerDomu
	 */
	public void setNumerDomu(int numerDomu) {
		this.numerDomu = numerDomu;
	}

	public String getMiejscowowsc() {
		// TODO - implement Adres.getMiejscowowsc
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param miejscowosc
	 */
	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}

	public String getKodPocztowy() {
		return this.kodPocztowy;
	}

	/**
	 * 
	 * @param kodPocztowy
	 */
	public void setKodPocztowy(String kodPocztowy) {
		this.kodPocztowy = kodPocztowy;
	}

}