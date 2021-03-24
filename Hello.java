package RunnableHello;

// By implementing the Runnable Interface, thread creation is possible.
public class Hello implements Runnable{
    public void run(){
        try{
            //Display the ordinal numbers.
            if(Thread.currentThread().getId() == 1){
                // If the 1st thread is running, display the appropriate ordinal number.
                System.out.println("The " + Thread.currentThread().getId() + "st thread is running."); 
            }
            else if(Thread.currentThread().getId() == 2){
                // If the 2nd thread is running, display the appropriate ordinal number.
                System.out.println("The " + Thread.currentThread().getId() + "nd thread is running."); 
            }
            else if(Thread.currentThread().getId() == 3){
                // If the 3rd thread is running, display the appropriate ordinal number.
                System.out.println("The " + Thread.currentThread().getId() + "3rd thread is running."); 
            }
            else {
                // If the 4th, 5th, or etc. thread is running, display the appropriate ordinal number.
                System.out.println("The " + Thread.currentThread().getId() + "th thread is running.");
            }
            
            // Display the running thread.
            System.out.println("The");
        }
    }
} 
class Test{
    public static void main(String[] args) {
        
    }
}