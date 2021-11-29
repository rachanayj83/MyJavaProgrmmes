package com.yjr;

public class Main {

        public static void main (String[] args) {
            /**Stack stack = new Stack(3);

             stack.push(1);      // inserting 1 in the stack
             stack.push(2);      // inserting 2 in the stack

             stack.pop();        // removing the top element (2)
             stack.pop();        // removing the top element (1)

             stack.push(3);      // inserting 3 in the stack

             System.out.println("The top element is " + stack.peek());
             System.out.println("The stack size is " + stack.size());

             stack.pop();        // removing the top element (3)

             // check if the stack is empty
             if (stack.isEmpty()) {
             System.out.println("The stack is empty");
             }
             else {
             System.out.println("The stack is not empty");
             }


             ReplaceElement re = new ReplaceElement();
             String newString = re.replaceStringElement("Rachana", 'a', 'A');
             System.out.println("New string after character replacement "+ newString);


            CountCharacter cc = new CountCharacter();
            int count = cc.countOccurances("Hello World", 'o');
            System.out.println("Number of occurances of 'o' in 'Hello World' is " + count);

            int count1 = cc.countOccurances_1("Hello World", 'l',0);
            System.out.println("Number of occurances of 'l' in 'Hello World' is " + count1);


            WordCount wc = new WordCount();

            //System.out.println("Word count: "+ wc.wordcount("The  sky - - is blue!"));
            //System.out.println("Word count: "+ wc.wordcount("no&one#should%ever-write-like,this but   well"));

           // System.out.println("Word count: "+ wc.wordcount1("The  sky - - is blue!"));
            //System.out.println("Word count: "+ wc.wordcount1("no&one#should%ever-write-like,this but   well"));

            System.out.println("Word count: "+ wc.wordcount2("The sky is blue!"));
            System.out.println("Word count: "+ wc.wordcount2("no one should ever write like this but   well"));


            Queue q = new Queue(5);
            q.enqueue(9);
            q.enqueue(-5);
            q.enqueue(3);

            q.display();


            LinkedListQueue lq = new LinkedListQueue();
            lq.insertLast(1);
            lq.insertLast(2);
            lq.insertLast(3);
            lq.insertLast(4);

            System.out.printf("The front element is %d\n", lq.peek());

            System.out.println("-- Displaying Queue data--");
            lq.displayList();

            lq.removeFirst();
            lq.removeFirst();
            lq.removeFirst();
            lq.removeFirst();

            if (lq.isEmpty()) {
                System.out.print("The queue is empty");
            }
            else {
                System.out.print("The queue is not empty");
            }
             */

            BinaryTree bt = new BinaryTree();
            int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
            bt.root = bt.createTree(arr, bt.root, 0);
            bt.inOrder(bt.root);
        }

    }

