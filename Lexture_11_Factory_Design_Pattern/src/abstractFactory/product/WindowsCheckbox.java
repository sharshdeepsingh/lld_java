package abstractFactory.product;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Rendered checkbox: WINDOWS");
    }
}
