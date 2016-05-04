/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileTransfer;

import FileTransfer.ClientHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Principal
 */
public class MultiEchoServer {

    public static void main(String[] args) {
        while (true) {
            try {
                ServerSocket server = new ServerSocket(8009,0, InetAddress.getByName("::1"));
                Socket clSocket = server.accept();
                new ClientHandler(clSocket).start();

            } catch (IOException e) {
            }
        }
    }
}
