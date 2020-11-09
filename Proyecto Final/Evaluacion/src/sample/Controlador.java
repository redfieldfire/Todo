package sample;

import Pez.Pez;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controlador{

    @FXML Button btinsert;
    @FXML Button btprint;
    @FXML ListView listview;
    @FXML ComboBox<String> cb;
    @FXML TextField tf;
    Pez []pelaos= new Pez[10];


ObservableList<String> list = FXCollections.observableArrayList("Beta","Dorado","Trucha","Carpa","Guppy","Luna"," Carassius","Tilapia","Siluro","Channa","Caballa","Basa","Candiru") ;
ObservableList<String> list2 = FXCollections.observableArrayList() ;

Boolean t=true;
public void comboBox(){
   if(t){
       cb.setItems(list);
       t = false;
   }
}

int contador = 0;
public void insertPelao(){
if(tf.getText().equals("") || cb.getSelectionModel().getSelectedItem() == null){
    Alert alert = new Alert(Alert.AlertType.ERROR);
    alert.setContentText("El campo de crias o el tipo de pez esta en blanco");
    alert.show();
}
else{
   pelaos[contador] = new Pez(cb.getSelectionModel().getSelectedItem(),Integer.parseInt(tf.getText()));
    contador++;
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setContentText("Pez "+pelaos[contador-1].getTipo_Pez()+ "  Crias "+ pelaos[contador-1].getPor_Nacimiento());
    alert.show();
    btprint.setDisable(false);
}

}

public void printPelaos(){
    list2.clear();
for(int x=0; x<contador;x++){
   list2.add("Para el pez " + pelaos[x].getTipo_Pez() + " nacen " + pelaos[x].getPor_Nacimiento() + " crias y " + pelaos[x].nacimientoAnual() +" anualmente");
}
listview.setItems(list2);
btprint.setDisable(true);
}

}
