package com.deshpande.camerademo;

import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URL;

/**
 * Created by DELL on 03/06/2017.
 */
class RetrieveFeedTask extends AsyncTask {
    Socket socket = null;

    public Socket getSocket() {
        return socket;
    }

    public PrintWriter getPw() {
        return pw;
    }

    public BufferedReader getBr() {
        return br;
    }

    PrintWriter pw;
    BufferedReader br;

    @Override
    protected Object doInBackground(Object[] objects) {

        // TODO Auto-generated method stub
        InetAddress serverAddr = null;
        SocketAddress sc_add = null;

        try {
            sc_add = new InetSocketAddress("192.168.239.1", 9000);
            socket = new Socket();
            socket.connect(sc_add, 9000);
            pw = new PrintWriter(socket.getOutputStream(), true);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));



        } catch (Exception e) {

            e.printStackTrace();

        }

        return null;
    }

    boolean sendImage(Object im){
        pw.write(1);
        pw.flush();
        return false;
    }
}
