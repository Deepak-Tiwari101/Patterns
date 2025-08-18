package ObserverDesignPattern.News.Channels;

import ObserverDesignPattern.News.Observer;

public class TVChannel implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Latest News on TV: " + news);
    }
}
