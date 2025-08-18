package ObserverDesignPattern.News.Channels;

import ObserverDesignPattern.News.Observer;

public class RadioChannel implements Observer {
    @Override
    public void update(String news) {
        System.out.println("Latest news on RADIO: " + news);
    }
}
