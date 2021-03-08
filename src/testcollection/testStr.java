package testcollection;

import java.util.*;

public class testStr {
    public static char getRandomC(){
        int x = (int)(Math.random() * 10) % 3;
        int base = '0';
        switch (x){
            case 0 : {
                base = '0' + (int)(Math.random()*10);
                break;
            }
            case 1 :{
                base = 'A' + (int)(Math.random()*100)%26;
                break;
            }
            case 2 :{
                base = 'a' + (int)(Math.random()*100)%26;
                break;
            }
            default:break;
        }
        return (char)base;
    }
    public static String getRandomS(){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < 2; i++)
        {
            char st = getRandomC();
            builder.append(st);
        }
        return builder.toString();
    }
    public static void main(String[] args){
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2)
                    return 1;
                else return -1;
            }
        };
        TreeSet<Integer> set = new TreeSet<>(c);
        for(int i = 100; i > 0; i--)
            set.add(i);
        System.out.println(set.last());
    }
}
