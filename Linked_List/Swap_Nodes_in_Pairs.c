/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    struct ListNode dummy;
    dummy.next=head;
    struct ListNode* prev= &dummy;
   
    while(prev->next!=0 && prev->next->next!=0){
        struct ListNode* first= prev->next;
        struct ListNode* second= prev->next->next;

        first->next=second->next;
        second->next=first;

        prev->next=second;

        prev=first;
    }
    return dummy.next;
}
