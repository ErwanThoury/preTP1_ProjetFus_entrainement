module sio.pretp1profus {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.pretp1profus to javafx.fxml;
    exports sio.pretp1profus;
}