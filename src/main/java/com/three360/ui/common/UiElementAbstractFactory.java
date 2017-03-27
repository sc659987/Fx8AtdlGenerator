package com.three360.ui.common;

import com.three360.ui.common.element.*;


public interface UiElementAbstractFactory {

    IFixButtonUiElement instantiateNewButton();

    IFixCheckBoxListUiElement instantiateNewCheckBox();

    <T, K> IFixDropDownListUiElement<T, K> instantiateNewDropDownList();

    IFixHiddenFieldUiElement instantiateNewHiddenField();

    IFixClockUiElement instantiateNewJideClock();

    IFixLabelUiElement instantiateNewLabel();

    IFixListBoxUiElement instantiateNewListBox();

    IFixNullableSpinnerUiElement instantiateNewNullableSpinner();

    IFixPanelUiElement instantiateNewPanel();

    IFixRadioButtonUiElement instantiateNewRadioButton();

    IFixSliderUiElement instantiateNewSlider();

    IFixSingleSpinnerUiElement instantiateNewSingleSpinner();

    IFixTextFieldUiElement instantiateNewText();

}
