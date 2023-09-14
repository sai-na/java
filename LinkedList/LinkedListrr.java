    import java.util.*;  
    public class LinkedListrr{  
     public static void main(String args[]){  

      Node node1 = new Node(10);
      Node node2 = new Node(20);
      node1.next = node2;
      Node node3 = new Node(40);
      node2.next = node3;
    	Node node4 = new Node(50);
      node3.next = node4;
      Node node5 = new Node(3);
      node4.next = node5;
      node5.next = null;
      Node head = node1;
      printLink(head);

     }  
     
     static Node removeElement(Node head , int data){
     
          Node temp = head ; 
          
          if(temp.data  == data){
          return temp.next;   // set head into second element 
          } else{
           while(temp.data != data){
          //  System.out.println(temp.data);
            temp = temp.next;
            if(temp.next == null){
            // System.out.println(temp.data);
            }
          }// end of while
          System.out.println(temp.data); 
          return head;
            }
      }
     
     
     
     static void printLink(Node head){
     
          Node temp = head ; 
      
      while(temp.next != null){
            System.out.println(temp.data);
            temp = temp.next;
            if(temp.next == null){
             System.out.println(temp.data);
            }
      }
}


     
     
    }  
    
    
    
    
    
