/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1= headA;
        ListNode temp2= headB;
        int cnt1 = 0;
        while(temp1 != null){
            cnt1++;
            temp1 = temp1.next;
        }
        int cnt2 = 0;
        while(temp2 != null){
            cnt2++;
            temp2 = temp2.next;
        }
        ListNode ptrA = headA;
        ListNode ptrB = headB;
        int diff = Math.abs(cnt1 - cnt2);
        if(cnt1 > cnt2){
            while(diff>0){
                ptrA = ptrA.next;
                diff--;
            }
        }else{
            while(diff > 0) {
                ptrB =ptrB.next;
                diff--;
            }
        }
        while(ptrA != null && ptrB != null){
            if(ptrA == ptrB){
            return ptrB;
            
        }
            ptrA = ptrA.next;
        ptrB = ptrB.next;
        }
        
        return null;

    }
}