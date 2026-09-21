package lists;

import linx7a.lists.ReverseLinkedList;
import linx7a.lists.ReverseLinkedList.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ReverseLinkedListTest {
    private ReverseLinkedList solution;

    @BeforeEach
    void setUp() {
        solution = new ReverseLinkedList();
    }

    @Test
    public void shouldReverseThreeElementList() {
        ListNode third = new ListNode(3);
        ListNode second = new ListNode(2);
        second.next = third;
        ListNode head = new ListNode(1);
        head.next = second;

        ListNode result = solution.reverseList(head);

        assertEquals(3, result.val);
        assertEquals(2, result.next.val);
        assertEquals(1, result.next.next.val);
        assertNull(head.next);
    }

    @Test
    public void shouldReturnNullForEmptyList() {
        ListNode result = solution.reverseList(null);

        assertNull(result);
    }

    @Test
    public void shouldReturnSameNodeForSingleElementList() {
        ListNode single = new ListNode(1);

        ListNode result = solution.reverseList(single);

        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    public void shouldReverseTwoElementList() {
        ListNode second = new ListNode(7);
        ListNode first = new ListNode(5);
        first.next = second;

        ListNode result = solution.reverseList(first);

        assertEquals(7, result.val);
        assertEquals(5, result.next.val);
        assertNull(first.next);
    }
}
