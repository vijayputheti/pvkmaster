import java.util.ArrayList;
import java.util.List;









public class New
{
   public static void main(String[] args) {

    int  sd =3;
    int  ed =9;
    List<String> elements = new ArrayList<String>();

      for(int i=sd;i<=ed;i++)
      {
         if(i ==5)
         {
            elements.add("3");
         }
         else if(i==9)
         {
            elements.add("7");
         }
      }

      System.out.println(elements);

   }



}
