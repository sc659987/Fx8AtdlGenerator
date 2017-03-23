package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.StrategyPanelT;
import com.three360.ui.common.UiElementAbstractFactory;
import com.three360.ui.common.element.IFixPanelUiElement;
import com.three360.ui.fx8.component.DaggerMyComponent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.TitledPane;

import javax.inject.Inject;

// TODO make all attribute private
public class FxFixPanelUiElement implements IFixPanelUiElement<Node, EventHandler<ActionEvent>> {

    private StrategyPanelT strategyPanelT;

    @Inject
    UiElementAbstractFactory factory;


    public FxFixPanelUiElement() {
        DaggerMyComponent.builder().build().inject(this);
    }


    @Override
    public Node create() {

        TitledPane titledPane = new TitledPane();
        titledPane.setCollapsible(false);


        return null;
    }

    @Override
    public void registerForEvent(EventHandler<ActionEvent> e) {


    }

    @Override
    public void setStrategyPanelT(StrategyPanelT strategyPanelT) {
        this.strategyPanelT = strategyPanelT;
    }

}
