class Test2{
void show(){
System.out.println("1");
}

}
class Xyz extends Test2{
void show() throws ArithmeticException{
System.out.println("2");
}
public static void main(String[] args){
Test2 t=new Test2();
t.show();
Xyz ob=new Xyz();
ob.show();
}
}