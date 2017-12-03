/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode mergeTwoLists(ListNode a, ListNode b) {
	    ListNode current = new ListNode(0);
	    ListNode head = current;
	    while(a != null && b != null){
	        if(a.val < b.val){
	            current.next = a;
	            a = a.next;
	        }
	        else{
	            current.next = b;
	            b = b.next;
	        }
	        current = current.next;
	    }
	    if(a == null){
	        current.next = b;
	    }
	    else{
	        current.next = a;
	    }
	    
	    return haed.next;
	}
}
