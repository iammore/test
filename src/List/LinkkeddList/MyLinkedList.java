package List.LinkkeddList;

public class MyLinkedList<Object> extends MyList<Object>{

    private int size;
    private Node head;

    public MyLinkedList() {
        this.size = 0;
        this.head = null;
    }

    @Override
    public int size() {
        //System.out.println("inside size");
        return size;
    }

  /*  public Object addWithObject(Object object) {
       Node node=getNodeWithInt(size-1);
       node.next=new Node(object,node.next);
       size++;
       return node.data;
    }*/

    @Override
    public void add(int index, Object element) {
        if (index==0){
            head=new Node(element,head);
           // System.out.println(head.data+" "+head.next);
        }else {
            Node node=head;
          //  System.out.println(head);
            node.next=new Node(element,node.next);
           // System.out.println(node.next);
           // System.out.println(node.next.data+" "+node.next.next);
        }
size++;


    }

    public  Node getNodee(Object element){
        Node node=head;
        System.out.println(head);
        System.out.println(size);
        System.out.println(element);
        for (int i=0;i<size;i++){
            if (node.data.equals(element)){
                return node;
            }
            node=node.next;
        }
    return null;
    }

    public Object getNodeWithInt(Integer index){
        Node node=head;
        System.out.println(head);
        System.out.println(size);
        System.out.println(index);
        for (int i=0;i<index;i++){
           node=node.next;
        }
        return node.data;
    }


    /* public Node add(Object element){
       // Node node=get();
        return null;
    }*/
    private class Node{
        public Object data;
        public Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
