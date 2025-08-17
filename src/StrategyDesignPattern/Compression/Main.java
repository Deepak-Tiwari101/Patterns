package StrategyDesignPattern.Compression;

import StrategyDesignPattern.Compression.CompressionMethod._7zip;
import StrategyDesignPattern.Compression.CompressionMethod._Rar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filepath for compression/decompression: ");
        String filePath = sc.nextLine();
        System.out.print("Select from the below option number:\n1. 7Zip\n2. RAR\n");
        String input = sc.nextLine();
        switch (input) {
            case "1" -> {
                CompressionTool tool = new CompressionTool();
                tool.setCompressionStrategy(new _7zip());
                tool.compressFile(filePath);
                tool.decompressFile(filePath);
            }
            case "2" -> {
                CompressionTool tool = new CompressionTool();
                tool.setCompressionStrategy(new _Rar());
                tool.compressFile(filePath);
                tool.decompressFile(filePath);
            }
            default -> throw new RuntimeException("Wrong Option: Sahi se select kar warna aise hi exceptions dikhenge");
        }
    }
}
