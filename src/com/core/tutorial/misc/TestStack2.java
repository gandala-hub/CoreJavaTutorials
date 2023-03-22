package com.core.tutorial.misc;


class Stack {
private int stck[];
private int tos;
// allocate and initialize stack
Stack(int size) {
stck = new int[size];
tos = -1;
}
// Push an item onto the stack
void push(int item) {
if(tos==stck.length-1) // use length member
System.out.println("Stack is full.");
else
stck[++tos] = item;
}
// Pop an item from the stack
int pop() {
if(tos < 0) {
System.out.println("Stack underflow.");
return 0;
}
else
return stck[tos--];
}
}
class TestStack2 {
public static void main(String args[]) {
	int stack1size = 0;
	int stack2size = 1;
	Stack mystack1 = new Stack(stack1size);
	Stack mystack2 = new Stack(stack2size);
	// push some numbers onto the stack
	for(int i=0; i<stack1size; i++) mystack1.push(i);
	for(int i=0; i<stack2size; i++) mystack2.push(i);
	// pop those numbers off the stack
	System.out.println("Stack in mystack1:");
	for(int i=0; i<stack1size; i++)
	System.out.println(mystack1.pop());
	System.out.println("Stack in mystack2:");
	for(int i=0; i<stack2size; i++)
	System.out.println(mystack2.pop());
	}

}