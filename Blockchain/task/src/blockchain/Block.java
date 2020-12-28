package blockchain;

public class Block {

    int id;
    long timestamp;
    String previousHash;
    String currentHash;

    public Block(int id, long timestamp, String previousHash, String currentHash) {
        this.id = id;
        this.timestamp = timestamp;
        this.previousHash = previousHash;
        this.currentHash = currentHash;
    }
}
