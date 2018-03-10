
package boletin20;

public class Libro {
    String nome,autor;
    double precio;
    int unidades;

    public Libro() {
    }

    public Libro(String nome, String autor, double precio, int unidades) {
        this.nome = nome;
        this.autor = autor;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "nome=" + nome + ", autor=" + autor + ", precio=" + precio + ", unidades=" + unidades + '}';
    }
    
}
