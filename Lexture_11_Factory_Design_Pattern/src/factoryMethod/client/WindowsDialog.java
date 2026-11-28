package factoryMethod.client;

import factoryMethod.product.Button;
import factoryMethod.product.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
