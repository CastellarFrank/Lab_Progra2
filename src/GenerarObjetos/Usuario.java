package GenerarObjetos;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIGHTMARE
 */
public class Usuario {
    public char sexo;
    public String nombre,apellido,direccion,url;  
    
    public Usuario(String n,String a,String d,String u,char s){
        this.sexo=s;
        this.nombre=n;
        this.apellido=a;
        this.direccion=d;
        this.url=u;
    }
}
