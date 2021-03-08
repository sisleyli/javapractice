import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        LinkedList<Hero> heros = new LinkedList<>();
        for(int i = 0; i < 100; i++)
            heros.add(new Hero("Hero "+ i,i));
        Hero h = heros.removeLast();
    }
}