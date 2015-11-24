import java.util.*;

class RandomAdder {
  private static int a, b;
  private static Random r;

public static int thingthat_adds(int a, int b)
{
        if(b>a)
          System.out.println("B is bigger");
          else{System.out.println("B is not bigger.  A may be equal to B, or it might be bigger.");}
          return a+b;
  }
  public static void main(String[] args){
    r=new Random();
int rx = r.nextInt();
  int ry = r.nextInt();
    System.out.println(thingthat_adds(ry,rx));
  }
  }
