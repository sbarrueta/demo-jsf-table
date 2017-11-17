package com.qualitas.mbeans;


import com.qualitas.entities.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

@javax.faces.bean.ManagedBean
public class ManagedBeanLista {

    private List<Cliente> lista;
    
    
    private int numeroElementos;
    
    
    public ManagedBeanLista() {
    }
    
    @PostConstruct
    public void inicializar(){
        lista = new ArrayList<>();
        
        lista.add(new Cliente("Victor Flores","dfjbj3nsds","Ford",2017));
        lista.add(new Cliente("Rocio Flores","dfjbj3nsds","Fiat",2016));
        lista.add(new Cliente("Clara Perez","dddfdff24sds","VW",2015));
        lista.add(new Cliente("Juan Sanchez","333dfjbj3nsds","GM",2016));
        lista.add(new Cliente("Carlos Gomez","444dfjbj3nsd","Ford",2014));
    }
    
    
    public String navegar(){
        return "lista";
    }

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    public int getNumeroElementos() {
        numeroElementos= lista.size();

        return numeroElementos;
    }

    public void setNumeroElementos(int numeroElementos) {
        this.numeroElementos = numeroElementos;
    }
    
    
    
    
    
}
