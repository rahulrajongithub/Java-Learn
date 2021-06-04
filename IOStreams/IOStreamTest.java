package IOStreams;

import java.io.FileInputStream;
import java.io.InputStream;

public class IOStreamTest {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\USER\\Desktop\\Coding\\JavaCodes\\Java-Learn\\IOStreams";
        InputStream input = new FileInputStream(path);
        int data = input.read();
        while(data != -1){
            data = input.read();
            System.out.println(data);
        }
    }
    
}
