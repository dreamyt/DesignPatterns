package factory_method.example;

import factory_method.example.buttons.*;
import factory_method.example.factory.*;
/**
 *
 */
public class Demo {
    private static Dialog dialog;
    public static void main(String[] args){
        configure();
        runBusinessLogic();
    }

    public static void configure() {
        if(System.getProperty("os.name").equals("Windows 10")){
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    public static void runBusinessLogic(){
        dialog.renderWindow();
    }
}
