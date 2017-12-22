package service;

/**
 * Created by Anton Mikhaylov on 22.12.2017.
 *
 * Сервисный класс, умеющий работать только с int. Клиентский код при этом может работать только со String
 * Этот сервис мы и будем оборачивать в адаптер
 */
public class IntDataService {
    private int data;

    public Integer getIntegerData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
