import simpleFactory.ButtonFactory;
import simpleFactory.client.LoginScreen;
import simpleFactory.client.SettingsScreen;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LoginScreen loginScreen = new LoginScreen();
        loginScreen.render("Linux");

        SettingsScreen settingsScreen= new SettingsScreen();
        settingsScreen.render("Windows");
    }
}