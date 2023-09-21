package jihe;

import java.util.ArrayList;
import java.util.Collections;

public class poker {
    public static void main(String[] args) {
        String[] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color={"方片♦","梅花♣","红桃♥","黑桃♠"};
        ArrayList arrayList=new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < color.length; j++) {
                arrayList.add(color[j]+" "+num[i]);
            }
        }
        arrayList.add("大王");
        arrayList.add("小王");
        Collections.shuffle(arrayList);
ArrayList tom=new ArrayList<>();
ArrayList me=new ArrayList<>();
ArrayList jerry=new ArrayList<>();
ArrayList lastcards=new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            if (i>=arrayList.size()-3){lastcards.add(arrayList.get(i));}
            else if (i%3==0){tom.add(arrayList.get(i));}
            else if (i%3==1){me.add(arrayList.get(i));}
            else if (i%3==2){jerry.add(arrayList.get(i));}
        }
        System.out.println("tom的牌:"+tom);
        System.out.println("我的牌:"+me);
        System.out.println("jerry的牌:"+jerry);
        System.out.println("底牌:"+lastcards);

    }


}
