/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.PeliculaControl;
import controlador.PersonajeControl;
import modelo.Personaje;
import servicio.PersonajeServiceImpl;

/**
 *
 * @author Niko
 */
public class Vista {
     public static void main(String[] args) {
    var vectorcon =new String[5];
    vectorcon[0]="El conserje";
    vectorcon[1]="Will Smith";
    vectorcon[2]="Tritagonista";
    vectorcon[3]="Feo pero gracioso";
    vectorcon[4]="10";
    var prueba =new PersonajeControl();
    System.out.println(prueba.crear(vectorcon));
    
    
    var vectorcon1 =new String[5];
    vectorcon1[0]="JhonWick";
    vectorcon1[1]="Keanu Reeves";
    vectorcon1[2]="Tritagonista";
    vectorcon1[3]="Antiheroe, mata con un lapiz";
    vectorcon1[4]="10";
    System.out.println(prueba.crear(vectorcon1));
    
    
    var vectorcon2 =new String[5];
    vectorcon2[0]="Heisemberg";
    vectorcon2[1]="Aero Smit";
    vectorcon2[2]="Protagonista";
    vectorcon2[3]="Loco sin remodimiento";
    vectorcon2[4]="7";
    System.out.println(prueba.crear(vectorcon2));
    
    
    var vectorcon3 =new String[5];
    vectorcon3[0]="Pablo escobar";
    vectorcon3[1]="Tom Hanks";
    vectorcon3[2]="Antagonista";
    vectorcon3[3]="Malo y despiadado";
    vectorcon3[4]="5";
    System.out.println(prueba.crear(vectorcon3));
    System.out.println(prueba.listar());
    
    
   
   
    
    
    
   var vectorcon5=new String[7];
   vectorcon5[0]="Evangelion";
    vectorcon5[1]="3";
    vectorcon5[2]="2003";
    vectorcon5[3]="8";
    vectorcon5[4]="10";
    vectorcon5[5]="3";
    vectorcon5[6]="Es una pelicula de ciencia ficion.";
  
  
    
    var pelicula1=new PeliculaControl();
    System.out.println(pelicula1.crear(vectorcon5, prueba.listar()));
    
    
    
  //-------------------------------------------------------------------------------------------------------------
  //-------------------------------------------------------------------------------------------------------------
    var eliminador=new String[1];
    eliminador[0]="Pablo escobar";
    System.out.println(prueba.eliminar(eliminador));
   System.out.println(prueba.listar());
   
   
   var vectorcon6=new String[7];
   vectorcon6[0]="Evangelion Revenge";
    vectorcon6[1]="3";
    vectorcon6[2]="2005";
    vectorcon6[3]="8";
    vectorcon6[4]="10";
    vectorcon6[5]="4";
    vectorcon6[6]="Es una pelicula de ciencia ficion donde se vengan.";
    System.out.println(pelicula1.crear(vectorcon6, prueba.listar()));
    
    //-------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------
    var vectorcon4 =new String[5];
    vectorcon4[0]="La Roca";
    vectorcon4[1]="Dwayne Jhnson";
    vectorcon4[2]="Protagonista";
    vectorcon4[3]="Hombre fuerte pero de poco cerebro";
    vectorcon4[4]="6";
    var prueba2=new PersonajeControl();
    System.out.println(prueba2.crear(vectorcon4));
    System.out.println(prueba2.listar());
    
    var modificador=new String[1];
    modificador[0]="El conserje";
    System.out.println(prueba.modificar(modificador, prueba2));
    System.out.println(prueba.listar());
    
   var vectorcon7=new String[7];
   vectorcon7[0]="Evangelion contrataca";
    vectorcon7[1]="3";
    vectorcon7[2]="2008";
    vectorcon7[3]="8";
    vectorcon7[4]="10";
    vectorcon7[5]="3";
    vectorcon7[6]="Es una pelicula de ciencia ficion donde contratacan.";

    System.out.println(pelicula1.crear(vectorcon7, prueba.listar()));
    System.out.println(pelicula1.listar());
}
     
}