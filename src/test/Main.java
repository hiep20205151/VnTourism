package test;
import topic.*;
import topic.subtopic.AmusementPark;
import topic.subtopic.Beach;
import topic.subtopic.BotanicalGarden;
import topic.subtopic.BuddhistTemple;
import topic.subtopic.ClockTower;
import topic.subtopic.DefunctPrison;
import topic.subtopic.Festival;
import topic.subtopic.HistoricalSite;
import topic.subtopic.Hotel;
import topic.subtopic.Island;
import topic.subtopic.Lake;
import topic.subtopic.Mausoleum;
import topic.subtopic.MilitaryWarMuseum;
import topic.subtopic.MountainRange;
import topic.subtopic.Museum;
import topic.subtopic.NationalPark;
import topic.subtopic.OperaHouse;
import topic.subtopic.River;
import topic.subtopic.RoadBridge;
import topic.subtopic.VietnameseDish;
import topic.subtopic.WaterFall;
import topic.subtopic.WorldHeritageSite;
import topic.subtopic.Zoo;

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
		}
		System.out.println("Done!");
	}
}
