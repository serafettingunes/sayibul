package sayibul;

public class Main {

	public static void main(String[] args) {
		
		sayiBul();

	}
	
	public static void sayiBul()
	{
		boolean varmi=false;
		int[] sayilar= {1,2,3,4,5};
		int aranansayi=5;
		for (int sayi : sayilar) {
			if (aranansayi==sayi) {
				varmi=true;
				break;
			}
		}
		
		if (varmi) {
			
			mesajVer(aranansayi);
		}
	}

	public static void mesajVer(int aranan) {
		System.out.println(aranan+" sayısı aranan sayıdır!!!");
	}
	
}
