package com.three360.fx8.ui.app;

import com.three360.fx8.fixatdl.core.StrategiesT;
import com.three360.fx8.fixatdl.core.StrategyT;

import java.io.File;

/***
 * FIX Algorithmic Trading Definition Language UI panel interface
 */
public interface IFixAtdlUiPanel<T> {

    /***
     *
     * @param parentUiElement
     * @return
     */
    T buildUi(T parentUiElement);

    /***
     *
     * @param file
     */
    void parseFixAtdlFile(File file);


    /***
     *
     * @return
     */
    StrategyT validate();

    /***
     *
     * @return
     */
    StrategiesT getAllStrategies();


    /***
     *
     * @param strategies
     */
    void setStrategies(StrategiesT strategies);

    /***
     *
     */
    void createUI();

    /***
     *
     * @param editable
     */
    void setEditable(boolean editable);


}
