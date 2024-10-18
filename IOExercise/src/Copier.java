import java.io.*;

public class Copier {

    FileInputStream inputStream;
    FileOutputStream outputStream;

    public Copier() throws FileNotFoundException {
        this.inputStream = new FileInputStream("src/supermario.png");
        this.outputStream = new FileOutputStream("src/copyofsupermario.png");
        if (inputStream == null || outputStream == null) {
            throw new FileNotFoundException();
        }
    }

    public byte[] readImage() throws IOException {
        byte[] buffer = new byte[173014];
        if (inputStream == null) {
            throw new IOException();
        }
        inputStream.read(buffer);
        inputStream.close();
        return buffer;
    }

    public void copyImage(byte[] numberOfBytes) throws IOException {
        if (numberOfBytes.length == 0) {
            throw new IOException();
        }
        outputStream.write(numberOfBytes);
        outputStream.close();
    }
}