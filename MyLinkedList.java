class MyLinkedList {

    private Node head;

    MyLinkedList() {
        head = null;
    }

    public void addNode(Node n) {
        if (head == null) {
            head = n;
        } else {
            Node trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = n;
        }
    }

    public void printList() {
        Node trav = head;
        while (trav != null) {
        System.out.println(trav.str);
        trav = trav.next;
        }


    }
    public void insertBefore(int index, Node n) {
        if (index == 0) {
        n.next = head;
        head = n;
        } else {
        Node trav = head;
        int count = 0;
        while (count < index - 1) {
        trav = trav.next;
        count++;
            }

    n.next = trav.next;
    trav.next = n;
    }
    }

    public void insertAfter(int index, Node n){
          Node trav = head;
          int count = 0;
          while (count < index) {
              trav = trav.next;
              count++;
          }

          n.next = trav.next;
          trav.next = n;
      }


    public int  indexOf (String  find_str) {
      Node trav = head;
      int position=0;


      while(trav!= null) {
        if(trav.str.equals(find_str))
          return position;
        trav = trav.next;
        position++;
      }
      return -1;
    }

        public void removeNodeAt(int index) {
          Node prev=head;
         Node curr=head;

    if (index==0) {
        this.head = head.next;
        curr.next=null;
    } else {
         int count=0;
         while (count<index) {
             curr = curr.next;
             if (count < index-1)
                 prev = prev.next;
             count++;
         }

         prev.next = curr.next;
         curr.next = null;
     }
   }
      }
