package bean;

import com.sun.org.apache.xerces.internal.xs.PSVIProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u10154925179
 */
public class ListaUsuariosA {
    public static void main(String[] args) {
        List lista = new ArrayList();
        Usuarios usuarios = new Usuarios();
        usuarios.setIdUsuarios(1);
        usuarios.setNome("jonas");
        usuarios.setApelido("JONASSSSS");
        usuarios.setCpf("145.698.588-25");
        
        lista.add(usuarios);
    
        Usuarios usuarios1 = new Usuarios();
         usuarios1.setIdUsuarios(2);
        usuarios1.setNome("Carlos");
        usuarios1.setApelido("CARLOSSS");
        usuarios1.setCpf("145.656.874-25");
        
         lista.add(usuarios1);
         
          Usuarios usuarios2 = new Usuarios();
         usuarios2.setIdUsuarios(3);
        usuarios2.setNome("Will");
        usuarios2.setApelido("AMr. Musculos");
        usuarios2.setCpf("145.656.874-25");
        
         lista.add(usuarios2);

         
         Collections.sort(lista);
         for (Object usuarios3 : lista) {
             System.out.println(((Usuarios)usuarios3).getApelido());
         }
    }
            
        }
    
    
    
    

