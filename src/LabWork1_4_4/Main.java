package LabWork1_4_4;

/**
 * Created by Nastya on 17.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        int i =11;
        int a,b,c,d;
        a = i++;//a= 11,i присвоено 12;
        b = ++i;//i=12.b = 13;
        c = i--;//c=13,i присвоено значение 12
        d = --i;
        System.out.println(a+" "+b+" "+c+" "+d);


    }
}
