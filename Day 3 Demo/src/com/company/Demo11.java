package com.company;

public class Demo11 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        //append
        sb.append("world");
        System.out.println(sb);

        //insert
        sb.insert(0,"world");
        System.out.println(sb);

        //replace
        sb.replace(1,3,"World");
        System.out.println(sb);

        //delete
        sb.delete(1,3);
        System.out.println(sb);

        //reverse
        sb.reverse();
        System.out.println(sb);
    }

}
