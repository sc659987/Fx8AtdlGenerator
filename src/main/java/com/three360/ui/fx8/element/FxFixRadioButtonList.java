package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.PanelOrientationT;
import com.three360.fixatdl.layout.RadioButtonListT;
import com.three360.ui.common.element.IFixRadioButtonListUiElement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

import java.util.List;

/**
 * Created by sainik on 3/27/17.
 */
public class FxFixRadioButtonList implements IFixRadioButtonListUiElement<Pane, EventHandler<ActionEvent>> {

    private RadioButtonListT radioButtonListT;
    private GridPane pane;
    private List<RadioButton> radioButtonList;
    private ToggleGroup toggleGroup;
    private Label label;


    @Override
    public Pane create() {
        if (this.radioButtonListT != null) {
            this.pane = new GridPane();
            this.label = new Label(this.radioButtonListT.getLabel());
            this.toggleGroup = new ToggleGroup();
            this.pane.add(this.label, 0, 0, GridPane.REMAINING, 1);
            for (int i = 0; i < this.radioButtonList.size(); i++) {
                if (this.radioButtonListT.getOrientation() == PanelOrientationT.HORIZONTAL) {
                    this.pane.add(this.radioButtonList.get(i), 3 * i, 1, 3, 0);
                } else {
                    this.pane.add(this.radioButtonList.get(i), 0, i + 1, GridPane.REMAINING, 0);
                }
            }
        }
        return null;
    }

    @Override
    public void setRadioButtonListT(RadioButtonListT radioButtonListT) {
        this.radioButtonListT = radioButtonListT;
    }

    @Override
    public void registerForEvent(EventHandler<ActionEvent> e) {

    }
}
