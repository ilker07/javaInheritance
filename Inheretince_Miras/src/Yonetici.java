
public class Yonetici extends Calisan{

	
	
	private int sorumlu_kisi;
	public Yonetici(String ad, String bolum, int maas,int sorumlu) {//Normalde extends olduüu için sorumlu özelliði yoktu.Sorumlu inti kendine özgü özellil.
		super(ad, bolum, maas);//Normal classlarda this ile olur.Ama bu extends ile olduüðu için super ile çaðrýþýr.
		
		this.sorumlu_kisi=sorumlu;
	}
	
	public void maasArttýr(int miktar)
	{
		System.out.println("Calýþanlara "+miktar+" TL zam yapýldý");
	}

	@Override  //çalýþan sýnýfýndaki bu methodu iptal edip kendi methodumuz.
	void bilgiGoster() {
		// TODO Auto-generated method stub
		super.bilgiGoster();//Super classý olan çalýþandan bu methodu aldý.
		System.out.println("Sorumlu kiþi sayýsý: "+this.sorumlu_kisi);
	}

	@Override
	public String toString() { //Normal tostring i iptal ettik.
		
		return "Manager objesi";
	}

}
