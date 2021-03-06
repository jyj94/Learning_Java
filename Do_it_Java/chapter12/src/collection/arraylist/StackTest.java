package collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayList = new ArrayList<String>();

    public void push(String data) {
        arrayList.add(data);
    }
    public String pop() {
        int len = arrayList.size();
        if (len == 0) {
            System.out.println("스택이 비어있습니다. ");
            return null;
        }
        return arrayList.remove(len-1);
    }
}
public class StackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push("A");
        myStack.push("B");
        myStack.push("C");

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
