package arraylist.implement;

import java.util.Arrays;

public class ArrayList {

	private Object[] myStore;
	private int actualSize=0;
	
	public ArrayList(){
		myStore = new Object[10];
	}
	
	public void add(Object item){
		if(myStore.length-actualSize<=10){
			increaseListSize();
		}
		myStore[actualSize++] = item;
	}

	private void increaseListSize() {
		myStore = Arrays.copyOf(myStore, (myStore.length*3/2)+1);
	}
	
	public Object get(int index){
		if(index<actualSize){
			return myStore[index];
		} else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public void remove(int index){
		if(index<actualSize){
			myStore[index]=null;
			int tmp = index;
			while(tmp<actualSize){
				myStore[tmp]=myStore[tmp+1];
				myStore[tmp+1]=null;
				tmp++;
			}
			actualSize--;
		}else{
			throw new ArrayIndexOutOfBoundsException();
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return actualSize;
	}
}
