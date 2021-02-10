/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node newList = new Node(-1);
        Node currentNode = newList;
        Map<Node, Node> map = new HashMap();
        
        while (head != null) {
            if (map.containsKey(head)) {
                currentNode.next = map.get(head);
            } else {
                currentNode.next = new Node(head.val);
                map.put(head, currentNode.next);
            }
            
            currentNode = currentNode.next;
            
            if (head.random != null) {
                if (map.containsKey(head.random)) {
                    currentNode.random = map.get(head.random);
                } else {
                    currentNode.random = new Node(head.random.val);
                    map.put(head.random, currentNode.random);
                }
            }
            
            head = head.next;
        }
        
        return newList.next;
    }
}