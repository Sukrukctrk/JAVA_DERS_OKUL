
public class Memur extends Calisan implements Devlet {
	protected String departman;
	protected String mesai;
	protected int sicilNo;
	public Memur(String adSoyad, int telefon, String email, String departman, String mesai) {
		super(adSoyad, telefon, email);
		this.departman = departman;
		this.mesai = mesai;
	}
	protected String getDepartman() {
		return departman;
	}
	protected void setDepartman(String departman) {
		this.departman = departman;
	}
	protected String getMesai() {
		return mesai;
	}
	protected void setMesai(String mesai) {
		this.mesai = mesai;
	}
	protected void Calis() {
		System.out.println(getDepartman()+" "+ getAdSoyad()+" "+ getMesai()+ " çalışıyor.");
	}
	public int getSicilNo() {
		return sicilNo;
	}
	public void setSicilNo(int sicilNo) {
		this.sicilNo=sicilNo;
	}

}
