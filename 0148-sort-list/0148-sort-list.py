# Definition for singly-linked list.
# class ListNode:
#     def _init_(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if head==None or head.next==None:
            return head
        def Merge(h1,h2):
            d=ListNode(0)
            t=d
            while h1 and h2:
                if h1.val>h2.val:
                    d.next=h2
                    h2=h2.next
                else:
                    d.next=h1
                    h1=h1.next
                d=d.next
            if not h2:
                d.next=h1
            else:
                d.next=h2
            return t.next
        def Mid(head):
            s=f=head
            while f.next and f.next.next:
                s=s.next
                f=f.next.next
            return s
        m=Mid(head)
        h2=m.next
        m.next= None
        return Merge(self.sortList(head),self.sortList(h2))