package ordenação_numeros;

import java.util.ArrayList;
import java.util.List;

public class SomarNumeros {

    private List<Integer> numerolist;

    public SomarNumeros() {
        this.numerolist = new ArrayList<>();
    }

    public void adicionarNumero (Integer numero){
        numerolist.add(numero);
    }

    public Integer calcularSoma() {
        Integer total =0;
        if(!numerolist.isEmpty()){
            for(Integer n: numerolist){
                total += n;
            }
            return total;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Integer encontrarMaiorNumero(){
        Integer maiorNumero = Integer.MIN_VALUE;
        if(!numerolist.isEmpty()){
            for(Integer n: numerolist){
                if( n >= maiorNumero ){
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }

    public Integer encontrarMenorNumero(){
        Integer menorNumero = Integer.MAX_VALUE;
        if(!numerolist.isEmpty()){
            for(Integer n: numerolist){
                if( n <= menorNumero ){
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if (!numerolist.isEmpty()){
            System.out.println(this.numerolist);
        }
    }


    public static void main(String[] args) {
        SomarNumeros sn = new SomarNumeros();

        sn.adicionarNumero(1);
        sn.adicionarNumero(2);
        sn.adicionarNumero(3);
        sn.adicionarNumero(4);
        sn.adicionarNumero(5);
        sn.adicionarNumero(6);
        System.out.println(sn.calcularSoma());
        System.out.println(sn.encontrarMaiorNumero());
        System.out.println(sn.encontrarMenorNumero());
        sn.exibirNumeros();


    }

}