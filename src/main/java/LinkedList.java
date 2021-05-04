public class LinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (this.size == 0 && this.head == null) {
            return true;
        }
        return false;
    }

    public void add(Object object){
        // init node
        Node node = new Node();
        node.setValue(object);

        // set head & tail
        if(this.isEmpty())
        {
            this.head = node;
        }else{
            this.tail.setNext(node);
        }

        //increase size
        this.tail = node;
        size++;
    }

    public Object getFirst() {
        if (isEmpty()) {
            return null;
        }

        return this.head.getValue();
    }

    public Object getLast(){
        if (isEmpty()) {
            return null;
        }

        return this.tail.getValue();
    }

    public Object get(int index) throws IndexOutOfBoundsException{
        Node current = this.head;

        if (index < 0 || index > this.getSize() - 1) {
            throw new IndexOutOfBoundsException();
        }

        for (int i = 0; i < index; i += 1) {
            current = current.getNext();
        }
        return current.getValue();
    }

    public int contains(Object object){
        Node current = this.head;

        for(int i = 0; i< this.getSize(); i++){
            if(current.getValue() == object){
              return i;
            }
            current = current.getNext();

        }
        return -1;
    }
}
