//Создадим переменную список на языке Java:
ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"))
//Создадим стек на языке Java:
import java.util.Stack;  
public class StackExample {  
public static void main(String args) {  
// Создать новый экземпляр стека  
Stack<Integer> stack = new Stack<>();  
// Добавить элементы в стек  
stack.push(10);  
stack.push(20);  
stack.push(30);  
// Удалить элементы из стека  
int poppedElement = stack.pop();  
System.out.println("Popped element: " + poppedElement);  
// Получить верхний элемент  
int topElement = stack.peek();  
System.out.println("Top element: " + topElement);  
}  
}  

