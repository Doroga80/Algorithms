import org.w3c.dom.Node;

public class MyHashMap {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        printlnNode(treeBuild(array), "7");
    }    
    
    /**
     * @param node
     * @param sp
     */
    static void printlnNode(Node node, String sp) {
        if (node != null) {
            System.out.println(sp + node.value);
            printlnNode(node.right, sp + "R ");
            printlnNode(node.left, sp + "L ");
        }
    }

    static Node treeBuild(int... array) {
        return _treeBuild(array, 0, array.length - 1);
    }

    private static Node _treeBuild(int[] array, int indexStart, int indexEnd) {
        Node node = null;
        if (indexEnd < indexStart) {
            return null;
        }
        int mid = (indexStart + indexEnd) / 2;
        node = new Node(array[mid]);

        node.left = treeBuild(array, indexStart, mid - 1);
        node.right = _treeBuild(array, mid + 1, indexEnd);

        return node;
    }

    private static Object treeBuild(int[] array, int indexStart, int i) {
        return null;
    }
}