package com.bridgelabz;

public class Strings {
    public static void main(String[] args) {
        String s = "Hello";
        char c = s.charAt(3);
        System.out.println(c);//l
        System.out.println(s.length());//5
//        for(int i=0; i<s.length(); i++){
//            System.out.println(s.charAt(i));//H e l l o
//        }

        String s1 = s.substring(2);
        System.out.println(s1);//llo

        System.out.println(s.substring(2,4));//ll


        System.out.println(s.contains("io"));

        System.out.println(String.join("*", "Hi","Hello","Bye"));

        System.out.println(String.join("/", "21","09","2021"));

        String s2 = "hi";
        String s3 = new String("hi");
        System.out.println(s2.equals(s3));//
        System.out.println("______________");
        System.out.println("hi".isEmpty());//f
        System.out.println("".isEmpty());//t

        System.out.println("Hello".concat(" World"));
        //String s4 = "Soon";//s4.replace('S','M')
        System.out.println("Soon".replace('S','M'));

        System.out.println("Money".replace("Money".charAt(0), 'H'));//

        System.out.println("HelLo".indexOf("elL", 1));
        String a = String.valueOf(new char[]{'a', 'b'});
        System.out.println(a);
    }
}

