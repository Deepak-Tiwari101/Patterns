package ObserverDesignPattern.News;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable{
    private final List<Observer> channelList = new ArrayList<>();
    private String latestNews;

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        channelList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        channelList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : channelList) observer.update(latestNews);
    }
}
