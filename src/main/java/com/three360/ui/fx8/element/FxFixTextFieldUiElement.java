package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.TextFieldT;
import com.three360.ui.common.element.IFixTextFieldUiElement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;

/**
 * Created by sainik on 3/24/17.
 */
public class FxFixTextFieldUiElement implements IFixTextFieldUiElement<TextField, EventHandler<ActionEvent>> {
    @Override
    public TextField create() {
        return null;
    }

    @Override
    public void setTextField(TextFieldT textField) {

    }

    @Override
    public void registerForEvent(EventHandler<ActionEvent> e) {

    }
}
