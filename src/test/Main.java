package test;
import topic.Topic;
import topic.subtopic.*;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Topic> topics = new ArrayList<Topic>();
		Topic lake = new Lake();		//polymorphism
		topics.add(lake);
		Topic beach = new Beach();
		topics.add(beach);
		Topic amusementpark = new AmusementPark();
		topics.add(amusementpark);
		Topic botanicalgarden = new BotanicalGarden();
		topics.add(botanicalgarden);
		Topic buddhisttemple = new BuddhistTemple();
		topics.add(buddhisttemple);
		Topic clocktower = new ClockTower();
		topics.add(clocktower);
		Topic defunctprison = new DefunctPrison();
		topics.add(defunctprison);
		Topic festival = new Festival();
		topics.add(festival);
		Topic historicalsite = new HistoricalSite();
		topics.add(historicalsite);
		Topic hotel = new Hotel();
		topics.add(hotel);
		Topic island = new Island();
		topics.add(island);
		Topic mausoleum = new Mausoleum();
		topics.add(mausoleum);
		Topic militarywarmuseum = new MilitaryWarMuseum();
		topics.add(militarywarmuseum);
		Topic mountainrange = new MountainRange();
		topics.add(mountainrange);
		Topic museum = new Museum();
		topics.add(museum);
		Topic nationalpark = new NationalPark();
		topics.add(nationalpark);
		Topic operahouse = new OperaHouse();
		topics.add(operahouse);
		Topic river = new River();
		topics.add(river);
		Topic roadbridge = new RoadBridge();
		topics.add(roadbridge);
		Topic vietnamesedish = new VietnameseDish();
		topics.add(vietnamesedish);
		Topic waterfall = new WaterFall();
		topics.add(waterfall);
		Topic worldheritagesite = new WorldHeritageSite();
		topics.add(worldheritagesite);
		Topic zoo = new Zoo();
		topics.add(zoo);
		
		
		for(Topic topic : topics) {
			topic.query(topic.getInput(), topic.getOutput());
			topic.printNotification();
		}
		System.out.println("Done!");
	}
}
