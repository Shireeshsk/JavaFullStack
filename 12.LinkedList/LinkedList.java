
public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            size++;
            return;
        }
        newNode.next=head;
        head = newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            size++;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next=newNode;
        tail=newNode;
        size++;
    }

    public void printLinkedlist(Node head){
        if(head==null){
            System.out.println("linkedlinked list is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMiddle(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data); 
        size++;
        int count = 0;
        Node curr = head;
        Node prev = null;
        while(curr != null){
            if(count==idx){
                newNode.next=curr;
                prev.next=newNode;
                return;
            }
            count++;
            prev = curr;
            curr = curr.next;
        }
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("no nodes present in the linked list nothing could be deleted");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast(){
        if(head==null){
            System.out.println("linked list is empty");
            return Integer.MAX_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        int val = curr.next.data;
        curr.next=null;
        size--;
        return val;
    }

    public int Search(int data){
        Node temp = head;
        int idx=0;
        while(temp!= null){
            if(temp.data==data){
                return idx;
            }
            temp = temp.next;
            idx++;
        }
        return -1;
    }

    public int recSerach(int data,Node n,int idx){
        if(n==null){
            return -1;
        }
        if(n.data==data){
            return idx;
        }
        return recSerach(data, n.next, idx+1);
    }

    public void reverseLL( ){
        Node prev = null;
        Node curr = head;
        Node Next;
        while(curr!=null){
            Next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=Next;
        }
        head=prev;
    }

    public void delete(int idx){
        int c =1;
        // int val;
        if(idx==1){
            head=head.next;
        }
        Node prev = head;
        Node curr = head.next;
        while(curr!=null){
            if(c+1==idx){
                prev.next=curr.next;
            }
            prev = curr;
            curr = curr.next;
            c++;
        }
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(){
        if(head==null || head.next== null){
            return true;
        }
        // 1. find mid
        Node midNode = findMid(head);

        //2. reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node Next;
        while(curr!=null){
            Next = curr.next;
            prev = curr;
            curr = Next;
        }
        Node right = prev;
        Node left = head;

        // check left hald and right half
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addMiddle(2, 5);
        ll.addMiddle(3, 10);
        ll.printLinkedlist(ll.head);
        System.out.println(ll.size);
        System.out.println(ll.Search(10));
        System.out.println(ll.recSerach(10,ll.head,0));
        ll.reverseLL();
        ll.printLinkedlist(ll.head);
        ll.delete(2);
        ll.printLinkedlist(ll.head);
    }
}