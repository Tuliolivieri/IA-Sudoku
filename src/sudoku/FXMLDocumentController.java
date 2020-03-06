/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author tulio
 */
public class FXMLDocumentController implements Initializable
{
    
    private Label label;
    @FXML
    private GridPane gridPrincipal;
    @FXML
    private GridPane grid1;
    @FXML
    private GridPane grid2;
    @FXML
    private GridPane grid3;
    @FXML
    private GridPane grid4;
    @FXML
    private GridPane grid5;
    @FXML
    private GridPane grid6;
    @FXML
    private GridPane grid7;
    @FXML
    private GridPane grid8;
    @FXML
    private GridPane grid9;
    
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        ObservableList<Node> list = gridPrincipal.getChildren();
        
        for(Node n: list)
        {
            if(n instanceof GridPane)
            {
                ObservableList<Node> sublist = ((GridPane)n).getChildren();
                
                for(Node sn: sublist)
                {
                    if(sn instanceof TextField)
                    {
                        ((TextField) sn).setBackground(null);
                        ((TextField) sn).setBorder(null);
                        ((TextField) sn).setAlignment(Pos.CENTER);
                    }
                }
            }
        }
    }    
    
}
