/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode partition(ListNode a, int b) {
	    //Idea is to maintain two pointers and store lesser in one half and greater in another half
	    ListNode left = null,leftHead = null,right = null,rightHead = null,current = a;
	    if(a == null)return a;
	    if(a.next == null)return a;
	    boolean leftStart = true;
	    boolean rightStart = true;
	    while(current != null){
	        if(current.val < b){
	            if(leftStart){
	                leftHead = current;
	                left = current;
	                leftStart = false;
	            }else{
	                left.next = current;
	                left = left.next;
	            }
	        }else{
	            if(rightStart){
	                rightHead = current;
	                right = current;
	                rightStart = false;
	            }else{
	                right.next = current;
	                right = right.next;
	            }
	        }
	        current = current.next;
	    }
	    //In case if all elements are greater or lesser that given number
	    //Then we have to return either one of the pointer head
	    if(leftHead == null)return rightHead;
	    if(rightHead == null)return leftHead;
	    right.next = null;
	    left.next = rightHead;
	    return leftHead;
	}
}
