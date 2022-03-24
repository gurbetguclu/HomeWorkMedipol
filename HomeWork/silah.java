package HomeWork;

public class silah {
	
	sarjor sarjor;
	
	int menzil;


	public sarjor getSarjor() {
		
		var info="menzil:"+menzil;
		 
		 if(sarjor!=null) {
			 info+="MermiSayısı:"+sarjor.mermiSayisi+"Mermi Kapasitesi"+sarjor.mermiKapasite;
			 
		 }
		return sarjor;
	}

	public void setSarjor(sarjor sarjor) {
		this.sarjor = sarjor;
	}

	public silah(int menzil) {//etkin menzili alan kurucu
		
		this.menzil = menzil;
	}
	
	public 	int birElAtesEt(int menzil) {
		
		this.menzil=menzil;
		
		return menzil;
		
	}
	public int silahDoldur(){//silahı yeniden doldurmaya yarayan method
		
		
		if(sarjor.mermiSayisi<=0) {
			
			sarjor.sarjorDoldur(sarjor.mermiSayisi );
			
		//	if (sarjor.mermiSayisi==sarjor.mermiKapasite) {
				
			//	break;
				
		//	}
				
			
		}
		return sarjor.mermiSayisi ;
		
		}
	
	}
	

