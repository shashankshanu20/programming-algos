package personal.programming.algos.hashing;

import java.util.HashMap;
import java.util.Map;

public class CopyLL {

    class RandomListNode {
      int label;
      RandomListNode next, random;
      RandomListNode(int x) { this.label = x; }
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode tempHead = head;
        RandomListNode copy = null;

        while(tempHead != null) {
            copy = new RandomListNode(tempHead.label);
            map.put(tempHead, copy);
            tempHead = tempHead.next;
        }
        tempHead = head;
        while(tempHead != null) {
            copy = map.get(tempHead);
            copy.next = map.get(tempHead.next);
            copy.random = map.get(tempHead.random);
            tempHead = tempHead.next;
        }
        return map.get(head);
    }
}
