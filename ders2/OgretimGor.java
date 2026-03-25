
public class OgretimGor extends Akademisyen {
	protected String unvan;

	public OgretimGor(String adSoyad, int telefon, String email, String bolum, String gorev, String dersler,
			String unvan) {
		super(adSoyad, telefon, email, bolum, gorev, dersler);
		this.unvan = unvan;
	}
	
	protected void DerseGir() {
		System.out.println(getUnvan()+ " "+ getAdSoyad()+ " derse girdi.");
	}

	protected String getUnvan() {
		return unvan;
	}

	protected void setUnvan(String unvan) {
		this.unvan = unvan;
	}
	
}
