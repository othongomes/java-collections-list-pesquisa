package ordenação_numeros;

public class Numeros {

    private Integer numero;

    public Numeros(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "numero=" + numero +
                '}';
    }
}
