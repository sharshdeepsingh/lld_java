package factoryMethod.client;

import factoryMethod.product.AndroidButton;
import factoryMethod.product.Button;

public class AndroidDialog extends Dialog{
    @Override
    Button createButton() {
        return new AndroidButton();
    }
}
