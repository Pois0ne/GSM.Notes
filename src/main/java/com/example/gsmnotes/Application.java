package com.example.gsmnotes;

import com.example.gsmnotes.devices.Device;
import com.example.gsmnotes.devices.DeviceService;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class Application extends javafx.application.Application {


    public static DeviceService deviceService;

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

        context = SpringApplication.run(Application.class);
        deviceService = context.getBean(DeviceService.class);

        //TestInitializer.fillWithSampleData();

        Device f = new Device();
        f.setName("Новое устройство");
        f.setModel("...");
        f.setSn("...");
        f.setBrand("...");
        f.setHistory("...");
        f.setImei("35XXXXXXXXX");
        deviceService.addDevice(f);

        stage.setTitle("GSM.Notes");

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("MainUi2.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 800, 400);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void stop() throws Exception {
        super.stop();
        context.close();
    }

}