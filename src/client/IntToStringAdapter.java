package client;

import service.IntDataService;

/**
 * Created by Anton Mikhaylov on 22.12.2017.
 */
public class IntToStringAdapter implements DataAPI {

    private IntDataService service;

    public IntToStringAdapter(IntDataService service) {
        this.service = service;
    }

    @Override
    public String getData() {
        return "STRING__" + String.valueOf(service.getIntegerData());
    }

    @Override
    public void insertData(String data) {
        service.setData(Integer.parseInt(data));
    }
}
