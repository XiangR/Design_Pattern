package xiangR.observer.impl;

import java.util.*;
import xiangR.observer.inter.Observer;
import xiangR.observer.inter.Subject;

/**
 * 建立一个主题类来继承 Subject 其可以实现 删除观察者 添加观察者 更新观察者
 * @author xiangrui
 *
 */
public class WeatherData implements Subject {

	private ArrayList<Observer> observers;
	private float humidity;
	private float temp;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if( i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObserver() {
		for(int i = 0; i < observers.size(); i ++) {
			Observer observer = observers.get(i);
			observer.update(temp, humidity, pressure);
		}
	}
	
	public void mesurementsChanged() {
		notifyObserver();
	}
	
	public void setMesurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		mesurementsChanged();
	}

}
