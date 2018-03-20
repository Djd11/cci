package stringsArrays;


interface ImplStack {

    void push(int key);
    int pop();
    int peek();
}
public class StackImp implements ImplStack {

    int top = -1;
    int[] itemHolder = new int[10];

    boolean isEmpty(){

        return (top < 0);

    }

    @Override
    public void push(int key) {
        if(itemHolder.length > top){
            new IllegalArgumentException("Array is full");
        }
        if (isEmpty()){
            top++;
        }
        itemHolder[top++] = key;

        System.out.println("Pushed "+key);
    }

    @Override
    public int pop() {
        int popItem ;
        if(isEmpty()){
            new IllegalArgumentException("Array is empty nothing to pop");
            return 0;
        }
        popItem = itemHolder[--top];
        System.out.println("Popped out "+popItem);
        return popItem;
    }

    @Override
    public int peek() {
        return 0;
    }

    public static void main(String[] args) {


        StackImp stackImp = new StackImp();
        stackImp.push(1);
        stackImp.push(2);
        stackImp.pop();
        stackImp.pop();

    }
}
