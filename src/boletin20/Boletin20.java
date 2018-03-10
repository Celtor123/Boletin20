
package boletin20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin20 {
    File ficheiro= new File("a.txt");
    ArrayList <Libro> liston;

    public Boletin20() {
        this.liston = new ArrayList<>();
    }
    public void engadir(){
        try{
           String z= JOptionPane.showInputDialog("escriba o nume");
           String x= JOptionPane.showInputDialog("escriba o autor");
            String zo= JOptionPane.showInputDialog("escriba o precio");
           double t=Double.parseDouble(zo);
           String e= JOptionPane.showInputDialog("escriba o nume");
           int r=Integer.parseInt(e);
          
           liston.add(new Libro(z,x,t,r));
           PrintWriter a= new PrintWriter(ficheiro); 
           liston.forEach((nome) -> {
               a.println(nome);
            }); 
        }
        catch(FileNotFoundException t){
            System.out.println("obxecto non encontrado"+ficheiro);
        }    
    }    
    public static void main(String[] args) {
      Boletin20 a= new Boletin20();
      a.engadir();
    }
    
}

//Supoñer que queredes facer o mantemento dun ficheiro dunha librería .  Dos libros imos considerar 4 atributos :
//Nome do libro
//Autor
//Precio
//unidades
//     Para facer o mantemento  utiliza un menú cos seguintes puntos :
//a) engadir  engade un novo libro ao noso ficheiro
//b) consultar dado o título dun libro visualizar o seu precio . se o libro non o temos na librería visualizamos unha mensaxe
//c) visualizar visualiza todos os datos do ficheiro
//d) borrar  borra os libros que teñan 0 unidades
//e) modificar  modifica o precio dun libro determinado