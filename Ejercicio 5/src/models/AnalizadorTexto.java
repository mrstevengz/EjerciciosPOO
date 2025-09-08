package models;

public class AnalizadorTexto {
    private String texto;

    public AnalizadorTexto(String texto) {
        this.texto = texto;
    }

    public int countWords(String texto) {
        int count = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.trim().charAt(i) == ' ') {
                count += 1;
            }
        }
        return count + 1;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
