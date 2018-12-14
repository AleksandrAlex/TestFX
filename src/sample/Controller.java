package sample;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button generationBtn;

    @FXML
    private TextField textPass;

    @FXML
    private TextField text1;

    @FXML
    private Label lbl1;

    @FXML
    private AnchorPane scene1;

    @FXML
    private Label lbl2;

    @FXML
    void initialize() {
        generationBtn.setOnAction(event -> {
            if (text1.getText().matches("[0-9]")) {
                textPass.setText(passwordGeneration());
            }
        });
    }

    public String passwordGeneration() {

        int x = Integer.parseInt(text1.getText());


        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] mass = string.toCharArray();
        char[] arr = new char[mass.length];
        char[] result = new char[x];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            int a = random.nextInt(mass.length);

            arr[i] = mass[a];

        }

        for (int i = 0; i < x; i++) {
            result[i] = arr[i];

        }


        return new String(result);
    }

    }






