package StrategyDesignPattern.Compression.CompressionMethod;

import StrategyDesignPattern.Compression.ICompressionStrategy;

public class _7zip implements ICompressionStrategy {
    @Override
    public void compress(String filePath) {
        System.out.printf("Compressing \"%s\" into 7ZIP\n", filePath);
    }

    @Override
    public void decompress(String filePath) {
        System.out.printf("De-Compressing \"%s\" from 7ZIP\n", filePath);
    }
}
