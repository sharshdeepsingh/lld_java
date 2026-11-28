package factoryMethod.client;

import factoryMethod.product.Button;

public abstract class Dialog {

    public  Button render(){
        return createButton();
    }

    abstract Button createButton();
}
