//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        A a = new D();
        B b = new D();
        C c = new D();
        D d = new D();
        a.foo(d);
    }
}
    class A {
        void foo(A a) {
            System.out.println("class: A, parameter: A");
        }
    }
    class B extends A {
        @Override
        void foo(A a) {
            System.out.println("class: B, parameter: A");
        }
        void foo(B a) {
            System.out.println("class: B, parameter: B");
        }
    }
    class C extends B {
        void foo(C a) {
            System.out.println("class: C, parameter: C");
        }
    }
    class D extends C {
        @Override
        void foo(B a) {
            System.out.println("class: D, parameter: B");
        }



    }