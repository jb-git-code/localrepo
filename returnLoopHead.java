class Solution {
    public static Node findFirstNode(Node head) {
        Node move=head;
        HashSet<Node> set = new HashSet<>();
        while(move!=null){
            if(set.contains(move)) return move;
            set.add(move);
            move=move.next;
        }
        return null;
    }
}