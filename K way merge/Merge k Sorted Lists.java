import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        // Custom Comparator for comparing ListNode objects
        Comparator<ListNode> listNodeComp = new Comparator<ListNode>() {
            @Override
            public int compare(ListNode node1, ListNode node2) {
                return node1.val - node2.val;
            }
        };

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(listNodeComp);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) { // Check if the list is not empty
                minHeap.add(lists[i]);
            }
        }

        ListNode dummyHead = new ListNode();
        ListNode pointer = dummyHead;

        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();
            pointer.next = node;
            pointer = pointer.next;

            if (node.next != null) {
                minHeap.add(node.next);
            }
        }

        return dummyHead.next;
    }
}
