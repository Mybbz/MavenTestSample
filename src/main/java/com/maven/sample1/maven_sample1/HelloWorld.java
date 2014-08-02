package com.maven.sample1.maven_sample1;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	public String sayHello(){
		return "Hello Maven";
	}
    public static void main( String[] args )
    {
        System.out.println( new HelloWorld().sayHello() );
    }
}
