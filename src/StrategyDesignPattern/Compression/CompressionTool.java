package StrategyDesignPattern.Compression;

public class CompressionTool {
    private ICompressionStrategy compressionStrategy;

    public void setCompressionStrategy(ICompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void compressFile(String filePath) {
        compressionStrategy.compress(filePath);
    }
    public void decompressFile(String filePath) {
        compressionStrategy.decompress(filePath);
    }
}
