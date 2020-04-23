package cn.itcase4;

/**
 * @author:fjh
 * @Date: 18:46
 */
public class Node {
     Object data;
     Node next;

    public Node() {
    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
