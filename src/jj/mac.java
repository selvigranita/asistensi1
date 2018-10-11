/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jj;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author Selvi Dwi Granat
 */
public class mac {
     public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            NetworkInterface ni = NetworkInterface.getByInetAddress(address);
            if (ni != null) {
                byte[] mac = ni.getHardwareAddress();
                if (mac != null) {
                   
                    System.out.print("MAC Address dari interface " + address + " adalah ");
                    for (int i = 0; i < mac.length; i++) {
                        System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                    }
                    System.out.println();
                } else {
                    System.out.println("Address tidak ada atau tidak dapat diakses.");
                }
            } else {
                System.out.println("Network Interface untuk alamat tersebut tidak ditemukan.");
            }
        } catch (UnknownHostException e) {
            //e.printStackTrace();
        } catch (SocketException e) {
            //e.printStackTrace();
        }
    }
}