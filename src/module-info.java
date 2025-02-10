module CinemaManagementSystems {
    requires javafx.controls;
    requires javafx.fxml;
	requires javafx.graphics;
	requires java.desktop;
	requires javafx.base;

    exports cinema;  // Export the cinema package to allow JavaFX to access it
    opens cinema to javafx.graphics;  // Open the cinema package to javafx.graphics
}
