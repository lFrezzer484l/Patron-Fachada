package api;

public class avionApi {
    public void busquedaAvion(String fechaIda, String fechaVuelta, String origen, String destino){
        System.out.println("/--------------------------/");
        System.out.println("Vuelos encontrados para : " + destino + " desde " + origen);
        System.out.println("Fecha IDA: " + fechaIda +  " Fecha Vuelta " + fechaVuelta);
        System.out.println("/--------------------------/");
    }
}
