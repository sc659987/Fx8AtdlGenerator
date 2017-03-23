package com.three360.ui.fx8;

import com.three360.ui.common.UiElementAbstractFactory;
import com.three360.ui.common.element.*;
import com.three360.ui.fx8.element.FxFixDropDownListUiElement;

public class FxUiElementFactory implements UiElementAbstractFactory {

    @Override
    public IFixButtonUiElement createButton() {
        return null;
    }

    @Override
    public IFixCheckBoxListUiElement createCheckBox() {
        return null;
    }

    @Override
    public IFixDropDownListUiElement createDropDownList() {
        return new FxFixDropDownListUiElement();
    }

    @Override
    public IFixHiddenFieldUiElement createHiddenField() {
        return null;
    }

    @Override
    public IFixClockUiElement createJideClock() {
        return null;
    }

    @Override
    public IFixLabelUiElement createLabel() {
        return null;
    }

    @Override
    public IFixListBoxUiElement createListBox() {
        return null;
    }

    @Override
    public IFixNullableSpinnerUiElement createNullableSpinner() {
        return null;
    }

    @Override
    public IFixPanelUiElement createPanel() {
        return null;
    }

    @Override
    public IFixRadioButtonUiElement createRadioButton() {
        return null;
    }

    @Override
    public IFixSliderUiElement createSlider() {
        return null;
    }

    @Override
    public IFixSpinnerUiElement createSpinner() {
        return null;
    }

    @Override
    public IFixTextFieldUiElement createText() {
        return null;
    }
}
