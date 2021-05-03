package gameSalesProject;


public class GamerWithVerificationManager extends BaseGamerManager {
	
	GamerCheckManager checkManager = new GamerCheckManager();
	public void add(Gamer gamer) {
		if(checkManager.checkCustomer(gamer)) {
			
		
		System.out.println("Oyuncu eklendi  : " + gamer.firstName);
		} else {
			System.out.println("Doğrulama yapılamadı oyuncu eklenmedi  : " + gamer.firstName );
		}
}


}
