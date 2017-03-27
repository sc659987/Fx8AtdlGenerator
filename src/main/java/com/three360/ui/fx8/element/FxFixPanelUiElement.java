package com.three360.ui.fx8.element;

import com.three360.fixatdl.layout.CheckBoxListT;
import com.three360.fixatdl.layout.ControlT;
import com.three360.fixatdl.layout.PanelOrientationT;
import com.three360.fixatdl.layout.StrategyPanelT;
import com.three360.ui.common.UiElementAbstractFactory;
import com.three360.ui.common.element.IFixCheckBoxListUiElement;
import com.three360.ui.common.element.IFixPanelUiElement;
import com.three360.ui.fx8.component.DaggerMyComponent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import javax.inject.Inject;
import java.util.stream.Collectors;

public class FxFixPanelUiElement implements IFixPanelUiElement<Node, EventHandler<ActionEvent>> {

    private StrategyPanelT strategyPanelT;

    @Inject
    UiElementAbstractFactory factory;


    public FxFixPanelUiElement() {
        DaggerMyComponent.builder().build().inject(this);
    }


    @Override
    public Node create() {
        if (this.strategyPanelT != null) {
            TitledPane titledPane = new TitledPane();
            titledPane.setCollapsible(this.strategyPanelT.isCollapsible());
            titledPane.setExpanded(!this.strategyPanelT.isCollapsed());
            Pane parent = (this.strategyPanelT.getOrientation() == PanelOrientationT.HORIZONTAL)
                    ? new HBox() : new VBox();
            //Container for either groups of parameters or strategyPanels, but not both.
            //I.e., a StrategyPanel will contain either all Control elements or all
            //StrategyPanel elements.
            if (this.strategyPanelT.getStrategyPanel() != null && this.strategyPanelT.getStrategyPanel().size() > 0) {
                parent.getChildren().addAll(this.strategyPanelT
                        .getStrategyPanel()
                        .stream()
                        .map(eachStrategyPanelT -> {
                            final FxFixPanelUiElement element = new FxFixPanelUiElement();
                            element.setStrategyPanelT(eachStrategyPanelT);
                            return element.create();
                        }).collect(Collectors.toList()));
            } else if (this.strategyPanelT.getControl() != null) {
                // actually implement adding control
                parent.getChildren().setAll(
                        this.strategyPanelT.getControl().stream().map(controlT -> {
                            if (controlT instanceof CheckBoxListT) {
                                IFixCheckBoxListUiElement<Pane, EventHandler<ActionEvent>> element = factory.instantiateNewCheckBox();
                                element.setCheckBoxListT((CheckBoxListT) controlT);
                                return element.create();
                            }
                            return null;
                        }).collect(Collectors.toList()));

            }
            titledPane.setContent(parent);
            return titledPane;
        }
        return null;
    }

    private Node createControlByType(ControlT controlT) {

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
