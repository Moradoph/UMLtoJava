module ku.cs.applications {
    requires javafx.controls;
    requires javafx.fxml;


    opens ku.cs.applications to javafx.fxml;
    exports ku.cs.applications;
}