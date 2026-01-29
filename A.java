class A{
void m1(){
System.out.println("I am in class A");
}
}
class B extends A{
void show(){
super.m1();
}
public static void main(String[] args){
B ob=new B();
ob.show();
}
}