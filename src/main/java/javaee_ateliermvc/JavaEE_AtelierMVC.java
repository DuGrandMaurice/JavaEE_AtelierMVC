package javaee_ateliermvc;

import javaee_ateliermvc.controller.Controller;
import javaee_ateliermvc.model.Model;
import javaee_ateliermvc.view.View;

public class JavaEE_AtelierMVC {
    public static void main(String[] args){
        Controller c = new Controller(new Model(), new View());
        c.run();
    }
}
