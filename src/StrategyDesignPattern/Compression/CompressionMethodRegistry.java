package StrategyDesignPattern.Compression;

import StrategyDesignPattern.Compression.CompressionMethod._7zip;
import StrategyDesignPattern.Compression.CompressionMethod._Rar;

import java.util.HashMap;
import java.util.Map;

public class CompressionMethodRegistry {
    private final Map<String, ICompressionStrategy> strategies = new HashMap<>();
    public CompressionMethodRegistry() {
        register("7zip", new _7zip());
        register("rar", new _Rar());
    }
    public void register(String input, ICompressionStrategy strategy) {
        strategies.put(input, strategy);
    }
    public ICompressionStrategy getStrategy(String input) {
        if(!strategies.containsKey(input)) {
            throw new IllegalArgumentException("Unknown Compression type");
        }
        return strategies.get(input);
    }
}
