package UniversiteYonetimSistem;

public class Memur extends Calisan {

	private String departman;
	private int mesai;
	
	public Memur(String adSoyad, String telefon, String eposta, String departman, int mesai) {
		super(adSoyad, telefon, eposta);
		this.departman = departman;
		this.mesai = mesai;
	}

	public String getDepartman() {
		return departman;
	}

	public void setDepartman(String departman) {
		this.departman = departman;
	}

	public int getMesai() {
		return mesai;
	}

	public void setMesai(int mesai) {
		this.mesai = mesai;
	}
	
	public void calis() {
		System.out.println(this.getAdSoyad() + " calismaya basladý.");
	}

}
