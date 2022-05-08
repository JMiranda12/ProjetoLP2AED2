package edu.ufp.inf.projeto.Classes;

import ST.RedBlackBSTAed2;

public class Ways {

    private String nome;
    private String type;

    private static RedBlackBSTAed2<String,Ways> waysRB = new RedBlackBSTAed2<>();


// Construtor

    public Ways(String nome,String type){
        this.nome=nome;
        this.type=type;
    }


//Gets and Sets

public String getNome(){
        return nome;
}

public void setNome(String nome){
        this.nome = nome;
}
public String getType(){
        return type;
}
public void setType(String type){
        this.type = type;
}
public RedBlackBSTAed2<String,Ways> getWaysRB(){
        return getWaysRB();
}
    /**
     * Criar uma nova Way
     *
     * @param n Nome
     * @param t Tipo
     * @return Way
     */

    public static Ways createWay(String n, String t){
        Ways a = new Ways(n,t);
        if (waysRB.contains(n)){
            System.out.println("Way já registada");
        }else{
            waysRB.put(n,a);
        }
        return a;
    }

    /** Registrar PoI numa way
     *
     * @param
     */
}
