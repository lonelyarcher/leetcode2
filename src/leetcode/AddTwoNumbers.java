package leetcode;

import leetcode.dataStructures.ListNode;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	ListNode dumb = new ListNode(0);
    	ListNode p =  dumb;
    	int carryon = 0;
    	while(l1!=null || l2!=null || carryon>0){
    		int sum = (l1==null?0:l1.val) + (l2==null?0:l2.val) + carryon;
    	    carryon = sum/10;
    		sum = sum%10;
    		p.next = new ListNode(sum);
    		p=p.next;
    		l1 = (l1==null?null:l1.next);
    		l2 = (l2==null?null:l2.next);
    	}
    	return dumb.next;
    }

}
