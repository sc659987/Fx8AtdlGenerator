package com.three360.ui.common.element;

import com.three360.fixatdl.layout.EditableDropDownListT;

/**
 * Created by sainik on 3/24/17.
 */
public interface IFixEditableDropDownListUiElement<T, K> extends IFixUiElement<T, K> {

    /***
     *
     * @param listT
     */
    void set(EditableDropDownListT listT);
}
