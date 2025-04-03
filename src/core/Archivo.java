/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author dubalaguilar
 */
public class Archivo {
    private String RUTA_ARCHIVO_MASCOTAS = "mascotas.csv";
    private String RUTA_ARCHIVO_DUEÑO = "dueños.csv";
    
    //Agregar Construtor

    public Archivo() {
        cargarDatosDelasMacotas();
    }
    
    public void cargarDatosDelasMacotas(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(RUTA_ARCHIVO_MASCOTAS))){
            String linea;
            while((linea = bufferedReader.readLine())!= null){
                
            }
        }catch(IOException e){
            
        }
    }
    
    
}
