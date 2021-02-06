public class MyList {
    private Node head;
    private int size;

    public MyList() {
        head = new Node(null);
        size = 0;
    }

    //Adauga un obiect in lista
    public void add(Object data) {
        Node temp = new Node(data);
        Node current = head;
        while(current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        size++;
    }

    public void add(Object data, int index) {
        Node temp = new Node(data);
        Node current = head;
        for(int i = 0; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        size++;
    }

    public Object get(int index) {
        if(index < 0 && index >= this.size) {
            return null;
        } else {
            Node current = head.getNext();
            for(int i = 0; i < index; i++) {
                if(current.getNext() == null) {
                    return null;
                }
                current = current.getNext();
            }
            return current.getData();
        }
    }

    public boolean remove(int index) {
        if(index < 0 || index >= size) {
            return false;
        }
        Node current = head;
        for(int i = 0; i < index; i++) {
            if(current.getNext() == null) {
                return false;
            }
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
        return true;
    }

    public int size() {
        return size;
    }

    public String toString() {
        Node current = head.getNext();
        String result = "";
        while(current != null) {
            result += "[" + current.getData() + "] ";
            current = current.getNext();
        }
        return result;
    }

    
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.next = null;
            this.data = data;
        }

        public Node(Object data, Node next) {
            this.next = next;
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

class Graph extends MyList {

    int nrNoduri;
    int vizitat[];

    public Graph(int n){
        this.nrNoduri = n + 1;
        vizitat = new int[n + 1];
        for (int i = 0; i < nrNoduri; i++)
            add(new MyList());

    }

    void add(int x, int y){
        MyList list = (MyList) get(x);
        list.add(y);
    }

    public String toString() {
        String rez = "";
        for (int i = 1; i < nrNoduri; i++) {
            MyList list = (MyList) this.get(i);
            rez += i + ": " + list + "\n";
        }
        return rez;
    }

    void dfs(int start){
        System.out.println(start);
        MyList list = (MyList) get(start);
        vizitat[start] = 1;

        if (list != null){
            for (int i = 0; i < list.size(); i++)
                if (vizitat[(int)list.get(i)] == 0){
                    dfs((int)list.get(i));
                }
        }
    }


}