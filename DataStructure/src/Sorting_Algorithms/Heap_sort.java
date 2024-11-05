package Sorting_Algorithms;



public class Heap_sort {
	

void heap_sort(int a[])

{

int i ,j,current;

boolean done;

for(i=a.length-1;i>0;i--)//everytime one element is reduced

{

for(j=0;j<=i;j++)//current will go j to till zero

   {

current=j;

    done=true;

       while(current>0 && current/2>=0 && done==true)

       {

           if(current/2<current)//parent<child

               {

                   int temp=a[current/2];

                   a[current/2]=a[current];

                   a[current]=temp;

                   current=current/2;//move to parent

}

           else

               done=false;

}//while

}//for j

   //swap 0th with ith

   int temp=a[0];

   a[0]=a[i];

   a[i]=temp;

}//for i

}//code

}