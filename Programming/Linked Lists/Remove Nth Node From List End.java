 /**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode removeNthFromEnd(ListNode a, int b) {
	    // Idea is to find length and find place of element to be removed 
	    int length = 0;
	    ListNode head = a;
	    while(head != null){
	        head = head.next;
	        // find length
	        length++;
	    }
	    head = a;
	    //position
	    int position = length - b;
	    //If position is less than zero return head.next as given
	    if(position <= 0)return head.next;
	    //Else find the element and delete it
	    while(position > 1){
	        head = head.next;
	        position--;
	    }
	    head.next = head.next.next;
	    return a;
	}
}
