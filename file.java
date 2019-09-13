import java.util.*;
import java.io.*; 

class X 
 {
     public static void main(String args[])
     {
  
 List<Integer> list = new ArrayList<Integer>();
 List<Integer> list1 = new ArrayList<Integer>();
File file = new File("file1.txt");
File file1 = new File("file2.txt");
BufferedReader reader = null;
BufferedReader reader1 = null;
try {
    reader = new BufferedReader(new FileReader(file));
    reader1 = new BufferedReader(new FileReader(file1));
    String text = null;
    String text1 = null;

    while ((text = reader.readLine()) != null) {
    	 String arr[]= text.split(" ");
    	 for(int i=0;i<arr.length;i++){
         //System.out.println(arr[i]);
         list.add(Integer.parseInt(arr[i]));
    }
    }
     while ((text1 = reader1.readLine()) != null) {
    	 String arr[]= text1.split(" ");
    	 for(int i=0;i<arr.length;i++){
          //System.out.println(arr[i]);
         list1.add(Integer.parseInt(arr[i]));
    }
    }
} catch (FileNotFoundException e) {
    e.printStackTrace();
} catch (IOException e) {
    e.printStackTrace();
} finally {
    try {
        if (reader != null) {
            reader.close();
        }
    } catch (IOException e) {
    }
}

//print out the list
//System.out.println(list);
//System.out.println(list1);

for(int i=0;i<list.size();i++)
{
	if(list1.contains(list.get(i)))
	{
      System.out.println(list.get(i));
	}
}
     }
 }