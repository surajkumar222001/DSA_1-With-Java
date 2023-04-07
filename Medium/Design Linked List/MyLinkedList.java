class MyLinkedList {
    class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index >= size) {
            return -1;
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.val;
    }

   
    public void addAtHead(int val) {
        Node n = new Node(val);
        n.next = head;
        head = n;
        size++;

        if (head.next == null) {
            tail = head;
        }
    }

    
    public void addAtTail(int val) {
        Node n = new Node(val);
        if (tail != null) {
            tail.next = n;
        }
        if (tail == null || size == 0) {
            head = n;
        } 
        tail = n;
        size++;
    }

   
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);

        } else if (index == size) {
            addAtTail(val);

        } else {
            Node p = head;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            Node n = new Node(val);
            Node save = p;
            p = p.next;
            save.next = n;
            n.next = p;
            size++;
        }
    }

   
    public void deleteAtIndex(int index) {
        if (size == 0 || index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else {
            Node p = head;
            for (int i = 0; i < index - 1; i++) {
                p = p.next;
            }
            p.next = p.next.next;
            size--;
            if (p.next == null) {
                tail = p;
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
