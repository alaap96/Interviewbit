/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode getIntersectionNode(ListNode a, ListNode b) {
	    if(a == null){return null;}
	    if(b == null){return null;}
	    // Idea is to find length and adjust it for lists so that they are same length
	    int lenght1 = 0;
	    int length2 = 0;
	    //length of list 1
	    ListNode head = a;
	    while(head != null){
	        head = head.next;
	        lenght1++;
	    }
	    //length of list 2
	    ListNode head2 = b;
	    while(head2 != null){
	        head2 = head2.next;
	        length2++;
	    }
	    head = a;
	    head2 = b;
	    // adjusting the length
	    if(length2 > lenght1){
	        while(length2 - lenght1 != 0){
	            head2 = head2.next;
	            length2--;
	        }
	    }
	    else{
	        while(lenght1-length2 != 0){
	            head = head.next;
	            lenght1--;
	        }
	    }
	    // if nodes are equal then return that point
	    while(head != null){
	        if(head == head2){return head;}
	        head = head.next;
	        head2 = head2.next;
	        
	    }
	    return null;
	}
}
