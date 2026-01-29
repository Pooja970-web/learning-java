class A{
A(){
System.out.println("I am in class A");
} 
}
class B1 extends A{
B(){
super();
System.out.println("I am in class B");
}
public static void main(string[] args){
B1 ob=new B1();
}
}4 