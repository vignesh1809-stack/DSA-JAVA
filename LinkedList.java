import java.util.Arrays;
import java.util.NoSuchElementException;

public class LinkedList {
    private int count;
    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
    }
    private Node first;
    private Node last;

    public void addLast(int value) { //O(1)
        var node = new Node(value);
        if (isEmpty()) {
            first = last = node;
            count++;
        } else {
            last.next = node;
            last = node;
            count++;
        }
    }

    public void print(){ //O(n)
        Node current = first;

        while(current!=null){
            System.out.println(current.value + "->");
            current=current.next;
        }
        System.out.print("null");

    }

    public void addFirst(int value){  //O(1)
        var node = new Node(value);
        if(isEmpty()){
            first=last=node;
            count++;
        }else {
            node.next = first;
            first = node;
            count++;
        }
    }

    private boolean isEmpty(){
        return first == null;
    }

    public void indexOf(int value){
        var node = first;
        int count=0;
        while(node!=null) {
            if (node.value == value) {
                System.out.println(count);
            }
            count++;
            node = node.next;
        }
    }

    public void contains(int value){
        var node= first;
        while(node!=null){
            if(node.value == value){
                System.out.println(true);
                break;
            }
            node=node.next;
        }
    }

    public void removeFirst(){
       if(isEmpty()){
            throw new NoSuchElementException();
       }
       if(first==last){
           first=last=null;
       }else{
           Node second = first.next;
           first.next=null;
           first=second;
       }
       count--;
    }

    public void removeLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first==last){
            first=last=null;
        }
        var node =first;

        while(!(node.next==last)){
            node=node.next;
        }
        node.next=null;
        node=last;
        count--;
    }

    public void size(){
        System.out.println(count);
    }

    public void toArray(){
        int[] arr=new int[count];
        Node node=first;
        int i=0;
        while(node!=null){
            arr[i]= node.value;
            node=node.next;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void reverse(){
        if(first==null){
            throw  new NoSuchElementException();
        }

        Node p=first;
        Node c=p.next;
        while(c!=null){
            var n = c.next;
            c.next=p;
            p=c;
            c=n;
        }

        last=first;
        last.next=null;
        first=p;


    }





}
