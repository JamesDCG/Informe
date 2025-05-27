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

    @Override //La anotación @Override indica que este método está sobrescribiendo un método de la superclase o interfaz.
    public String toString() {
        return "Reserva de " + cliente + " en " + habitacion;
    }
}
