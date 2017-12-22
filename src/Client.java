package client;

import service.DoubleDataService;
import service.IntDataService;

/**
 * Created by Anton Mikhaylov on 22.12.2017.
 */
public class Client {
    public static void main(String[] args) {
        DataAPI intAPI = new IntToStringAdapter(new IntDataService());
        intAPI.insertData("123");
        System.out.println("Data from service : " + intAPI.getData());

        System.out.println("---------------------\n");

        DataAPI doubleAPI = new DoubleToStringAdapter(new DoubleDataService());
        doubleAPI.insertData("20.0");
        System.out.println("Data from service: " + doubleAPI.getData());

    }
}
