package ObserverDesignPattern.News;

import ObserverDesignPattern.News.Channels.MobileAppChannel;
import ObserverDesignPattern.News.Channels.RadioChannel;
import ObserverDesignPattern.News.Channels.TVChannel;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer TV = new TVChannel();
        Observer mobile = new MobileAppChannel();
        Observer radio = new RadioChannel();

        // registering the channels as required
        agency.registerObserver(TV);
        agency.registerObserver(mobile);
        agency.registerObserver(radio);

        // updating the latest news now
        agency.setLatestNews("Trump announces 50% tariff on India");
        System.out.println();
        agency.setLatestNews("Russian President Vladimir Putin and US President Donald Trump plans for Peace Talks");

        // unregistering mobile app channel
        agency.removeObserver(mobile);

        System.out.println();
        // setting the latest news again
        agency.setLatestNews("300 people died as flood haunts Pakistan");
    }
}
