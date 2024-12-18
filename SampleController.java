package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class SampleController {

    @FXML
    private TableView<Mahasiswa> tableView;

    @FXML
    private TableColumn<Mahasiswa, String> nimColumn;

    @FXML
    private TableColumn<Mahasiswa, String> namaColumn;

    private ObservableList<Mahasiswa> studentData;

    @FXML
    public void initialize() {
        nimColumn.setCellValueFactory(new PropertyValueFactory<>("nim"));
        namaColumn.setCellValueFactory(new PropertyValueFactory<>("nama"));

        studentData = FXCollections.observableArrayList(
        	    new Mahasiswa("001", "Andi"),
        	    new Mahasiswa("002", "Budi"),
        	    new Mahasiswa("003", "Citra"),
        	    new Mahasiswa("004", "Dewi"),
        	    new Mahasiswa("005", "Eka"),
        	    new Mahasiswa("006", "Fajar"),
        	    new Mahasiswa("007", "Gita"),
        	    new Mahasiswa("008", "Hadi"),
        	    new Mahasiswa("009", "Indah"),
        	    new Mahasiswa("010", "Joko")
        	);

        tableView.setItems(studentData);
    }
}
