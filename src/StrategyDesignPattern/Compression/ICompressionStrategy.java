package StrategyDesignPattern.Compression;

public interface ICompressionStrategy {
    void compress(String filePath);
    void decompress(String filePath);
}
