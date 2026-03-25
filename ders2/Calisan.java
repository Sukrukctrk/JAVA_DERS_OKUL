
public class Calisan {
	protected String AdSoyad;
	protected int Telefon;
	protected String Email;
	public Calisan(String adSoyad, int telefon, String email) {
		
		AdSoyad = adSoyad;
		Telefon = telefon;
		Email = email;
	}
	
	public void Giris() {
		System.out.println(AdSoyad+" giriş yaptı.");
	}
	public void Cikis() {
		System.out.println(AdSoyad+" çıkış yaptı.");
	}
	public void Yemek() {
		System.out.println(AdSoyad+" yemek yedi.");
	}

	protected String getAdSoyad() {
		return AdSoyad;
	}

	protected void setAdSoyad(String adSoyad) {
		AdSoyad = adSoyad;
	}

	protected int getTelefon() {
		return Telefon;
	}

	protected void setTelefon(int telefon) {
		Telefon = telefon;
	}

	protected String getEmail() {
		return Email;
	}

	protected void setEmail(String email) {
		Email = email;
	}
	
	
}
