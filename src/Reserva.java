public class Reserva {
    private String cliente;
    private Habitacion habitacion;

    public Reserva(String cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.habitacion.ocupar();
    }

    public String getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    @Override
    public String toString() {
        return "Reserva de " + cliente + " en " + habitacion;
    }
}