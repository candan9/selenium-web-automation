package util;

import java.io.*;

public class FileProccess {
    File classpathRoot;
    FileReader fr;
    File fileDir;
    File file;
    FileWriter fw;
    BufferedReader br;
    BufferedWriter writer;
    public FileProccess() throws IOException {
        this.classpathRoot = new File(System.getProperty("user.dir"));
        this.fileDir = new File(classpathRoot, "src/test/resources/");
        this.file = new File(fileDir, "test-data.txt");
        this.fw = new FileWriter(file);
        this.writer = new BufferedWriter(fw);
        this.fr= new FileReader(file);
        this.br = new BufferedReader(fr);
    }
    public void writeText(String text) throws IOException {
        writer.write(text);
        writer.close();
    }
    public String readText() throws IOException {
        String readLine;
        while((readLine=br.readLine())!=null){
            return readLine;
        }
        return null;
    }
}
