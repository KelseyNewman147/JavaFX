package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    ListView list;

    @FXML
    TextField name;

    @FXML
    TextField phone;

    @FXML
    TextField email;

    public void addItem() {
        if (!name.getText().equals("") && !phone.getText().equals("") && !email.getText().equals("")) {
            contacts.add(new Contact(name.getText(), phone.getText(), email.getText()));
            name.setText("");
            phone.setText("");
            email.setText("");
        }
    }

    public void removeItem() {
        Contact item = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(item);
    }

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(contacts);
    }

}
