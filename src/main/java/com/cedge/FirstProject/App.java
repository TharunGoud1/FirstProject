package com.cedge.FirstProject;

/**
 * Hello world!
 *
 */
public class App 
{
    int x=10;
    int y=20;
    public static int add(int x,int y){
        int z =x+y;
       System.out.println( "Hello Add!"+z );
    }
    public static void main( String[] args )
    {
        add(10,15);
        System.out.println( "Hello World!" );
    }
    
}
