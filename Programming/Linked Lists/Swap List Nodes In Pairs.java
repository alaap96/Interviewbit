/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode swapPairs(ListNode a) {
	    // This approch is to create new Linked List and add new nodes.
	    ListNode current = new ListNode(0),next = null,head = a,result = current;
	    if(a == null)return a;
	    if(a.next == null)return a;
	    while(head != null && head.next != null){
	        next = head.next;
	        current.next = new ListNode(next.val);
	        current = current.next;
	        current.next = new ListNode(head.val);
	        current = current.next;
	        head = head.next.next;
	    }
	    if(head != null){
	        current.next = new ListNode(head.val);
	        current = current.next;
	    }
	    return result.next;
	}
}
