
public class Asistan extends Akademisyen {
	protected String yuksekOrg;

	public Asistan(String adSoyad, int telefon, String email, String bolum, String gorev, String dersler,
			String yuksekOrg) {
		super(adSoyad, telefon, email, bolum, gorev, dersler);
		this.yuksekOrg = yuksekOrg;
	}

	protected String getYuksekOrg() {
		return yuksekOrg;
	}

	protected void setYuksekOrg(String yuksekOrg) {
		this.yuksekOrg = yuksekOrg;
	}
	protected void LabaGir() {
		System.out.println(getYuksekOrg()+ " "+ getAdSoyad()+" laba girdi.");
	}
	
}
