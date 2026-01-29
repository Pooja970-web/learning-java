abstract class vehicle{
abstract void start();
}
class car extends vehicle{
void start(){
System.out.println("car starts with key");
}
}
class scooter extends vehicle{
void start(){
System.out.println("Scooter start with key");
}
public static void main(String[] args){
car c=new car();
c.start();
scooter s=new scooter();
s.start();

}}