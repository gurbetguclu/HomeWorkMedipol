package HomeWork;


public class sarjor {
	
	int mermiSayisi;	
	int mermiKapasite;
	


	
	public sarjor(int mermiSayisi, int mermiKapasite) {//tek kurucu
	
			this.mermiSayisi = mermiSayisi;
			this.mermiKapasite = mermiKapasite;
		

	}
	public int mermiAtesle(int mermiSayisi) {//mermi ateşleyen method
	
		mermiSayisi--;
	
	return mermiSayisi;
	
}
	public int sarjorDoldur(int mermiSayisi) {//Şarjörü doldurmaya yarayan method
		
	
		if(mermiSayisi<=mermiKapasite) {
			mermiSayisi++;
			
		}
		
	
		return mermiSayisi;

}
}
