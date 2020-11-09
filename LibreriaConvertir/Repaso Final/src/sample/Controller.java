package sample;

import Calculos.Calculos;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField txt1;
    @FXML TextField  txt2;
    @FXML ListView listView1;
    @FXML ListView listView2;

    double[] arreglo1 = new double[5];
    int cont = 0;
    double dato = 0;

    double[][] arreglo2 = new double[2][4];
    int cont2 = 0;
    int cont3 = 0;
    double dato2 = 0;

    public void insert1(){
        if (cont < 5) {
            dato = Double.parseDouble(txt1.getText());
            arreglo1[cont] = dato;
            cont++;
            txt1.setText("");
            imprimirArreglo(arreglo1);
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Arreglo Lleno");
            alert.show();
        }
    }
    public void insert2(){
        if (cont2 < 2) {
            dato2 = Double.parseDouble(txt2.getText());
            arreglo2[cont2][cont3] = dato2;
            cont3++;
            if(cont3 == 4){
                cont3 = 0;
                cont2++;
            }
            txt2.setText("");
            imprimirArreglo2(arreglo2);
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Arreglo Lleno");
            alert.show();
        }
    }

    public void proceso1(){
        Calculos calculos = new Calculos(arreglo1,arreglo2);
        double[] res = calculos.procesarCoseno();
        for(double dato: res){
            listView1.getItems().add(dato + "");
        }

    }
    public void proceso2(){
        Calculos calculos = new Calculos(arreglo1,arreglo2);
        double[][] res = calculos.procesarSeno();
        for (int x=0; x<res.length;x++){
            String columna = "";
            for(int y=0; y<res[x].length; y++) {
                columna = columna + res[x][y] + ",";
            }
            listView2.getItems().add(columna)
        }
            }
    }

    public void imprimirArreglo(double[] arr){
        for (int x=0; x<arr.length;x++){
            System.out.print(arr[x] + ",");
        }
        System.out.println();
    }
    public void imprimirArreglo2(double[][] arr){
        for (int x=0; x<arr.length;x++){
            for(int y=0; y<arr[x].length; y++){
                System.out.print(arr[x][y]+",");
            }
            System.out.print("");
        }
        System.out.println("______________________________________");
    }


}
