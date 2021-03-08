package testcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class testHashMap {
    public static void main(String args[]){
        HashMap<String, List<Hero>> hashMap = new HashMap<>();
        List<Hero> list = new ArrayList<>();
        long start = System.currentTimeMillis();
        for(int i = 0; i < 1000000; i++){
            int key = (int)(Math.random()*10000) % 10000;
            String s = "hero-" + key;
            list.add(new Hero(s,i));
        }
        long end = System.currentTimeMillis();
        //直接拿名字当key了
        for(Hero hero : list){
            List<Hero> templist = hashMap.get(hero.getName());
            if(templist == null){
                templist = new ArrayList<>();
            }
            templist.add(hero);
            hashMap.put(hero.getName(),templist);
        }
        long findend = System.currentTimeMillis();
        System.out.printf("新建这些元素一共消耗了%d毫秒\n",end - start);
        System.out.printf("查找hero-5555，一共有%d个，耗时%d毫秒", hashMap.get("hero-5555").size(),findend - end);
    }
}
