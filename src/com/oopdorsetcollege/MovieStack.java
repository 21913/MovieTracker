package com.oopdorsetcollege;

import java.util.Stack;

public class MovieStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        Stack<String> myMovies = new Stack<String>();

        myMovies.push("#1 Frozen");
        myMovies.push("#2 Mohana");
        myMovies.push("#3 Robin Hood");
        myMovies.push("#4 The Tittle Mermaid");
        myMovies.push("#5 Tangled");

        System.out.println("My favorite movies: " + myMovies);
        System.out.println("Most watched movie: " + myMovies.peek());
        String poppedOff = myMovies.pop();
        System.out.println(poppedOff + " has been added on my list!");
        System.out.println("Next movie to be watched: " + myMovies.peek());

        stackPush(stack);
        printStack(stack);
        stackPop(stack);
        printStack(stack);
        stackPeek(stack);

        stackSearch(stack, 1);
        stackSearch(stack, 6);

    }

    static void stackPush(Stack<Integer> stack) {

        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }


    }

    static void stackPop(Stack<Integer> stack) {

        System.out.println("My top 3 movies by #: ");
        for (int i = 0; i < 3; i++) {
            Integer y = (Integer) stack.pop();
            System.out.println(y);

        }

    }

    static void stackPeek(Stack<Integer> stack) {

        Integer element = (Integer) stack.peek();
        System.out.println("Movie on the top of my shelf " + element);
    }

    static void stackSearch(Stack<Integer> stack, int element) {

        Integer pos = (Integer) stack.search(element);
        if (pos == -1) {

        } else {
            // System.out.println(" " + pos);
        }
    }

    static void printStack(Stack<Integer> stack) {

        System.out.println("============= S T A C K   O F   M O V I E S   O N   M Y   S H E L F ==================");

        for (int i = 0; i < stack.size(); i++) {

            System.out.println(stack.get(i));
        }
    }
}
