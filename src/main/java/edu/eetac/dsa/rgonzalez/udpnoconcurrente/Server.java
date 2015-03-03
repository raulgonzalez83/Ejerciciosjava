package edu.eetac.dsa.rgonzalez.udpnoconcurrente;

import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException {
        new DaytimeUDPServer().start();
    }
}