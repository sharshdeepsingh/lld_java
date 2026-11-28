package simpleFactory;

import factoryMethod.client.Dialog;
import factoryMethod.client.MacDialog;
import factoryMethod.client.WindowsDialog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        LoginScreen loginScreen = new LoginScreen();
//        loginScreen.render("Linux");
//
//        SettingsScreen settingsScreen= new SettingsScreen();
//        settingsScreen.render("Windows");

        Dialog dialog= new WindowsDialog();
        dialog.render();
        System.out.println("--------------------------");
        System.out.println("RENDERING WINDOWS BUTTON");


        System.out.println("--------------------------");

        dialog= new MacDialog();
        dialog.render();
        System.out.println("RENDERING MAC BUTTON");
    }
}