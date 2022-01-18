class MyLinkedListTestHW{


public static void main(String[]args){

	MyLinkedList mylist = new MyLinkedList();

mylist.addNode(new Node("mel"));
mylist.addNode(new Node("zo"));
mylist.addNode(new Node("louise"));
mylist.addNode(new Node("emmet"));
mylist.printList();

mylist.insertBefore(3,new Node("peter"));
System.out.println("\n after insert of peter before index 3 \n ");
mylist.printList();


mylist.insertAfter(1,new Node("Arias"));
System.out.println("\n after insert of arias after index 1 \n ");
mylist.printList();


System.out.println("\n after finding the name mel and showing the index of mel \n ");
System.out.println("index of = " + mylist.indexOf("arias"));



mylist.removeNodeAt(2);
System.out.println("\n after removing index 2 \n ");
mylist.printList();



}
}
