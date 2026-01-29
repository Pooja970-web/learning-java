interface I1{
int s=9;
public abstract void show();

} 
interface I2{
int s=99;
public abstract void showing();

} 

class Test implements I1{
public void show(){
System.out.println("1");
}
public void showing(){
System.out.println("90");
}
public static void main(String[] args){
Test t=new Test();
t.show();
t.showing();


}
}