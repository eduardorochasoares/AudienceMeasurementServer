/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileTransfer;

import FileTransfer.ClientHandler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Principal
 */
public class MultiEchoServer {

    public static void main(String[] args) {
        ServerSocket server;
        try {
            server = new ServerSocket(8009);
            ServerConfig serverConfig = readConfigs();
            while (true) {
                Socket clSocket = server.accept();
                new ClientHandler(clSocket, serverConfig).start();
            }
        } catch (IOException ex) {
            Logger.getLogger(MultiEchoServer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static ServerConfig readConfigs() {
        FileReader config;
        ServerConfig serverConfig = new ServerConfig();
        try {
            config = new FileReader("config.txt");
            BufferedReader lerArq = new BufferedReader(config);
            String linha;
            String c[];
            String aux[];
            linha = lerArq.readLine();
            int cont = 0;
            while (linha != null) {
                c = linha.split(":");
                aux = c[1].split(",");
                switch (cont) {
                    case 0:
                        serverConfig.getTransportProtocol().addAll(Arrays.asList(aux));
                        break;

                    case 1:
                        serverConfig.getCryptographicProtocol().addAll(Arrays.asList(aux));
                        break;

                    case 2:
                        serverConfig.getPermissionMode().addAll(Arrays.asList(aux));
                        break;

                    case 3:
                        serverConfig.getConfigurationMode().addAll(Arrays.asList(aux));
                        break;

                    case 4:
                        serverConfig.getDeliveryMode().addAll(Arrays.asList(aux));
                        break;

                    case 5:
                        serverConfig.getCompression().addAll(Arrays.asList(aux));
                        break;
                }
                linha = lerArq.readLine();
                cont++;
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return serverConfig;
    }

}
