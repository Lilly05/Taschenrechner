package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;
    @FXML
    Button button5;
    @FXML
    Button button6;
    @FXML
    Button button7;
    @FXML
    Button button8;
    @FXML
    Button button9;
    @FXML
    Button button0;
    @FXML
    TextField textfield1;
    @FXML
    Button addition;
    @FXML
    Button subtraktion;
    @FXML
    Button multiplikation;
    @FXML
    Button division;
    @FXML
    Button ergebnis;

    Rechner rechner = new Rechner();

    int zahl1;
    int  zahl2;
    String operator;


    public void writeNumber(ActionEvent e) {
        Button zahlen = (Button) e.getSource();
        textfield1.setText(textfield1.getText() + zahlen.getText());
    }
    public void getOperator(ActionEvent e) {
        Button operators = (Button) e.getSource();
        operator = operators.getText();
        System.out.println(operator);
        zahl1 = Integer.parseInt(textfield1.getText());
        textfield1.clear();
    }
    public void getErgebnis() {

        zahl2 = Integer.parseInt(textfield1.getText());

        if (operator.equals("+")) {
            int rueckgabe = rechner.rechnePlus(zahl1, zahl2);
            textfield1.setText(String.valueOf(rueckgabe));
        } else if(operator.equals("-")) {
            int rueckgabe = rechner.rechneMinus(zahl1, zahl2);
            textfield1.setText(String.valueOf(rueckgabe));
        } else if(operator.equals("*")) {
            int rueckgabe = rechner.rechneMal(zahl1, zahl2);
            textfield1.setText(String.valueOf(rueckgabe));
        } else if(operator.equals("/")) {
            int rueckgabe = rechner.rechneGeteilt(zahl1, zahl2);
            textfield1.setText(String.valueOf(rueckgabe));
        } else if(operator.equals("%")) {
            int rueckgabe = rechner.rechneModulo(zahl1, zahl2);
            textfield1.setText(String.valueOf(rueckgabe));
        }
    }
    public void deleteNumbers() {
        textfield1.clear();
    }
}
