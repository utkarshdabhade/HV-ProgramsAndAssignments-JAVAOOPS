public class CountObject  
{  
//variable to keep track of objects  
private static int count;  
//constructor of the class  
public CountObject()   
{  
// increase the count variable by 1  
count++;  
}  
public static void main(String args[])   
{  
//creating objects  
CountObject obj1 = new CountObject();  
CountObject obj2 = new CountObject();  
CountObject obj3 = new CountObject();  
CountObject obj4 = new CountObject();  
//prints number of objects  
System.out.print("Total Number of Objects: " + CountObject.count);  
}  
}  