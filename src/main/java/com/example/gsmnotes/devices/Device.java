package com.example.gsmnotes.devices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Device {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private String model;
    private String brand;
    private String imei;
    private String sn;
    private String history;
    private LocalDate date;


    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

//    public void setId(int id) {
//        this.id = id;
//    }

    public void  setImei(String imei) {
        this.imei = imei;
    }

    public String getImei() {
        return imei;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }




    public String getSn() {
        return sn;
    }

    public String getHistory() {
        return history;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }
}
