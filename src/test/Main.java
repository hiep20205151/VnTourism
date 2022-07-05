package test;
import topic.*;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Topic> topics = new ArrayList<Topic>();
		Topic lake = new Lake();
		topics.add(lake);
//		topics.add(new AmusementParks());
//		topics.add(new Beaches());
//		topics.add(new BotanicalGardens());
//		topics.add(new BuddhistTemples());
//		topics.add(new ClockTowers());
//		topics.add(new DefunctPrisons());
//		topics.add(new Festivals());
//		topics.add(new HistoricalSites());
//		topics.add(new Hotels());
//		topics.add(new Islands());
//		topics.add(new Mausoleums());
//		topics.add(new MilitaryWarMuseums());
//		topics.add(new MountainRanges());
//		topics.add(new Museums());
//		topics.add(new NationalParks());
//		topics.add(new OperaHouses());
//		topics.add(new Rivers());
//		topics.add(new RoadBridges());
//		topics.add(new VietnameseDishes());
//		topics.add(new WaterFalls());
//		topics.add(new WorldHeritageSites());
//		topics.add(new Zoos());
		
		for(Topic topic : topics) {
			topic.query(topic.getInput(), topic.getOutput());
		}
		System.out.println("Done!");
	}
}
