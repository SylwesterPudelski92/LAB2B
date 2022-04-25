module pl.lublin.wsei.java.cwiczenia.lab4_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.lublin.wsei.java.cwiczenia to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia;
}