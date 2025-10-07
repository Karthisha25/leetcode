# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def oddEvenList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head or not head.next:
            return head
        odd=head
        temp=head.next
        even=temp
        while temp and temp.next:
            odd.next= temp.next
            odd=odd.next
            temp.next=odd.next
            temp=temp.next
        odd.next=even
        return head