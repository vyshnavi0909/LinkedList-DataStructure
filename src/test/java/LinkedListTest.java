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
    public void given3Nums_WhenInsertedBetween2Nums() {
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
    public void given3Nums_WhenFirstElementDeleted_TestPassed() {
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
}
