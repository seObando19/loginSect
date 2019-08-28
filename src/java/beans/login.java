/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author sebas
 */
public class login implements Serializable{
    
    //Atributos
    private String usuario;
    private String clave;
    
    //Metodos

    public login() {
    }   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    //Metodo con los datos de la autenticacion(password)
    public boolean autenticacion()
    {
        return (clave.equals("123"))?true:false;
    }
}
