package fachada;

import api.avionApi;
import api.hotelApi;

public class checkFacade {
    private avionApi avionAPI;
    private hotelApi hotelAPI;
    
    public checkFacade() {
    
        avionAPI = new avionApi();
        hotelAPI = new hotelApi();
    }
    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        avionAPI.busquedaAvion(fechaIda, fechaVuelta, origen, destino);
        hotelAPI.busquedaHotel(fechaIda, fechaIda, origen, destino);
    }
}
