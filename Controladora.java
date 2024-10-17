/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jazie
 */
public class Controladora {
    public static void main(String[] args) {
        new Thread(new Reloj()).start();
        new Thread(new Ejecutor("calc", 5)).start();
    }
}
