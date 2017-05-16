/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifba.smart.ifba.serial;

/**
 *
 * @author brenno
 */
public class MainSerial {
    public static void main(String args[]){
        ComunicacaoSerial serial = new ComunicacaoSerial("COM3",9600);
        while(true){
            byte [] bytes = new byte [8];
            serial.getDados(bytes);
            System.out.print(String.valueOf(bytes));
        }
    }
}
