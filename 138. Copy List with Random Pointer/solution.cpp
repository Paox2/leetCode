/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
private:
    map<Node*, Node*> map;
    Node* helper(Node* head){
        if(!head){
            return NULL;
        }
        Node* newList = new Node(head->val);
        map[head] = newList;
        newList->next = helper(head->next);
        newList->random = map[head->random];
        return newList;
    }
    
public:
    Node* copyRandomList(Node* head) {
        return helper(head);
    }
    
};