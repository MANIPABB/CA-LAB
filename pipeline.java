import java.util.Scanner;
public class Main{
public static void main(String[]args){
int a[] = new int [3];
System.out.println("enter the number of elements in the array\n");
Scanner s = new Scanner(System.in);
for(int i=0;i<3;i++){
a[i]=s.nextInt();
}
int instructions=0;
int clock =1;
int add=0;
int div =a[0];
int sub = a[0];
int stage =0;
int mul =1;
for(int i=0;i<3;i++){
if(a[i]==0){
break;
}
else{
instructions =instructions+1;
clock = clock+1;
add = add+a[i];
mul = mul*a[i];
sub = sub-a[i];
div =div/a[i];
}
}
System.out.println("The number of clock cycles required are:\n"+clock);
System.out.println("addition:\n"+add);
System.out.println("multiplication:\n"+mul);
System.out.println("highthroughput is:\n");
float throughput;
throughput =instructions/clock;
System.out.println("The throughput requires for execution of the instruction:\n"+throughput+"%");
}
}