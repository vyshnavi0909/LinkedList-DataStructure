public class NewLinkedList {
    public INode head;
    public INode tail;

    public NewLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(INode node) {
        if( this.tail == null){
            this.tail = node;
        }if ( this.head == null){
            this.head = node;
        }else {
            INode tempNode = this.head;
            this.head = node;
            this.head.setNext(tempNode);
        }
    }

    public void append(INode node){
        if( this.tail == null){
            this.tail = node;
        }if ( this.head == null){
            this.head = node;
        }else {
            this.tail.setNext(node);
            this.tail = node;
        }
    }

    public void insert(INode node, INode newNode){
        INode tempNode = node.getNext();
        node.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode pop(){
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public boolean search(int key){
        INode tempNode = head;
        while (tempNode != null && tempNode.getNext() != null){
            if(tempNode.getNext().getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    public void printNodes(){
        StringBuffer nodes = new StringBuffer("Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null){
            nodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)){
                nodes.append("->");
            }
            tempNode = tempNode.getNext();
        }
        nodes.append(tempNode.getKey());
        System.out.println(nodes);
    }


}
