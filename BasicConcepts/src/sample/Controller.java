package sample;

import Convertidor.Convertidor;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import javax.swing.*;

public class Controller{

    @FXML Button bExit;
    @FXML Button bMath;
    @FXML TextField tf;
    @FXML Label  l;

    String styleEntered = "-fx-background-color: WHITE; -fx-text-fill: BLACK; -fx-background-radius: 30; -fx-border-color: White; -fx-border-radius: 30;";
    String styleExited = "-fx-background-color: BLACK; -fx-text-fill: WHITE; -fx-background-radius: 30; -fx-border-color: White; -fx-border-radius: 30;";

    public void exit(){ System.exit(0);}
    public void enteredExit(){ bExit.setStyle(styleEntered); }
    public void exitedExit(){ bExit.setStyle(styleExited); }

    public void math(){

                                     String op =  JOptionPane.showInputDialog("Opciones: \n\t1)Edad\n\t2)Convertir a Binario\n\t8)Convertir a Octal\n\t16)Convertir a Hexadecimal" );
                                        int num = Integer.parseInt(tf.getText());
         Convertidor convertidor = new Convertidor();

           if(op.equals("1") ) {
                   l.setTextFill(Color.WHITE);
                   if (num > 18) {
                       l.setText("You're old ");
                   } else {
                       l.setText("You're young ");
                   }
           }//if
           else {
            try {
                l.setTextFill(Color.WHITE);
                l.setText(convertidor.seleccionConvertir(num, Integer.parseInt(op)));
            }
            catch (Exception e){ l.setTextFill(Color.RED); l.setVisible(true); l.setText("Fail!"); }//catch
          } //else

    }
    public void enteredMath(){ bMath.setStyle(styleEntered); }
    public void exitedMath(){ bMath.setStyle(styleExited); }
}
