package UniversiteYonetimSistem;

public class LabAsistanư extends Asistan {

	public LabAsistanư(String adSoyad, String telefon, String eposta, String bolum, String unvan, int ofisSaati) {
		super(adSoyad, telefon, eposta, bolum, unvan, ofisSaati);
		
	}
	
	public void lablaraGir() {
		System.out.println(this.getAdSoyad() + " laba girdi");
	}
	
	public void derseGir() {
		System.out.println(this.getAdSoyad() +" "+ this.getBolum() + " dersine girdi.");
	}

}
