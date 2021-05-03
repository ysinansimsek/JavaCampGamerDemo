package gameSalesProject;

public class CampaignManager implements ICampaignManager {

	@Override
	public void add(Games game) {
		System.out.println(game.name + "  isimli oyun kampanyaya dahil edildi ");
		
	}



	@Override
	public void delete(Games game) {
		System.out.println(game.name + "  isimli oyun kampanyadan silindi. ");
		
	}

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Oluşturuldu");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.name + " isimli  Kampanya Silindi");
		
	}

	@Override
	public void upDate(Campaign campaign) {
		
		System.out.println(campaign.name + "  isimli Kampanya Güncellendi");
		
	}

	
}
