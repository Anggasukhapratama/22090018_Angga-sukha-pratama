/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafenice;

/**
 *
 * @author ASUS
 */
public class MainApplication {
     public static void main(String[] args) {
        Bill billFrame = new Bill();
        CameraQr cameraFrame = new CameraQr();

        billFrame.setCameraFrame(cameraFrame);
        cameraFrame.setBillFrame(billFrame);

        billFrame.setVisible(true);
        cameraFrame.setVisible(true);
    }
}
