
package com.qualitas.mbeans;

import com.qualitas.entities.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
@Named(value = "managedBean")
@Dependent
public class ManagedBean {
    
    private String cadena = "Hola desde el MB";
    
    private Cliente cliente;
    
    private List<Cliente> lista;
    
    
    
    public ManagedBean() {
    }
    
    @PostConstruct
    private void inicializar(){
        setCliente(new Cliente("Jose Juan"
                ,"236472fss"
                ,"Ford"
                ,2016));
        
        
        lista = new ArrayList<>();
        
        lista.add(new Cliente("Jose Juan"
                ,"236472fss"
                ,"Ford"
                ,2016));
        
        lista.add(new Cliente("Ramiro Lopez"
                ,"23sdfds64fss"
                ,"Ford"
                ,2015));
        lista.add(new Cliente("Rafael Lorenzo"
                ,"sdfds472fss"
                ,"Chevrolet"
                ,2014));
        
        
        
    }

    
    
    
    

    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the lista
     */
    public List<Cliente> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }
    
   
    
    
}
