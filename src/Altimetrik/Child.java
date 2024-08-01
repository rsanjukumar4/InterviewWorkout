package Altimetrik;

import java.io.IOException;

public class Child extends Parent {

    public void method() throws IOException {
        System.out.println("child");
    }

    public static void main(String[] args) throws IOException {
        Parent obj = new Child();
        obj.method();
    }

}
