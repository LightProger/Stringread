package Alexandr_Nikitchenko;

import java.io.*;
public class StringRead extends Exception {

    //Чтение из файла
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Александр.Acer\\Documents\\GitHub" +
                "\\Stringread\\src\\Alexandr_Nikitchenko\\Read.txt"));
       // null - конец файла. Пока не достигнут конец файла, считывать строки и выводить на печать
        while(true){
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }

    }
}
