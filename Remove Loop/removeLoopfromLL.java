class Solution {
    public static void removeLoop(Node head) {
        Node move=head;
        Node prev=null;
        HashSet<Node> set = new HashSet<>();
        while(move!=null){
            prev=move;
            if(set.contains(move.next)) break;
            set.add(move);
            move=move.next;
        }
        if(move!=null) move.next=null;
        return ;
    }
}
