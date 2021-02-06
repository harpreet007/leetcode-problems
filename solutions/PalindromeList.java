class PalindromeList{
     public boolean isPalindrome(ListNode head) {
        
        ListNode fast=head,slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode curr=slow,prev=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        
        ListNode head1=prev;
        
        while(head!=null && head1!=null){
            if(head.val!=head1.val)
                return false;
            head=head.next;
            head1=head1.next;
        }
        
        return true;
    }
}