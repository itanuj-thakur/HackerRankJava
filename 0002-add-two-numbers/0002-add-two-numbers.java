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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode list=null;
        int sum=0,carry=0;

        while(l1!=null && l2!=null){
            sum=l1.val+l2.val;
            if(carry==1) {
                sum++;
                carry=0;
            }
            if(sum>9) {
                carry=1;
                sum=sum%10;
            }
            list=add(list,sum);
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            sum=l1.val;
            if(carry==1){
                carry=0;
                sum++;
            }
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            list=add(list,sum);
            l1=l1.next;
        }
        while(l2!=null){
            sum=l2.val;
            if(carry==1){
                carry=0;
                sum++;
            }
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            list=add(list,sum);
            l2=l2.next;
        }
        if(carry==1) list=add(list,1);
        return list;
    }
    static ListNode add(ListNode head,int data){
        ListNode node = new ListNode(data,null);
        if(head==null) head=node;
        else{
            ListNode temp=head;
            while(temp.next!=null) temp=temp.next;
            temp.next=node;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna