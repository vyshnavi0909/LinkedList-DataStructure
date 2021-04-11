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
