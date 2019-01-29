package stack.implement;


public class StackImplement {

	int MAX = 1000;
	Object stack[] = new Object[MAX];
	int top=0;
	
	public void push(Object data){
		if(isFull()){
			System.out.println("Stack is FULL");
		}else{
		stack[top++]=data;
		}
	}
	
	private boolean isFull() {
		if(top==MAX-1){
			return true;
		}else{
			return false;
		}
	}

	private boolean isEmpty() {
		if(top==0){
			return true;
		}else{
			return false;
		}
	}

	public void show(){
		for(int i=0;i<top;i++){
			System.out.print(stack[i]);
		}
	}
	
	public Object pop(){
		return stack[top--];
		
	}
}
