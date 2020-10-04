package com.klayzz.designpattern.structure.decorator;

import java.io.*;

public class app {
    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("E:\\test\\data.txt");
        DataInputStream din = new DataInputStream(in);
        InputStream bin = new BufferedInputStream(din);

        int data = bin.read();
        System.out.println(data);
    }
}
