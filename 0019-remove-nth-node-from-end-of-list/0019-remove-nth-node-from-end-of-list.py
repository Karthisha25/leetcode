# Definition for singly-linked list.
# class ListNode:
#     def _init_(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        def size(head):
            l=0
            while head != None:
                l+=1
                head=head.next
            return l
        t=size(head)-n
        if t==0:
            return head.next
        curr=p=head
        while t>0:
            p=curr
            curr=curr.next
            t-=1
        p.next=curr.next
        return head