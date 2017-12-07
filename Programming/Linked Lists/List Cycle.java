/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode detectCycle(ListNode a) {
	    //Idea is to find it there is a cycle then find the starting point
	    ListNode fastP = a,slowP = a;
	    boolean IsCycle = false;
	    // always first check fast != null then only fast.next != null or
	    // we are trying to dereference a null value and it gives a null pointer exception
        while(fastP != null && fastP.next != null && slowP != null){
            fastP = fastP.next.next;
            slowP = slowP.next;
            if(fastP == slowP) {IsCycle = true;break;}
        }
        //If no cylce return NUll
        if(!IsCycle)return null;
        // we put a pointer at head then when we move both at same speed(one step at a time)
        // Then they meet at loop starting point
        else{
            fastP = a;
             while(fastP != slowP){
                 fastP = fastP.next;
                 slowP = slowP.next;
             }
             return fastP;
        }
	}
}
