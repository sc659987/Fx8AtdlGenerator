package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.DropDownListT;
import com.three360.ui.common.element.IFixDropDownListUiElement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ComboBox;

import java.util.stream.Collectors;


public class FxFixDropDownListUiElement implements IFixDropDownListUiElement<ComboBox<String>, EventHandler<ActionEvent>> {

    private DropDownListT dropDownListT;

    private ComboBox<String> stringComboBox = new ComboBox<>();

    private EventHandler<ActionEvent> handlers;

    @Override
    public void registerForEvent(EventHandler<ActionEvent> e) {
        this.handlers = e;
    }

    @Override
    public void setDropDownList(DropDownListT downList) {
        this.dropDownListT = downList;
    }

    @Override
    public ComboBox<String> create() {
        this.stringComboBox.getItems().addAll(this.dropDownListT.getListItem().stream().map(listItemT -> listItemT.getUiRep()).collect(Collectors.toList()));
        this.stringComboBox.getSelectionModel().selectFirst();
        this.stringComboBox.setOnAction(event -> {
            if (handlers != null)
                handlers.handle(event);
            stringComboBox.getValue();
        });
        return this.stringComboBox;
    }
}
