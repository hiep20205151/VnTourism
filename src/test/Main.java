package test;

import query.QueryData;
import topic.VnTourismTopic;
import topic.subtopic.*;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueryData rq = new QueryData();
		VnTourismTopic amusementpark = new AmusementPark();
		rq.add(amusementpark);
		VnTourismTopic aquaria = new Aquaria();
		rq.add(aquaria);
		VnTourismTopic archaeologicalsite = new ArchaeologicalSite();
		rq.add(archaeologicalsite);
		VnTourismTopic beach = new Beach();
		rq.add(beach);
		VnTourismTopic botanicalgarden = new BotanicalGarden();
		rq.add(botanicalgarden);
		VnTourismTopic buddhisttemple = new BuddhistTemple();
		rq.add(buddhisttemple);
		VnTourismTopic cave = new Cave();
		rq.add(cave);
		VnTourismTopic clocktower = new ClockTower();
		rq.add(clocktower);
		VnTourismTopic defunctprison = new DefunctPrison();
		rq.add(defunctprison);
		VnTourismTopic festival = new Festival();
		rq.add(festival);
		VnTourismTopic capital = new HistoricalCapital();
		rq.add(capital);
		VnTourismTopic historicalsite = new HistoricalSite();
		rq.add(historicalsite);
		VnTourismTopic hotel = new Hotel();
		rq.add(hotel);
		VnTourismTopic island = new Island();
		rq.add(island);
		VnTourismTopic lake = new Lake();
		rq.add(lake);
		VnTourismTopic landform = new Landform();
		rq.add(landform);
		VnTourismTopic mausoleum = new Mausoleum();
		rq.add(mausoleum);
		VnTourismTopic militarywarmuseum = new MilitaryWarMuseum();
		rq.add(militarywarmuseum);
		VnTourismTopic monarch = new Monarch();
		rq.add(monarch);
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
		VnTourismTopic tomb = new Tomb();
		rq.add(tomb);
		VnTourismTopic vietnamesedish = new VietnameseDish();
		rq.add(vietnamesedish);
		VnTourismTopic volcano = new Volcano();
		rq.add(volcano);
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
