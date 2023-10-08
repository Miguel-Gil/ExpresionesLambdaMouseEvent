module es.ieslosmontecillos.expresioneslambdamouseevent {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.expresioneslambdamouseevent to javafx.fxml;
    exports es.ieslosmontecillos.expresioneslambdamouseevent;
}