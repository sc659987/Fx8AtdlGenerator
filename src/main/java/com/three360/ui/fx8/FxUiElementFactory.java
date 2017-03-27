package com.three360.ui.fx8;

import com.three360.ui.common.UiElementAbstractFactory;
import com.three360.ui.common.element.*;
import com.three360.ui.fx8.element.FxFixCheckBoxListUiElement;
import com.three360.ui.fx8.element.FxFixDropDownListUiElement;
import com.three360.ui.fx8.element.FxFixPanelUiElement;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;

public class FxUiElementFactory implements UiElementAbstractFactory {

    @Override
    public IFixButtonUiElement instantiateNewButton() {
        return null;
    }

    @Override
    public IFixCheckBoxListUiElement<Pane, EventHandler<ActionEvent>> instantiateNewCheckBox() {
        return new FxFixCheckBoxListUiElement();
    }

    @Override
    public IFixDropDownListUiElement instantiateNewDropDownList() {
        return new FxFixDropDownListUiElement();
    }

    @Override
    public IFixHiddenFieldUiElement instantiateNewHiddenField() {
        return null;
    }

    @Override
    public IFixClockUiElement instantiateNewJideClock() {
        return null;
    }

    @Override
    public IFixLabelUiElement instantiateNewLabel() {
        return null;
    }

    @Override
    public IFixListBoxUiElement instantiateNewListBox() {
        return null;
    }

    @Override
    public IFixPanelUiElement instantiateNewPanel() {
        return new FxFixPanelUiElement();
    }

    @Override
    public IFixRadioButtonUiElement instantiateNewRadioButton() {
        return null;
    }

    @Override
    public IFixSliderUiElement instantiateNewSlider() {
        return null;
    }

    @Override
    public IFixSingleSpinnerUiElement instantiateNewSingleSpinner() {
        return null;
    }

    @Override
    public IFixTextFieldUiElement instantiateNewText() {
        return null;
    }
}
