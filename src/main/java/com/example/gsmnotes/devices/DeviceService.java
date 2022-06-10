package com.example.gsmnotes.devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeviceService {

    @Autowired
    private DeviceRepository repository;

    public List<Device> getAllDevices() {
        return this.repository.findAll();
    }

    public Device addDevice(Device d) {
        return this.repository.save(d);
    }

    public void deleteDevice(Device d){
        this.repository.delete(d);
    }
    //todo Select device

    public Device updateDevice(Device d) {
        return this.repository.save(d);
    }

    public void clearAllDevices() {
        this.repository.deleteAll();
    }


}
