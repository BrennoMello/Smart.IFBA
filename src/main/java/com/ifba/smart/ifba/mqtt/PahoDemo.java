/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifba.smart.ifba.mqtt;

/**
 *
 * @author brenno.mello
 */
public class PahoDemo {
    
    private MqttClient client;
    
    
    public void doDemo() {
         try {
            client = new MqttClient("tcp://localhost:1883", "pahomqttpublish1");
            client.connect();
            MqttMessage message = new MqttMessage();
            message.setPayload("A single message".getBytes());
            client.publish("pahodemo/test", message);
            client.disconnect();
         } catch (MqttException e) {
            e.printStackTrace();
         }
  }
}
