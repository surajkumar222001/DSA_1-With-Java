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
    public ListNode oddEvenList(ListNode head) {
        if(head == null ) return null;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode oddtemp = head; 
        ListNode eventemp = head.next;
      while(oddtemp.next !=null && eventemp.next != null){
        oddtemp.next = oddtemp.next.next;
        eventemp.next = eventemp.next.next;
        eventemp= eventemp.next;
        oddtemp = oddtemp.next; 
      } 
       oddtemp.next =  evenHead;
      return oddHead;                 
    }
}
