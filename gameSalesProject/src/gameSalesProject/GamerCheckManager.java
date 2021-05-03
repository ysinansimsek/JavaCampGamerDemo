package gameSalesProject;

public class GamerCheckManager implements IGamerCheckService {

	@Override
	public boolean checkCustomer(Gamer gamer) {
		System.out.println("Mernis Servisi Çağrıldı");
		return true;
	}
	

}
