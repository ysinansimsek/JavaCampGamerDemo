package gameSalesProject;

public class BaseSaleManager implements ISaleManager {

	@Override
	public void sellGame(Gamer gamer) {
		System.out.println("Oyun satışı yapıldı  : " + gamer.firstName);
		
	}
	

}
