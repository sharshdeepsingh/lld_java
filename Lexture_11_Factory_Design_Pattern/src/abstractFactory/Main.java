package abstractFactory;

import abstractFactory.factory.GUIFactory;
import abstractFactory.factory.LinuxFactory;
import abstractFactory.factory.MacFactory;
import abstractFactory.factory.WindowsFactory;
import abstractFactory.product.Button;
import abstractFactory.product.Checkbox;
import abstractFactory.product.MacButton;
import abstractFactory.product.MacCheckbox;
import factoryMethod.client.Dialog;
import factoryMethod.client.MacDialog;
import factoryMethod.client.WindowsDialog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String os="windows";

        GUIFactory factory;

        if("Windows".equalsIgnoreCase(os)){
            factory= new WindowsFactory();
        }
        else if("Mac".equalsIgnoreCase(os)){
            factory= new MacFactory();
        }
        else if("Linux".equalsIgnoreCase(os)){
            factory= new LinuxFactory();
        }
        else{
            throw new IllegalArgumentException("O S is not allowed");
        }

        Application application= new Application(factory);
        application.renderUI();
    }
}