import java.util.ArrayList;
import java.util.List;

public class Hotel {
    
    private List<Habitacion> habitaciones;
    private List<Reserva> reservas;

    public Hotel(int totalHabitaciones) {
        habitaciones = new ArrayList<>();
        reservas = new ArrayList<>();
        for (int i = 1; i <= totalHabitaciones; i++) {
            habitaciones.add(new Habitacion(i));
        }
    }

    public Habitacion buscarDisponible() {
        for (Habitacion h : habitaciones) {
            if (h.isDisponible()) {
                return h;
            }
        }
        return null;
    }

    public Reserva crearReserva(String cliente) {
        
        Habitacion disponible = buscarDisponible();
        if (disponible != null) {
            Reserva r = new Reserva(cliente, disponible);
            reservas.add(r);
            return r;
        }
        return null;
    }

    public void mostrarEstadoHabitaciones() {
        for (Habitacion h : habitaciones) {
            System.out.println(h);
        }
    }
}
