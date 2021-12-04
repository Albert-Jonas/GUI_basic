package com.example.gui_basic;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;


import java.util.Optional;

public class util {
    public void hiba(String text) {
        Alert confirm = new Alert(Alert.AlertType.ERROR, null, ButtonType.OK);
        confirm.setTitle(text);
        confirm.setHeaderText(text);
        Optional<ButtonType> answer = confirm.showAndWait();

    }

    public String kedvezmenyesArSzamolo(String alapErtek, int szazalek) {
        return String.valueOf(Integer.parseInt(alapErtek) - (Integer.parseInt(alapErtek) * szazalek / 100));
    }
    boolean Ketto_tizennyolcE(int ev) {

        return  ev > 2 && ev < 18 ? true : false;
    }

    boolean keteves(int ev) {
        return ev <= 2  ? true : false;}
}
