package main;

import implimentation.MyStackImplimentation;

public class MainClass extends MyStackImplimentation {
    public static void main(String[] args) {
        MyStackImplimentation stk=new MyStackImplimentation();
        System.out.println(stk.isEmpty());//true
        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);
        stk.push(50);
        System.out.println(stk.size());    //5
        System.out.println(stk.isEmpty()); //false
        stk.traverse();
        System.out.println(stk.peek());
        System.out.println(stk.pop());
        stk.traverse();
        System.out.println(stk.isEmpty());//false
        System.out.println(stk.size()); //4
        stk.push(50);   
        stk.traverse();
    }
}
