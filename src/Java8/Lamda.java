package Java8;

import java.util.ArrayList;

interface FuncInterface
{
    void abstractFun(int x);
    default void normalFun()
    {
       System.out.println("Hello");
    }
} 

public class Lamda {
	public static void main(String args[])
    {
        
        FuncInterface fobj = (int x)->System.out.println(2*x);
        fobj.abstractFun(5);
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);

        arrL.forEach(n -> System.out.println(n));

        arrL.forEach(n -> {
            if (n % 2 == 0)
                System.out.println(n);
        });
	    
	}

}
