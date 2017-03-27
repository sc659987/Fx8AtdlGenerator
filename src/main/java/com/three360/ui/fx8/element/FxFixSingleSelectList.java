package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.SingleSelectListT;
import com.three360.ui.common.element.IFixSingleSelectListUiElement;
import com.three360.ui.common.element.IFixUiElement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.ListView;


/**
 * Created by sainik on 3/27/17.
 */
public class FxFixSingleSelectList implements IFixSingleSelectListUiElement<ListView<String>,EventHandler<ActionEvent>> {
    @Override
    public ListView<String> create() {
        return null;
    }

    @Override
    public void registerForEvent(EventHandler<ActionEvent> e) {

    }

    @Override
    public void setSingleSelectList(SingleSelectListT singleSelectListT) {

    }
}
