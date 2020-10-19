class A{
    public A foo(){
        return this;
    }
}
class B extends A{
    public A foo(){
        return this;
    }
}
public class C extends B{
  /*  public A foo(B b){
        return b;
    }
    public void foo(){

    }
    public int foo(){
       return 1;
    }*/
    public A foo(){
        return A;
    }
}
