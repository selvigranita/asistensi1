/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jj;
import java.io.*;
import java.net.*;

/**
 *
 * @author Selvi Dwi Granat
 */
public class IPSCAN {
    public static void main(String[] args) throws UnknownHostException, IOException {
        InetAddress Lch = InetAddress.getLocalHost();
        System.out.println(Lch);
        byte[] ip=Lch.getAddress();
        int i=0;
        while ( i < 254) {
            System.out.println("nilai i :" + i);
            i++;
            ip[3]= (byte)i;
            InetAddress add = InetAddress.getByAddress(ip);
            
            if(add.isReachable(3000)){
                System.out.println(add.getHostAddress()+"is active");
            }else{
                System.out.println(add.getHostAddress()+"is not active");
            }
            }
        }
    
}
