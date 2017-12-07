/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reorderList(ListNode a) {
	    ListNode fast = a, slow = a, head = a,temp = null,result = new ListNode(0);
	    ListNode current = null,prev = null; 
	    //If list is empty
	    if(a == null)return a;
	    //If list contains only one element
	    if(a.next == null)return a;
	    //find middle element
	    while(fast != null && slow != null && fast.next != null){
	        fast = fast.next.next;
	        slow = slow.next;
        }
        //reverse the elements from middle
	    while(slow != null){
	        current = slow;
	        slow = slow.next;
	        current.next = prev;
	        prev = current;
	    }
	    // Remove the extra element at the end of head(this element is repeated in both lists)
	    while(head.next.next != null){
	        head = head.next;
	    }
	    head.next = null;
	    head = a;
	    temp = result;
	    // Take a new list and add one from head and one from reverse
        while(head != null && prev != null){
	        result.next = new ListNode(head.val);
	        result = result.next;
	        head = head.next;
	        result.next = new ListNode(prev.val);
	        result = result.next;
	        prev = prev.next;
	    }
	    // one element may remain in reverse list when length of list is odd
	    if(prev != null)result.next = new ListNode(prev.val);
	    return temp.next;
	}
}
