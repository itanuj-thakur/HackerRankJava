class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = null;

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                head = insert(list1.val, head);
                list1 = list1.next;
            } 
            else {
                head = insert(list2.val, head);
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            head = insert(list1.val, head);
            list1 = list1.next;
        }

        while (list2 != null) {
            head = insert(list2.val, head);
            list2 = list2.next;
        }

        return head;
    }

    static ListNode insert(int val, ListNode head) {
        ListNode node = new ListNode(val);

        if (head == null)
            return node;

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;

        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna