import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class LinkedListTest {
    @Test
    public void given3Nums_WhenAdded_ShouldBeAtTop() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        NewLinkedList linkedList = new NewLinkedList();
        linkedList.add(firstNode);
        linkedList.add(secondNode);
        linkedList.add(thirdNode);
        linkedList.printNodes();
        boolean res = linkedList.head.equals(thirdNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(firstNode);
        Assertions.assertTrue(res);
    }

    @Test
    public void given3Nums_WhenAppended_ShouldBeAddedToLast() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        NewLinkedList linkedList = new NewLinkedList();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNodes();
        boolean res = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(res);
    }

    @Test
    public void given3Nums_ToInsertedBetween2Nums() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        NewLinkedList linkedList = new NewLinkedList();
        linkedList.append(firstNode);
        linkedList.append(thirdNode);
        linkedList.insert(firstNode, secondNode);
        linkedList.printNodes();
        boolean res = linkedList.head.equals(firstNode) &&
                linkedList.head.getNext().equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(res);
    }

    @Test
    public void given3Nums_ToDeleteFirstElement() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        NewLinkedList linkedList = new NewLinkedList();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.pop();
        linkedList.printNodes();
        boolean res = linkedList.head.equals(secondNode) &&
                linkedList.tail.equals(thirdNode);
        Assertions.assertTrue(res);
    }

    @Test
    public void given3Nums_ToDeleteLastElement() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        NewLinkedList linkedList = new NewLinkedList();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.popLast();
        linkedList.printNodes();
        boolean res = linkedList.head.equals(firstNode) &&
                linkedList.tail.equals(secondNode);
        Assertions.assertTrue(res);
    }

    @Test
    public void given3Nums_ToSearchElement() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        NewLinkedList linkedList = new NewLinkedList();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.printNodes();
        boolean res = linkedList.search(30);
        Assertions.assertTrue(res);
    }

    @Test
    public void given3Nums_SearchElement_ThenInsert_NewElement() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        Node<Integer> fourthNode = new Node<>(40);
        NewLinkedList linkedList = new NewLinkedList();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.searchAndInsert(30, fourthNode);
        linkedList.printNodes();
        boolean res = linkedList.head.getNext().equals(secondNode) &&
                linkedList.head.getNext().getNext().equals(fourthNode);
        Assertions.assertTrue(res);
    }

    @Test
    public void given3Nums_SearchAndDelete_ThenShowSize() {
        Node<Integer> firstNode = new Node<>(56);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(70);
        Node<Integer> fourthNode = new Node<>(40);
        NewLinkedList linkedList = new NewLinkedList();
        linkedList.append(firstNode);
        linkedList.append(secondNode);
        linkedList.append(thirdNode);
        linkedList.searchAndInsert(30, fourthNode);
        linkedList.searchAndDelete(40);
        linkedList.printNodes();
        System.out.println("size: " + linkedList.size());
        boolean res = linkedList.head.getNext().equals(secondNode) &&
                secondNode.getNext().equals(thirdNode);
        Assertions.assertTrue(res);
    }
}
