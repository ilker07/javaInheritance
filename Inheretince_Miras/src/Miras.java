
public class Miras {

	public static void main(String[] args)
	{
		Calisan isci1=new Calisan("ilker", "M�hendis", 3000);
		Yonetici yonetici=new Yonetici("Mustafa", "Patron", 7000,10);
		isci1.bilgiGoster();
		yonetici.bilgiGoster();
		yonetici.maasArtt�r(100);
		
		
		System.out.println(yonetici);
		
		Calisan isci2=new Yonetici("Aykut","�retim",2500,2);// Polymorphism.Alt s�n�f �st s�n�f kullan�m�.Y�netici clas�na g�re davran�r.
		isci2.bilgiGoster();
		
	}

}
