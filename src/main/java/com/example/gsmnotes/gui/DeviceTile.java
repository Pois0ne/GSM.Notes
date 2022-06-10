

package com.example.gsmnotes.gui;

import com.example.gsmnotes.devices.Device;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

import java.io.IOException;

public class DeviceTile extends HBox {

    @FXML
    Label TTitle;

    @FXML
    ImageView TImage;

    @FXML
    Label TText;

    public DeviceTile() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Tile.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void setDevice(Device d) {
        this.TTitle.setText(d.getName());
        this.TText.setText(d.getModel());
    }


}

