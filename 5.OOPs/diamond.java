public class diamond {
    D sk = new D();
    sk.display();
    
}
class A {
    public void display() {
      System.out.println("A");
    }
  }
  
  class B extends A {
    public void display() {
      System.out.println("B");
    }
  }
  
  class C extends A {
    public void display() {
      System.out.println("C");
    }
  }
  
  class D extends B,C {
    public void display() {
      super.display();
    }
  }