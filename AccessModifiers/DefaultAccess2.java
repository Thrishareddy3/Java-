package AccessModifiers;
import com.day1.*;
//This class is having default access modifier
class DefaultAccess2
{
public static void main(String args[])
{
//accessing class MyClass1 from package p1
DefaultAccess1 obj = new DefaultAccess1();
obj.display();
}
}

