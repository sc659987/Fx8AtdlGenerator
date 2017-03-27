package com.three360.ui.fx8;

import com.three360.ui.common.UiElementAbstractFactory;
import com.three360.ui.common.element.*;
import com.three360.ui.fx8.element.FxFixDropDownListUiElement;

public class FxUiElementFactory implements UiElementAbstractFactory {

    @Override
    public IFixButtonUiElement instantiateNewButton() {
        return null;
    }

    @Override
    public IFixCheckBoxListUiElement instantiateNewCheckBox() {
        return null;
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
    public IFixNullableSpinnerUiElement instantiateNewNullableSpinner() {
        return null;
    }

    @Override
    public IFixPanelUiElement instantiateNewPanel() {
        return null;
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
