package org.dominokit.domino.ui.Typography;

import elemental2.dom.HTMLElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;

import static org.jboss.elemento.Elements.strong;

public class Strong extends BaseDominoElement<HTMLElement, Strong> {

    private HTMLElement element = strong().element();

    public Strong(String text){
        element.textContent = text;
        init(this);
    }

    public static Strong of(String text){
        return new Strong(text);
    }

    @Override
    public HTMLElement element() {
        return element;
    }
}
