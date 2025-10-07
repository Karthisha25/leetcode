# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: Optional[ListNode]) -> Optional[ListNode]:
        s=f=head
        while f.next and f.next.next!=None:
            s=s.next
            f=f.next.next
        if f.next!=None and f.next.next==None:
            return s.next
        return s
        