package com.yjr;

public class Queue {
    int[] queue;
    int front, rear,count, capacity;

    Queue(int size){
        queue = new int[size];
        front = 0;
        rear = 0;
        count = 0;
        capacity = size;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Overflow");
            System.exit(1);
        }
        queue[rear] = data;
        rear++;
        count++;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Underflow");
            System.exit(1);
        }
        int data = queue[front];
        front++;
        count--;
    }

    public boolean isFull(){

        return size() == capacity;
    }

    public boolean isEmpty(){

        return (size() == 0);
    }

    public int size(){

        return count;
    }

    public void display(){
        System.out.println("Elements of queue: ");
        for(int i = 0; i < size(); i++) {
            System.out.println(queue[i]);
        }
    }
}
