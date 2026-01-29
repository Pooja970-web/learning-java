class CounterDemo{
static int count=0;
CounterDemo(){
count++;
System.out.println(count);
}
public static void main(String[] args){
CounterDemo C1=new CounterDemo();
CounterDemo C2=new CounterDemo();
CounterDemo C3=new CounterDemo();
}
}