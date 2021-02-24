//my implimentation time taken 10 min for whole project

package implimentation;

import myinterface.MyStackADT;

public class MyStackImplimentation implements MyStackADT {

    private Node head;
    private int size;

    public MyStackImplimentation() {
        head=null;
        size=0;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }
    //similar to addFirst method in Linked List
    @Override
    public void push(int element) {
        Node node=new Node(element);
        if(isEmpty()){
            head=node;
        }
        else{
            node.setNext(head);
            head=node;
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
            response=head.getData();
            head=head.getNext();
            size--;
        }
        return response;
    }

    @Override
    public int peek() {
        return head.getData();
    }
    @Override
    public void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.getData()+"-->");
            temp=temp.getNext();
        }
        System.out.println("null");
    }
}
