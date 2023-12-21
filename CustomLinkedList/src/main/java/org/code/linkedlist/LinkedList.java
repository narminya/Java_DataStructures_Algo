package org.code.linkedlist;

import java.util.List;

public class LinkedList<T> {

    private int count;
    private Node<T> first;
    private Node<T> last;

    public int getCount() {
        return count;
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    public LinkedList() {
         count = 0;
        first = null;
        last = null;
    }

    public final class Node<T> {

        LinkedList<T> list;
        T NodeValue;
        Node<T> NextNode;

        public Node(T value) {
            NodeValue = value;
            NextNode = null;
        }

        public Node(LinkedList<T> list, T value) {
            this.list = list;
            NodeValue = value;
        }
        public LinkedList<T> getList() {
            return list;
        }

        public T getNodeValue() {
            return NodeValue;
        }

        public Node<T> getNextNode() {
            return NextNode;
        }

    }
    public Node<T> Get( int targetIndex)
    {

        if (targetIndex < 0 || targetIndex >= this.count)
        {
            throw new IllegalArgumentException("Index is out of range.");
        }
        Node<T> target = this.first;
        var headIndex = 0;

        do
        {
            if (headIndex>0)
            {
                target = target.getNextNode();
            }
            headIndex++;
        } while (targetIndex>=headIndex);


        return target;
    }
    public void add(T item) {
        if (item == null) {
            throw new IllegalArgumentException();
        }
        Node<T> newNode = new Node<>(item);
        newNode.NextNode = first;
        first = newNode;

        if (last==null){
            last = new Node<T>(item);
        }

        count++;
    }

    public void add(Node<T> node) {
        if (node == null) {
            throw new IllegalArgumentException();
        }
        last.NextNode = node;
    }

    public void addRange(List<Node<T>> nodes) {
        if (nodes.isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (Node<T> node : nodes) {
            add(node);
            last.NextNode = node;
        }
    }

    public void addNodes(List<T> itemsRange) {

        if (itemsRange.isEmpty()) {
            throw new IllegalArgumentException();
        }
        for (T item : itemsRange) {
            add(item);
        }
    }

    public int Find(T target)
    {
        Integer index =0;
        while (first != null)
        {

            if (first.NodeValue.equals(target))
                return index;
            first = first.getNextNode();
            index++;
        }

       return -1;
    }





}
