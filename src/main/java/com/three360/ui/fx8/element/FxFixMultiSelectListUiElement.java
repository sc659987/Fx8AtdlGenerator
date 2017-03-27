package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.MultiSelectListT;
import com.three360.ui.common.element.IFixMultiSelectListUiElement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;

/**
 * Created by sainik on 3/27/17.
 */
public class FxFixMultiSelectListUiElement implements IFixMultiSelectListUiElement<ListView<String>, EventHandler<ActionEvent>> {
    @Override
    public ListView<String> create() {
        return null;
    }

    @Override
    public void registerForEvent(EventHandler<ActionEvent> e) {

    }

    @Override
    public void setSingleSelectList(MultiSelectListT multiSelectListT) {

    }
}
