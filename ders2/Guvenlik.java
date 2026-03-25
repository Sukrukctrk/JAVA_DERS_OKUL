
public class Guvenlik extends Memur {
	protected String belge;

	public Guvenlik(String adSoyad, int telefon, String email, String departman, String mesai, String belge) {
		super(adSoyad, telefon, email, departman, mesai);
		this.belge = belge;
	}

	protected String getBelge() {
		return belge;
	}

	protected void setBelge(String belge) {
		this.belge = belge;
	}
	
}
