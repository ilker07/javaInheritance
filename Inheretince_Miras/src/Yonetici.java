
public class Yonetici extends Calisan{

	
	
	private int sorumlu_kisi;
	public Yonetici(String ad, String bolum, int maas,int sorumlu) {//Normalde extends oldu�u i�in sorumlu �zelli�i yoktu.Sorumlu inti kendine �zg� �zellil.
		super(ad, bolum, maas);//Normal classlarda this ile olur.Ama bu extends ile oldu��u i�in super ile �a�r���r.
		
		this.sorumlu_kisi=sorumlu;
	}
	
	public void maasArtt�r(int miktar)
	{
		System.out.println("Cal��anlara "+miktar+" TL zam yap�ld�");
	}

	@Override  //�al��an s�n�f�ndaki bu methodu iptal edip kendi methodumuz.
	void bilgiGoster() {
		// TODO Auto-generated method stub
		super.bilgiGoster();//Super class� olan �al��andan bu methodu ald�.
		System.out.println("Sorumlu ki�i say�s�: "+this.sorumlu_kisi);
	}

	@Override
	public String toString() { //Normal tostring i iptal ettik.
		
		return "Manager objesi";
	}

}
