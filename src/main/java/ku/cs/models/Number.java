package ku.cs.models;

import ku.cs.services.MyFile;
import ku.cs.services.NumberFile;

public class Number {
    private MyFile file;
    private int number;

    public Number() {
        file = new NumberFile("data", "number.txt");
        number = Integer.parseInt(file.read().toString());
    }

    public void increase() {
        number++;
        file.write(number);
    }

    public int getNumber() {
        return number;
    }
}
