//my implimentation time taken 10 min for whole project

package implimentation;

import myinterface.MyStackADT;

public class MyStackImplimentation implements MyStackADT {

    private Node top;
    private int size;

    public MyStackImplimentation() {
        top=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return top==null;
    }
    //similar to addFirst method in Linked List
    @Override
    public void push(int element) {
        Node node=new Node(element);
        if(isEmpty()){
            top=node;
        }
        else{
            node.setNext(top);
            top=node;
        }
        size++;
    }
    public int size(){
        return size;
    }

    @Override
    public int pop() {
        int response=0; //considering 0 as invalid data;
        if(!isEmpty()){
            response=top.getData();
            top=top.getNext();
            size--;
        }
        else{
            System.out.println("stack underflow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response=0;  //considering 0 as invalid data
        if(!isEmpty()){
            response=top.getData();
        }
        else{
            System.out.println("empty stack!");
        }
        return response;
    }
    @Override
    public void traverse(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.getData()+"-->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }
}
