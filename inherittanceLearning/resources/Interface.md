## What is interface
contract which every implementing class should adhere. 
##  What a interface have 
```java
    import io.learning.old.BaseGame;public interface IWork {
        int counter = 0; // static final 
        //static method
        static void display(){
        }
        // Java 1.8 + 
        default void doSomeThing(){
        }
        
        void play();
        
        BaseGame getGame();
       

        class InnerWork {
         
        }
        interface Another {
        }
        
    }
```
