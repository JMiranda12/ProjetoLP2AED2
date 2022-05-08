package edu.ufp.inf.projeto.Classes;

import ST.BST_Aed2;
import ST.RedBlackBSTAed2;
import ST.SeparateChainingHashST_Aed2;

import java.util.ArrayList;
import java.util.Date;

public class User {

    private String nome;

    private String accountType;






    //------Construtor

    public User(String nome,int id,Date dataNascimento,String accountType){
        this.nome = nome;
        this.accountType = accountType;

    }


    // gets and sets
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getAccountType(){
        return accountType;
    }

    public void setAccountType(String accountType){
        this.accountType= accountType;
    }
}
