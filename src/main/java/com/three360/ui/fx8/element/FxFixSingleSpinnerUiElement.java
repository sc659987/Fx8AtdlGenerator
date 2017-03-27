package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.SingleSelectListT;
import com.three360.ui.common.element.IFixSingleSpinnerUiElement;
import javafx.scene.control.Spinner;

/**
 * Created by sainik on 25/03/17.
 */
public class FxFixSingleSpinnerUiElement implements IFixSingleSpinnerUiElement {


    private Spinner<Double> singleSpinner;

    @Override
    public Object create() {
        singleSpinner.valueProperty().addListener((observable, oldValue, newValue) -> {
        });
        return null;
    }

    @Override
    public void registerForEvent(Object e) {

    }

    @Override
    public void setSingleSelectList(SingleSelectListT singleSelectListT) {

    }
}
