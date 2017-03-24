package com.three360.ui.common;

import com.three360.ui.common.element.*;


public interface UiElementAbstractFactory {

    IFixButtonUiElement createButton();

    IFixCheckBoxListUiElement createCheckBox();

    <T, K> IFixDropDownListUiElement<T, K> createDropDownList();

    IFixHiddenFieldUiElement createHiddenField();

    IFixClockUiElement createJideClock();

    IFixLabelUiElement createLabel();

    IFixListBoxUiElement createListBox();

    IFixNullableSpinnerUiElement createNullableSpinner();

    IFixPanelUiElement createPanel();

    IFixRadioButtonUiElement createRadioButton();

    IFixSliderUiElement createSlider();

    IFixSingleSpinnerUiElement createSpinner();

    IFixTextFieldUiElement createText();

}
