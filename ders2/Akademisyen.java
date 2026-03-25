
public class Akademisyen extends Calisan implements Devlet {
	protected String bolum;
	protected String gorev;
	protected String dersler;
	protected int sicilNo;
	public Akademisyen(String adSoyad, int telefon, String email, String bolum, String gorev, String dersler) {
		super(adSoyad, telefon, email);
		this.bolum = bolum;
		this.gorev = gorev;
		this.dersler = dersler;
	}
	protected void DerseGir() {
		System.out.println(getGorev()+" "+getAdSoyad()+" "+ getDersler()+  " dersine girdi.");
	}
	protected String getBolum() {
		return bolum;
	}
	protected void setBolum(String bolum) {
		this.bolum = bolum;
	}
	protected String getGorev() {
		return gorev;
	}
	protected void setGorev(String gorev) {
		this.gorev = gorev;
	}
	protected String getDersler() {
		return dersler;
	}
	protected void setDersler(String dersler) {
		this.dersler = dersler;
	}
	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int sicilNo) {
		this.sicilNo=sicilNo;
	}
	public void Giris() {
		System.out.println(getGorev()+ " "+ getAdSoyad()+" giriş yaptı.");
	}
	
}
