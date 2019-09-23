
public class Miras {

	public static void main(String[] args)
	{
		Calisan isci1=new Calisan("ilker", "Mühendis", 3000);
		Yonetici yonetici=new Yonetici("Mustafa", "Patron", 7000,10);
		isci1.bilgiGoster();
		yonetici.bilgiGoster();
		yonetici.maasArttýr(100);
		
		
		System.out.println(yonetici);
		
		Calisan isci2=new Yonetici("Aykut","Üretim",2500,2);// Polymorphism.Alt sýnýf üst sýnýf kullanýmý.Yönetici clasýna göre davranýr.
		isci2.bilgiGoster();
		
	}

}
