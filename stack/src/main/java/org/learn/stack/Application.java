package org.learn.stack;

public class Application {
	/**
	 * Main function from where application start
	 *
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		/* System.out.println("######### Welcome to stack implementation example ###########");
		StackWithArray st = new StackWithArray(5);
		System.out.println("Stack size  :" +  st.getSize());
		System.out.println("Stack count  :" +  st.getCount());
		System.out.println("Stack counter  :" +  st.getCounter());
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.printStack();
		st.pop();
		st.push(5);
		st.printStack(); */
		StackWithLinkedList stackWithLinkedList = new StackWithLinkedList();
		stackWithLinkedList.push(1);
		stackWithLinkedList.push(2);
		stackWithLinkedList.push(3);
		stackWithLinkedList.push(4);
		//stackWithLinkedList.printStack();
		stackWithLinkedList.pop();
		stackWithLinkedList.pop();
		//stackWithLinkedList.pop();
		//stackWithLinkedList.pop();
		//stackWithLinkedList.printTop();
		stackWithLinkedList.printStack();
	}
}