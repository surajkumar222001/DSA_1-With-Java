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


// not much optimized solution
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode(0);
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummytemp = dummyNode;
        while( temp1 != null  && temp2 != null ){
            if(temp1.val < temp2.val){
                ListNode node = new ListNode(temp1.val);
                System.out.println(node.val);
                dummytemp.next = node;
                dummytemp = dummytemp.next ;
                temp1 = temp1.next;
                
            }else{
                ListNode node = new ListNode(temp2.val);
                System.out.println(node.val);
                dummytemp.next = node;
                dummytemp = dummytemp.next ;
                temp2 = temp2.next;
            }
        }  
        
        while(temp1 != null){
            ListNode node = new ListNode(temp1.val);
                dummytemp.next = node;
                dummytemp = dummytemp.next ;
                temp1 = temp1.next;
        }

        while(temp2 != null){
            ListNode node = new ListNode(temp2.val);
                dummytemp.next = node;
                dummytemp = dummytemp.next ;
                temp2 = temp2.next;
        }
        
        

        return dummyNode.next;
    }
}


// optimized solution

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1!=null && list2!=null){
        if(list1.val<list2.val){
            list1.next=mergeTwoLists(list1.next,list2);
            return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
        }
        }
        if(list1==null)
            return list2;
        return list1;
    }
}