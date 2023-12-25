/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int n = 0;
        ListNode node = head;
        ListNode lastNode = null;
        while (node != null) {
            n++;
            if (node.next == null) {
                lastNode = node;
            }
            node = node.next;
        }
        int nk = k % n;
        if (nk == 0) {
            return head;
        }
        // indexToUpdate n - nk
        int index = 0;
        node = head;
        while (index < n - nk - 1) {
            node = node.next;
            index++;
        }
        ListNode newHead = node.next;
        lastNode.next = head;
        node.next = null;
        return newHead;
    }
}


        
        
     