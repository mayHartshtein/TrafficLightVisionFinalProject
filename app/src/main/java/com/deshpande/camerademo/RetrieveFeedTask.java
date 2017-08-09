package com.deshpande.camerademo;

import android.os.AsyncTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.URL;

/**
 * Created by DELL on 03/06/2017.
 */
class RetrieveFeedTask extends AsyncTask {

    @Override
    protected Object doInBackground(Object[] objects) {

        // TODO Auto-generated method stub
        InetAddress serverAddr = null;
        SocketAddress sc_add = null;
        Socket socket = null;

        try {
            sc_add = new InetSocketAddress("10.0.0.11", 9000);
            socket = new Socket();
            socket.connect(sc_add, 9000);

            socket.close();


        } catch (Exception e) {

            e.printStackTrace();

        }

        return null;
    }
}
