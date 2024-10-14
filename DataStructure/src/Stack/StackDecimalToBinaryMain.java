package Stack;

import java.util.Scanner;

public class StackDecimalToBinaryMain
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        StackDecimalToBinary  obj = new StackDecimalToBinary ();//object created
        System.out.println("Enter number");
        int number=in.nextInt();//read number
        obj.create_Stack(64);//as machine is 64bit
        while(number>0)
        {
            int bit=number%2;
            number=number/2;
            obj.push(bit);
        }
        System.out.println("Binary is:");
        while(obj.is_Empty()!=true)
            System.out.print(obj.pop());
    }
}