package ro.siit.io;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFileExample {

    public static void main(String[] args) {
        long before = System.currentTimeMillis();
//        copyFile();
        copyFileBuffer();
        System.out.println(System.currentTimeMillis() - before);
    }

    static void copyFile() {
        System.out.println(System.getProperty("user.dir"));
        try(InputStream inputStream = new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"main/resources/exemplul1.txt"));
            OutputStream outputStream = new FileOutputStream(System.getProperty("user.dir")+"/src/main/resources/copyExemplu.txt")
        ){
            int citit;
            while ((citit = inputStream.read()) != -1){
                outputStream.write(citit);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void copyFileBuffer() {
        System.out.println(System.getProperty("user.dir"));
        try(InputStream inputStream = new BufferedInputStream(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"main/resources/exemplul1.txt")));
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(System.getProperty("user.dir")+"/src/main/resources/copyExemplu.txt"))
        ){
            byte[] buffer = new byte[1024];
            int citit;
            while ((citit = inputStream.read(buffer)) != -1){
                outputStream.write(buffer,0,citit);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
