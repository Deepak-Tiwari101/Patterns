package ObserverDesignPattern.News.Channels;

import ObserverDesignPattern.News.Observer;

public class MobileAppChannel implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Latest News on MOBILE APP: " + news);
    }
}
