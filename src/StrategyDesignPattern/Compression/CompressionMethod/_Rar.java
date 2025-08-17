package StrategyDesignPattern.Compression.CompressionMethod;

import StrategyDesignPattern.Compression.ICompressionStrategy;

public class _Rar implements ICompressionStrategy {
    @Override
    public void compress(String filePath) {
        System.out.printf("Compressing \"%s\" into RAR file\n", filePath);
    }

    @Override
    public void decompress(String filePath) {
        System.out.printf("De-Compressing \"%s\" from RAR file\n", filePath);
    }
}
