public class Habitacion {
    private int numero;
    private boolean disponible;
    
    public Habitacion(int numero) {
        this.numero = numero;
        this.disponible = true;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void ocupar() {
        this.disponible = false;
    }

    public void liberar() {
        this.disponible = true;
    }

    @Override //La anotación @Override indica que este método está sobrescribiendo un método de la superclase o interfaz.
    public String toString() {
        return "Habitación " + numero + " - " + (disponible ? "Disponible" : "Ocupada");
    }
}
