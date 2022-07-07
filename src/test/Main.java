package test;

import query.QueryData;
import topic.VnTourismTopic;
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

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueryData rq = new QueryData();
		VnTourismTopic amusementpark = new AmusementPark();	//polymorphism
		rq.add(amusementpark);
		VnTourismTopic beach = new Beach();
		rq.add(beach);
		VnTourismTopic botanicalgarden = new BotanicalGarden();
		rq.add(botanicalgarden);
		VnTourismTopic buddhisttemple = new BuddhistTemple();
		rq.add(buddhisttemple);
		VnTourismTopic clocktower = new ClockTower();
		rq.add(clocktower);
		VnTourismTopic defunctprison = new DefunctPrison();
		rq.add(defunctprison);
		VnTourismTopic festival = new Festival();
		rq.add(festival);
		VnTourismTopic historicalsite = new HistoricalSite();
		rq.add(historicalsite);
		VnTourismTopic hotel = new Hotel();
		rq.add(hotel);
		VnTourismTopic island = new Island();
		rq.add(island);
		VnTourismTopic lake = new Lake();
		rq.add(lake);
		VnTourismTopic mausoleum = new Mausoleum();
		rq.add(mausoleum);
		VnTourismTopic militarywarmuseum = new MilitaryWarMuseum();
		rq.add(militarywarmuseum);
		VnTourismTopic mountainrange = new MountainRange();
		rq.add(mountainrange);
		VnTourismTopic museum = new Museum();
		rq.add(museum);
		VnTourismTopic nationalpark = new NationalPark();
		rq.add(nationalpark);
		VnTourismTopic operahouse = new OperaHouse();
		rq.add(operahouse);
		VnTourismTopic river = new River();
		rq.add(river);
		VnTourismTopic roadbridge = new RoadBridge();
		rq.add(roadbridge);
		VnTourismTopic vietnamesedish = new VietnameseDish();
		rq.add(vietnamesedish);
		VnTourismTopic waterfall = new WaterFall();
		rq.add(waterfall);
		VnTourismTopic worldheritagesite = new WorldHeritageSite();
		rq.add(worldheritagesite);
		VnTourismTopic zoo = new Zoo();
		rq.add(zoo);
		rq.processQuery();
		rq.printTime();
		rq.printNumData();
	}

}
