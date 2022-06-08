package br.com.agromut.dao;

import java.util.List;

public interface GenericDAO {
    
     public Boolean cadastrar(Object object);
    
     public List<Object> listar(); // não recebe nada, mas retorna uma lista
     
     public Object carregar(int idObject); // recebe objeto
     
     public Boolean alterar(Object object); // recebe objeto e retorna booleano
     
     
}
