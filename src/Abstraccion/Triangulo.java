/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Nombre: Iván Antonio Morales García
//Asignatura: Facultativa I
//Trimestre: 3er
//Fecha: 12/11/2024
//Hora: 11:11 AM
package Abstraccion;
import javax.swing.JOptionPane;
public class Triangulo extends FigurasGeometricas{
    @Override
    public void AreaF()
    {
        System.out.println("Area del Triangulo");
        
        Base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Base del Triangulo"));
        AltT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Altura del Triangulo"));   
        Area = (Base * AltT)/ 2;      
        System.out.println("Base: " +Base);
        System.out.println("Altura: " +AltT);
        System.out.println("Formula: (Base * Altura)/ 2 ");        
        System.out.println("El area del Triangulo es: " +Area);
    }
}
