
public class Verihazirlama extends Memur {
	protected String gorev;

	public Verihazirlama(String adSoyad, int telefon, String email, String departman, String mesai, String gorev) {
		super(adSoyad, telefon, email, departman, mesai);
		this.gorev = gorev;
	}
	
	protected String getGorev() {
		return gorev;
	}

	protected void setGorev(String gorev) {
		this.gorev = gorev;
	}

	protected void Yazisma() {
		System.out.println(getDepartman()+ " "+getGorev()+" "+ getAdSoyad()+" yazışma yaptı.");
	}
}
