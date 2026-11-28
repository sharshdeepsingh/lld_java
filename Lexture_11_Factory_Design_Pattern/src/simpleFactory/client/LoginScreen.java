package simpleFactory.client;

import simpleFactory.ButtonFactory;
import simpleFactory.product.Button;

public class LoginScreen {

    public void render(String os){
Button button= ButtonFactory.createButton(os);
button.render();
    }

}
