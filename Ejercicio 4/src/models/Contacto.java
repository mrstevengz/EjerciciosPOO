package models;

public class Contacto {
    private String nombre;
    private String correo;
    private String telefono;

    public Contacto(String nombre, String correo, String telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contacto{ ");
        sb.append("nombre:'").append(nombre).append('\'');
        sb.append(", correo:'").append(correo).append('\'');
        sb.append(", telefono:'").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
