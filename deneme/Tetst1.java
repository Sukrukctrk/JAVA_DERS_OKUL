public class Tetst1 {

	public static void main(String[] args) {
		Calisan1 c1= new Calisan1("Ahmet Mehmet",5824,"umit.senturk@ibu.edu.tr");
		c1.Giris();

	
	
		Akedemisyen1 c2= new Akedemisyen1("bilgisayar müh", "denetim ", "zor", "Ahmet Mehmet",5824,"umit.senturk@ibu.edu.tr");
		c2.Giris();

		System.out.println(c2.getSicilno());
	}

}

