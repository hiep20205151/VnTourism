package test;
import java.util.ArrayList;

import topic.VnTourismTopic;
import topic.subtopic.*;

public class Main {
	public static void main(String[] args) {
//			Files.createDirectories(Paths.get("requests"));

		ArrayList<VnTourismTopic> topics = new ArrayList<VnTourismTopic>();
		
		VnTourismTopic amusementpark = new AmusementPark();	//polymorphism
		topics.add(amusementpark);
		VnTourismTopic beach = new Beach();
		topics.add(beach);
		VnTourismTopic botanicalgarden = new BotanicalGarden();
		topics.add(botanicalgarden);
		VnTourismTopic buddhisttemple = new BuddhistTemple();
		topics.add(buddhisttemple);
		VnTourismTopic clocktower = new ClockTower();
		topics.add(clocktower);
		VnTourismTopic defunctprison = new DefunctPrison();
		topics.add(defunctprison);
		VnTourismTopic festival = new Festival();
		topics.add(festival);
		VnTourismTopic historicalsite = new HistoricalSite();
		topics.add(historicalsite);
		VnTourismTopic hotel = new Hotel();
		topics.add(hotel);
		VnTourismTopic island = new Island();
		topics.add(island);
		VnTourismTopic lake = new Lake();
		topics.add(lake);
		VnTourismTopic mausoleum = new Mausoleum();
		topics.add(mausoleum);
		VnTourismTopic militarywarmuseum = new MilitaryWarMuseum();
		topics.add(militarywarmuseum);
		VnTourismTopic mountainrange = new MountainRange();
		topics.add(mountainrange);
		VnTourismTopic museum = new Museum();
		topics.add(museum);
		VnTourismTopic nationalpark = new NationalPark();
		topics.add(nationalpark);
		VnTourismTopic operahouse = new OperaHouse();
		topics.add(operahouse);
		VnTourismTopic river = new River();
		topics.add(river);
		VnTourismTopic roadbridge = new RoadBridge();
		topics.add(roadbridge);
		VnTourismTopic vietnamesedish = new VietnameseDish();
		topics.add(vietnamesedish);
		VnTourismTopic waterfall = new WaterFall();
		topics.add(waterfall);
		VnTourismTopic worldheritagesite = new WorldHeritageSite();
		topics.add(worldheritagesite);
		VnTourismTopic zoo = new Zoo();
		topics.add(zoo);
		
//		for(VnTourismTopic topic : topics) {
//			topic.query(topic.getInput(), topic.getOutput());
//			topic.printNotification();
//		}
		
		topics.forEach(topic -> {
			topic.query(topic.getInput(), topic.getOutput());
			topic.printNotification();
		}); 
		System.out.println("Done!");
	}
}
