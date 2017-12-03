/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
 
public class Solution {
	public ListNode deleteDuplicates(ListNode a) {
	    //Idea is to see if next element is same then head.next = head.next.next
	    ListNode head = a;
	    while(head.next != null){
	        if(head.val == head.next.val){
                head.next = head.next.next;
	        }
	        //head should be never null but head.next can be null
	        else{
	            head = head.next;
	        }
	        
	    }
	    return a;
	}
}
