

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
//    TextArea TText;


    // ... copy from G. V.

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
        // TODO: !если будем отображать иконки для устройств,
        // то будем делать приблизительно так
        // this.TImage.setImage(new Image(getClass().getResource("ikonka_iphona.png").toString()));
        this.TText.setText(d.getModel());
    }


    }

