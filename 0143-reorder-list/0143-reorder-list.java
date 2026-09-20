/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();

        ListNode temp = head;

        while (temp != null) {
            list.add(temp);
            temp = temp.next;
        }

        int l = 0;
        int r = list.size() - 1;

        while (l < r) {
            list.get(l).next = list.get(r);
            l++;

            if (l == r) {
                break;
            }

            list.get(r).next = list.get(l);
            r--;
        }

        list.get(l).next = null;

    }
}