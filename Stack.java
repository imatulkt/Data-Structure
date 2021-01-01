import java.util.ArrayList;

public class Stack {
    
    ArrayList<Integer> arr;
    int top;

    Stack(){
        
        arr = new ArrayList<Integer>();
        top = -1;

    }

    public void push(int data) {
            arr.add(data);
            top += 1;
    }

    public boolean isEmpty() {
        if(top == -1){
            return true;
        }
        else{
            return false;
        } 
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Can't perform the operation. Stack is Empty.");
        }
        else{
            arr.remove(arr.size()-1);
        }
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            System.out.print("The Stack is: ");
            for(int i=0; i<= arr.size()-1; i++){
                System.out.print(arr.get(i) +" ");
            }
            System.out.println();
        }   
    }


}
class Demo{
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(15);
        s1.push(20);
        s1.pop();
        s1.display();
    }
}
