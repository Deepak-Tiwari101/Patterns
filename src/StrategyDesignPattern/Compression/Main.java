package StrategyDesignPattern.Compression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter filepath for compression/decompression: ");
        String filePath = sc.nextLine();
        System.out.print("Select from the below option number:\n->7Zip\n->RAR\n");
        String input = sc.nextLine();
        CompressionMethodRegistry method = new CompressionMethodRegistry();
        ICompressionStrategy strategy = method.getStrategy(input.toLowerCase());
        strategy.compress(filePath);
        strategy.decompress(filePath);
    }
}
