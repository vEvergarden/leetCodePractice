package leetCodePractice;

public class twoList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode headAtail = headA;
        ListNode headBtail = headB;
        while(headA.next!=null){
            ListNode pre = headAtail;
            headAtail = headA.next;
            headAtail.next = pre;
            headA = headA.next;

        }
        while(headB.next!=null){
            ListNode pre = headBtail;
            headBtail = headB.next;
            headBtail.next = pre;
            headB = headB.next;
        }

        while(headAtail.next!=null && headBtail.next!=null){
            if(headAtail==headBtail && headAtail.next != headBtail.next)return headAtail;
            headAtail = headAtail.next;
            headBtail = headBtail.next;
        }
        return null;

    }

    public static void main(String[] args) {
        ListNode headA = new ListNode(4);
        ListNode headB = new ListNode(5);
        ListNode sameNode = new ListNode(8);
        headA.next = new ListNode(1);
        headA.next.next = sameNode;
        //headA.next.next.next = new ListNode(4);

        headB.next = new ListNode(0);
        headB.next.next = new ListNode(1);
        headB.next.next.next = sameNode;
        //headB.next.next.next.next = new ListNode(4);
        twoList test = new twoList();
        test.getIntersectionNode(headA,headB);
    }




}
