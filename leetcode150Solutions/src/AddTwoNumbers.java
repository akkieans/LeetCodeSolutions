class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(2);
        ListNode list1Node2 = new ListNode(4);
        ListNode list1Node3 = new ListNode(3);
        ListNode list2Node1 = new ListNode(5);
        ListNode list2Node2 = new ListNode(6);
        ListNode list2Node3 = new ListNode(4);
        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;
        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;
        System.out.println(addTwoNumbers(list1Node1, list2Node1));
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode res = result;
        int carryDigit = 0;
        while (l1 != null && l2 != null){
            int sum = l1.val + l2.val;
            result.val = carryDigit>0 ? (carryDigit + l1.val + l2.val) : (l1.val + l2.val);
            if(result.val > 9){
                carryDigit = result.val / 10;
                result.val = result.val % 10;
            }
            result.next = l1.next == null ? null : new ListNode();
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null || l2 != null){
            ListNode node = new ListNode();
            node.val = l1 != null ? l1.val : l2.val;
            result.next = node;
            result = result.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        return res;
    }
}
