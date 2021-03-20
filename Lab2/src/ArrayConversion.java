import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {

		    public static void main(String[] args) 
		    {
		        ArrayList<String> list = new ArrayList<>(2);
		         
		        list.add("20");
		        list.add("08");
		        list.add("27");
		        list.add("25");
		         
		        Object[] array = list.toArray();
		         
		        System.out.println( Arrays.toString(array) );
		        for(Object o : array) {
		            String s = (String) o;
		             
		            System.out.println(s);
		        }
		    }
       }


