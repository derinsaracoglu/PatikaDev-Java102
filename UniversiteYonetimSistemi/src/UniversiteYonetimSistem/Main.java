package UniversiteYonetimSistem;

public class Main {

	public static void main(String[] args) {
		
		Calisan c1 = new Calisan("Derin", "123456", "derin@gmail.com");
        c1.giris();
        
        Memur m1 = new Memur("Ali","123456", "ali@gmail.com", "B�ro amiri", 8);
	    m1.calis();
	    
	    Akademisyen a1 = new Akademisyen("Veli", "123456", "veli@gmail.com", "Resim", "��retim g�revlisi");
	    a1.derseGir();
	    
	    GuvenlikGorevlisi g1 = new GuvenlikGorevlisi("Emre", "123456", "emre@gmail.com", "guvenlik", 12, "sertifika123123");
	    g1.nobet();
	    
	    Bilgi�slem bil = new Bilgi�slem("Hakan", "123456", "hakan@gmail.com", "bilgi islem", 8, "sertifika123123");
	    bil.networkKurulum();
	    
	    Asistan as1 = new Asistan("Ay�e", "123456", "ayse@gmail.com", "fizik","asistan" , 8);
	    as1.quizYap();
	    
	    OgretimGorevlisi og1 = new OgretimGorevlisi("Merve", "123456", "merve@gmail.com", "diferansiyel","ogretim gorevlisi" , 1);
	    og1.sinavYap();
	    
	    LabAsistan� lab1 = new LabAsistan�("Murat", "123456", "murat@gmail.com", "fizik","lab asistan�" , 4);
	    lab1.derseGir();
	}

}
