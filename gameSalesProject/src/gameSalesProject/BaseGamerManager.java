package gameSalesProject;

public abstract class BaseGamerManager implements IBaseGamerManager {
	// Mernis Yapmadan Oyuncu eklenmek istenirse yeni bir class manager oluştur buradan inherit et bak keyfine :))
	
	public void add(Gamer gamer) {
		System.out.println("Oyuncu Mernis Yapılmadan Eklendi : " + gamer.firstName);
	}
	
	public void delete(Gamer gamer) {
	System.out.println("Oyuncu silindi  : " + gamer.firstName);
}
	public void update(Gamer gamer) {
	System.out.println("Oyuncu güncellendi  : " + gamer.firstName);
}
}
