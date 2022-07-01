package UniversiteYonetimSistem;

public class BilgiÝslem extends Memur {
	private String gorev;

	public BilgiÝslem(String adSoyad, String telefon, String eposta, String departman, int mesai, String gorev) {
		super(adSoyad, telefon, eposta, departman, mesai);
		this.gorev=gorev;
	}

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}
	
	public void networkKurulum() {
		System.out.println(this.getAdSoyad() + " kurulumu yaptý.");
	}
}
