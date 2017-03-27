package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.CheckBoxListT;
import com.three360.fixatdl.layout.PanelOrientationT;
import com.three360.ui.common.element.IFixCheckBoxListUiElement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.util.List;
import java.util.stream.Collectors;


public class FxFixCheckBoxListUiElement implements IFixCheckBoxListUiElement<Pane, EventHandler<ActionEvent>> {

    private CheckBoxListT checkBoxListT;
    private Pane pane;
    private List<CheckBox> checkBoxes;
    private Label label;

    @Override
    public Pane create() {
        if (this.checkBoxListT != null) {
            this.pane = this.checkBoxListT.getOrientation() == PanelOrientationT.HORIZONTAL ? new HBox() : new VBox();
            this.label = new Label(this.checkBoxListT.getLabel());
            this.pane.getChildren().addAll(this.label);
            this.checkBoxes = this.checkBoxListT.getListItem().stream().map(listItemT -> {
                CheckBox checkBox = new CheckBox();
                checkBox.setId(listItemT.getEnumID());
                checkBox.setText(listItemT.getUiRep());
                return checkBox;
            }).collect(Collectors.toList());
            if (checkBoxes != null) {
                this.checkBoxes.stream()
                        .filter(checkBox -> checkBox.getId() == this.checkBoxListT.getInitValue())
                        .map(checkBox -> {
                            checkBox.setSelected(true);
                            return checkBox;
                        });
                for (CheckBox cb : this.checkBoxes)
                    this.pane.getChildren().add(cb);
            }
            return pane;
        }
        return null;
    }

    @Override
    public void registerForEvent(EventHandler<ActionEvent> e) {

    }

    @Override
    public void setCheckBoxListT(CheckBoxListT checkBoxListT) {
        this.checkBoxListT = checkBoxListT;
    }
}
