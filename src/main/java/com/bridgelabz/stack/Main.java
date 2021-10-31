package com.bridgelabz.stack;

public class Main {
    public static void main(String[] args) {
        //Displaying Welcome Message
        System.out.println("Welcome to Data Structure Stacks Program");

        DsaStack dsaStackObject = new DsaStack();
        //pushing elements into stack.
        dsaStackObject.push(70);
        dsaStackObject.push(30);
        dsaStackObject.push(56);

        //printing the size of stack after pushing elements inside.
        System.out.println("Size of an stack is : " + dsaStackObject.size() + "\n");

        //printing stack.
        dsaStackObject.displayStack();

        //displaying only last i.e top element.
        System.out.println("Peek element: " + dsaStackObject.peek() + "\n");

        //Popping i.e removing last inserted element from stack.
        System.out.println("Popping element: " + dsaStackObject.pop() + "\n");

        //again printing size of an stack after popping element.
        System.out.println("Size of an stack is : " + dsaStackObject.size() + "\n");

        //printing full stack elements.
        dsaStackObject.displayStack();
    }

}