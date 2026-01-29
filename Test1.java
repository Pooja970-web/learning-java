class Test1{
Object show(){
System.out.println("1");
return null;
}
}
class Xyz extends Test1{
String show(){
System.out.println("2");
return null;
}
public static void main(String[] args){
Test1 t=new Test1();
t.show();
Xyz x=new Xyz();
x.show();
}
}