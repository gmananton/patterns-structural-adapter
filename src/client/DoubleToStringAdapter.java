package client;

import service.DoubleDataService;

/**
 * Created by Anton Mikhaylov on 22.12.2017.
 */
public class DoubleToStringAdapter implements DataAPI {

    private DoubleDataService service;

    public DoubleToStringAdapter(DoubleDataService service) {
        this.service = service;
    }

    @Override
    public String getData() {
        return "STRING_DATA___" + String.valueOf(service.getData());
    }

    @Override
    public void insertData(String data) {
        service.setData(Double.parseDouble(data));
    }
}
