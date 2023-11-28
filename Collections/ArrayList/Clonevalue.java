package Collections.ArrayList;

public class Clonevalue{

    public static void main(String[] args) throws CloneNotSupportedException {

        Test2 z=new Test2();
        z.a=100;
        z.b=200;
        z.c.x=25;
        z.c.y=30;

        Test2 v=(Test2)z.clone();
        v.a=96;
        v.b=56;

        System.out.println(z.a+","+v.a);
    }
    
}

class Test
{
    int x;
    int y;
}

class Test2 implements Cloneable
{
   int a;
   int b;

   Test c=new Test();

   public Object clone() throws CloneNotSupportedException
   {
     return super.clone();
   }
}
