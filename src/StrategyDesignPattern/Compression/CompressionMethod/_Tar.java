package StrategyDesignPattern.Compression.CompressionMethod;

import StrategyDesignPattern.Compression.ICompressionStrategy;

public class _Tar implements ICompressionStrategy {
    @Override
    public void compress(String filePath) {
        System.out.printf("Compressing \"%s\" into tar file\n", filePath);
    }

    @Override
    public void decompress(String filePath) {
        System.out.printf("De-Compressing \"%s\" from tar file\n", filePath);
    }
}
