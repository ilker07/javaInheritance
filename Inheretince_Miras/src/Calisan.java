
public class Calisan {
	
	
	private String ad;
	private String bolum;
	private int maas;
	public Calisan(String ad, String bolum, int maas) {
		
		this.ad = ad;
		this.bolum = bolum;
		this.maas = maas;
	}
	
	void bilgiGoster()
	{
		System.out.println("�sim: "+this.ad);
		System.out.println("B�l�m: "+this.bolum);
		System.out.println("Maa�: "+this.maas);
	}	

}
