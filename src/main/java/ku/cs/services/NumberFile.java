package ku.cs.services;

import java.io.*;

public class NumberFile implements MyFile {
    private File file;
    
    public NumberFile(String dir, String filename) {
        file = new File(dir);
        if(!file.exists()) {
            file.mkdirs();
        }
        file = new File(dir + File.separator + filename);
        if (!file.exists()) {
            try {
                file.createNewFile();
                write("0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public Object read() {
        String s = null;
        try {
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);
            s = buffer.readLine();
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public void write(Object data) {
        String s = data.toString();
        FileWriter writer;
        BufferedWriter buffer;
        try {
            writer = new FileWriter(file);
            buffer = new BufferedWriter(writer);
            buffer.write(s);
            buffer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
