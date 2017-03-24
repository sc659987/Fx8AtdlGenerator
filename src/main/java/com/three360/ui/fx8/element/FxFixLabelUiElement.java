package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.LabelT;
import com.three360.ui.common.element.IFixLabelUiElement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;

public class FxFixLabelUiElement implements IFixLabelUiElement<Label, EventHandler<ActionEvent>> {

    @Override
    public Label create() {
        return null;
    }

    @Override
    public void setLabel(LabelT label) {

    }

    @Override
    public void registerForEvent(EventHandler<ActionEvent> e) {

    }
}
