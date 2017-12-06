/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode reverseBetween(ListNode a, int m, int n) {
	    //Idea is to traverse just once and keep track of starting and ends of nodes
	    //part_one is for first block
	    // current and prev are for reversing 
	    // start is to keep track of the middle block
	    ListNode part_one = null, current = null, prev = null, t = a,start = null;
	    int count = 1;
	    // to point where we need to start reversing
	    while(t != null && count < m){
	        part_one = t;
	        t = t.next;
	        count++;
	    }
	    start = t;
	    // reverse
	    while(t != null && count <= n){
	        current = t;
	        t = t.next;
	        current.next = prev;
	        prev = current;
	        count++;
	    }
	    // join all parts
	    if(part_one != null){
	        part_one.next = prev;
	    }
	    else{
	        a = prev;
	    }
	    start.next = t;
	    return a;
	}
}
