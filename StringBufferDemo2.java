import java.util.*;
class StringBufferDemo2
{
    public static void main(String[] args) {
    
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("Buffer = " + sb);
    
        // current capacity of string buffer is 16 + 4
        System.out.println("Old Capacity = " + sb.capacity());
    
        // capacity remains same
        sb.ensureCapacity(19); // LINE A
        System.out.println("New Capacity1 = " + sb.capacity());
    
        // capacity is twice plus 2 
        sb.ensureCapacity(21); // LINE B
        System.out.println("New Capacity2 = " + sb.capacity());
    
        // capacity increased to the specified amount
        sb.ensureCapacity(100); // LINE C
        System.out.println("New Capacity3 = " + sb.capacity());
    
    }
}