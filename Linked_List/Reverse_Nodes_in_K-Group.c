/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseKGroup(struct ListNode* head, int k) {
    if (head == NULL || k == 1) return head;

    struct ListNode dummy;
    dummy.next = head;
    
    struct ListNode* curr = head;
    struct ListNode* prev = &dummy;
    struct ListNode* start = &dummy;
    struct ListNode* top = curr;

    while (1) {
        struct ListNode* fast = curr;
        int count = 0; 

        for (int i = 0; i < k; i++) {
            if (fast == NULL) return dummy.next;
            fast = fast->next;
            count++;
        }

        struct ListNode* Next = curr->next;
        struct ListNode* tempPrev = prev;

        for (int i = 0; i < k; i++) {
            curr->next = tempPrev;
            tempPrev = curr;
            curr = Next;
            if (Next != NULL) Next = Next->next;
        }

        start->next = tempPrev;
        top->next = curr;

        start = top;
        prev = start;
        top = curr;

        if (curr == NULL) break;
    }

    return dummy.next;
}
