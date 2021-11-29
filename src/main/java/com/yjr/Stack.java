package com.yjr;

/**
 * Implementing Stack class
 * Stack is a Last in first out linear data structure
 *
 */
public class Stack {

    private int arr[];
    private int top ;
    private int length;

    // Constructor to initialize the stack
    Stack(int length)
    {
        this.arr = new int[length];
        this.length = length;
        this.top = -1;
    }

    // Function to add an element `x` to the stack

    public void push(int x){
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }

        System.out.println("Inserting " + x);
        arr[++top] = x;

    }

    //function to pop a top element from the stack
    public int pop(){
        if(isEmpty()){
            System.out.println("Underflow");
            System.exit(1);
        }
        System.out.println("Removing " + peek());
        return arr[top--];
    }

    // function to return the top element of the stack
   public int peek(){
    if(isEmpty()){
        System.exit(1);
    } else{
        return arr[top];
    }
    return -1;
   }

    //function to return the size of the stack
   public int size(){
     return top+1;
   }

    //Function to check if the stack is empty or not
   public Boolean isEmpty(){
        return size() == 0;
   }

   //function to check if the stack is full or not
   public Boolean isFull(){
    return top == length-1;
   }
}
