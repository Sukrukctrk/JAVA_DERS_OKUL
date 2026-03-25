
public class Tetst {

	public static void main(String[] args) {
		Calisan c1= new Calisan("Ahmet Mehmet",5824,"umit.senturk@ibu.edu.tr");
		c1.Giris();
		Akademisyen a1=new Akademisyen("Hasan", 5825, "h@gmail.com", "Bil Müh.", "Akademisyen.","OOP");
		a1.DerseGir();
		a1.Giris();
		OgretimGor o1=new OgretimGor("Hüseyin",5826,"hu@gmail.com","Bil Müh.", "Akademisyen.","C++","Prof. Dr." );
		System.out.println(o1.getUnvan()+ " "+ o1.getAdSoyad()+" "+ o1.getTelefon()+ " "+ o1.getGorev());
		o1.Giris();
		o1.setSicilNo(122124455);
		System.out.println("Sicil no: "+ o1.getSicilNo());

	}

}
