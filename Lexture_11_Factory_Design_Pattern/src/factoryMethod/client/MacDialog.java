package factoryMethod.client;

import factoryMethod.product.Button;
import factoryMethod.product.MacButton;

public class MacDialog extends Dialog{
    @Override
    Button createButton() {
        return new MacButton();
    }
}
