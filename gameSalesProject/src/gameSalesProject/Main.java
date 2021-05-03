package gameSalesProject;

import java.sql.Date;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign();
		campaign.name="Öğrenci İndirimi";
		campaign.discountPercent=25;
		campaign.id=1;
		CampaignManager campaignManager = new CampaignManager();
		Gamer gamer = new Gamer();
		gamer.firstName="Sinan";
		gamer.lastName="ŞİMŞEK";
		gamer.dateOfBirth=new Date(24031985);
		gamer.nationalityId="1324567891";
		Games game1 = new Games();
		game1.name = "Mortal Kombat";
		Games game2 = new Games();
		game2.name = "Cadillac And Dinasours";
		Games game3 = new Games();
		game3.name = "Street Fighter";
		Games game4 = new Games();
		game4.name = "Call Of Duty MW3";
		GamerWithVerificationManager gamerManager = new GamerWithVerificationManager();
		gamerManager.add(gamer);
		gamerManager.delete(gamer);
		gamerManager.update(gamer);
		campaignManager.add(new Campaign()); // yeni kampanya oluşturma
		campaignManager.add(game1);// mevcut oyunu kampanyaya ekleme

	}

}
