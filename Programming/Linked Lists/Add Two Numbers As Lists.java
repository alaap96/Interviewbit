/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode a, ListNode b) {
	    if(a == null && b == null)return null;
	    if(a == null)return b;
	    if(b == null)return a;
	    ListNode result = new ListNode(0);
	    ListNode head = result;
	    int carry = 0;
	    int sum = 0;
	    while(a != null && b != null){
	        sum = a.val + b.val + carry;
	        carry = 0;
	        if(sum >= 10){carry = sum / 10;sum = sum - 10; }
	        result.next = new ListNode(sum);
	        result = result.next;
	        a = a.next;
	        b = b.next;
	    }
	    if(a != null){
	        while(a != null){ 
	            if(carry > 0){
	                sum = a.val + carry;
	                carry = 0;
	                if(sum >= 10){carry = sum / 10;sum = sum - 10; }
	                result.next = new ListNode(sum); a = a.next;result = result.next;
	            }else{
	            result.next = new ListNode(a.val); a = a.next;result = result.next;
	            }
	        }
	    }
	    else if(b != null){
	        while(b != null){
	            if(carry > 0){
	                sum = b.val + carry;
	                carry = 0;
	                if(sum >= 10){carry = sum / 10;sum = sum - 10;}
	                result.next = new ListNode(sum); b = b.next;result = result.next;
	            }else{
	                result.next = new ListNode(b.val); b = b.next;result = result.next;
	            }
	        }
	    }
	    if(carry > 0){result.next = new ListNode(carry);result = result.next;carry = 0;}
	    return head.next;
	}
}

// very slightly changed method
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode A, ListNode B) {
        ListNode result = new ListNode(0);
        ListNode pointer = result;
        int temp = 0;
        while(A != null && B != null){
            int sum = A.val + B.val + temp;
            temp = 0;
            if(sum >= 10){temp = sum / 10; sum = sum % 10;}
            result.next = new ListNode(sum);
            result = result.next;
            A = A.next;
            B = B.next;
        }
        while(A != null){
            int sum = A.val + temp;
            temp = 0;
            if(sum >= 10){temp = sum / 10; sum = sum % 10;}
            result.next = new ListNode(sum);
            result = result.next;
            A = A.next;
        }
        while(B != null){
            int sum = B.val + temp;
            temp = 0;
            if(sum >= 10){temp = sum / 10; sum = sum % 10;}
            result.next = new ListNode(sum);
            result = result.next;
            B = B.next;
        }
        if(temp != 0){result.next = new ListNode(temp);}
        return pointer.next;
    }
}

