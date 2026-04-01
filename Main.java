

public class Main{
    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(9);
//        list.indexOf(30);
//        list.contains(30);
        list.removeFirst();
        list.reverse();;
//        list.addFirst(8);
//        list.removeLast();
//        list.size();
        list.print();
        list.toArray();



    }


}