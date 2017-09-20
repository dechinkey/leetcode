package com.dechinkey.easy;

public class JudgeRouteCircle {
    public static boolean judgeCircle(String moves) {
        int vertical = 0;
        int horizontal = 0;
        for (int i = 0; i < moves.length(); i++) {
            char action = moves.charAt(i);
            switch (action) {
                case 'U':
                    vertical++;
                    break;
                case 'D':
                    vertical--;
                    break;
                case 'R':
                    horizontal++;
                    break;
                case 'L':
                    horizontal--;
                    break;
            }

        }

        if (vertical == 0 && horizontal == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("LLUURRDD"));
    }

}
