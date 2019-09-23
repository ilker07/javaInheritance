
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
		System.out.println("Ýsim: "+this.ad);
		System.out.println("Bölüm: "+this.bolum);
		System.out.println("Maaþ: "+this.maas);
	}	

}
