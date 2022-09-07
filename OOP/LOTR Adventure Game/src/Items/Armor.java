package Items;

public class Armor {
	
	private String name;
    private int id;
    private int resistence;
    private int price;
	
    public Armor(String name, int id, int resistence, int price) {
		
		this.name = name;
		this.id = id;
		this.resistence = resistence;
		this.price = price;
	}
    
    public static Armor[] armors() {
    	Armor[] armorList = new Armor[3];
    	armorList[0] = new Armor("Bronz Zýrh",1,10,30);
    	armorList[1] = new Armor("Gümüþ Zýrh",2,20,40);
    	armorList[2] = new Armor("Altýn Zýrh",3,30,50);
    	System.out.println("");
    	return armorList;
    }
    
    public static Armor getArmorObjByID(int id) {
    	for(Armor w : Armor.armors() ) {
    		if(w.getId()== id) {
    			return w;
    		}
    	}
    	return null;
    }
    

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getResistence() {
		return resistence;
	}

	public void setResistence(int resistence) {
		this.resistence = resistence;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
