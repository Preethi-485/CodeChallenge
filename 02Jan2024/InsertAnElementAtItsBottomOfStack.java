import java.util.* ;

public class InsertAnElementAtItsBottomOfStack 
{
  public static Stack<Integer> pushAtBottom(Stack <Integer> myStack, int x) 
  {
    // Write your code here
    Stack<Integer> st=new Stack<>();
    while(!myStack.isEmpty()){
      int val=myStack.pop();
      st.push(val);
    }
    myStack.push(x);
    while(!st.isEmpty()){
      int val=st.pop();
      myStack.push(val);
    }
    return myStack;
  }
}
