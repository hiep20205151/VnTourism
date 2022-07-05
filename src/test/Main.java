package test;
import topic.*;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Topic> topics = new ArrayList<Topic>();
		Topic lake = new Lake();		//polymorphism
		topics.add(lake);
		Topic beach = new Beaches();
		topics.add(beach);
		Topic amusementpark = new AmusementParks();
		topics.add(amusementpark);
		Topic botanicalgarden = new BotanicalGardens();
		topics.add(botanicalgarden);
		Topic buddhisttemple = new BuddhistTemples();
		topics.add(buddhisttemple);
		Topic clocktower = new ClockTowers();
		topics.add(clocktower);
		Topic defunctprison = new DefunctPrisons();
		topics.add(defunctprison);
		Topic festival = new Festivals();
		topics.add(festival);
		Topic historicalsite = new HistoricalSites();
		topics.add(historicalsite);
		Topic hotel = new Hotels();
		topics.add(hotel);
		Topic island = new Islands();
		topics.add(island);
		Topic mausoleum = new Mausoleums();
		topics.add(mausoleum);
		Topic militarywarmuseum = new MilitaryWarMuseums();
		topics.add(militarywarmuseum);
		Topic mountainrange = new MountainRanges();
		topics.add(mountainrange);
		Topic museum = new Museums();
		topics.add(museum);
		Topic nationalpark = new NationalParks();
		topics.add(nationalpark);
		Topic operahouse = new OperaHouses();
		topics.add(operahouse);
		Topic river = new Rivers();
		topics.add(river);
		Topic roadbridge = new RoadBridges();
		topics.add(roadbridge);
		Topic vietnamesedish = new VietnameseDishes();
		topics.add(vietnamesedish);
		Topic waterfall = new WaterFalls();
		topics.add(waterfall);
		Topic worldheritagesite = new WorldHeritageSites();
		topics.add(worldheritagesite);
		Topic zoo = new Zoos();
		topics.add(zoo);
		
		
		for(Topic topic : topics) {
			topic.query(topic.getInput(), topic.getOutput());
		}
		System.out.println("Done!");
	}
}
