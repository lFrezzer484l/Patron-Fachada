package fachada;
import fachada.checkFacade;

public class app {

    public static void main(String[] args) {
        checkFacade cliente1 = new checkFacade();
        cliente1.buscar("02/07/2018", "08/07/2018", "Colombia", "Argentina");
        
        checkFacade cliente2 = new checkFacade();
        cliente2.buscar("04/08/2018", "09/08/2018", "colombia", "Argentina");
    }
    
}
