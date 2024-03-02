package ads.poo;

import java.io.IOException;
import java.util.Scanner;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

import barcode.CodigoDeBarra;

import java.nio.file.FileSystems;
import java.nio.file.Path;


public class App {
   
    public static void main(String[] args) throws IOException, WriterException {
        
        //Parte 1

        // Scanner linha = new Scanner(System.in);
        // int cont = 0;

        // while (linha.hasNext()) {
        //     String aux = linha.nextLine();
        //     cont++;
        //     System.out.println(cont + " - " + aux.toUpperCase());
        // }

        // Parte 2

        // if (args.length > 0) {
        //     System.out.println("Olá " + args[0]);
        // }
        
        // Parte 3

        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        
        String msg = "https://www.ifsc.edu.br";

        BitMatrix bitMatrix = qrCodeWriter.encode(msg, BarcodeFormat.QR_CODE, 600, 600);

        Path arquivo = FileSystems.getDefault().getPath("qrcode.png");
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", arquivo);
    }
}
