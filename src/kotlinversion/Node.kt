package kotlinversion

class Node(var data: Int) {

    var following: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    /**
     * print example:: --> 5 --> 6 --> 7 --> 3 --> .
     */
    fun printNodes() {
        print(" --> ")
        print(data)
        if (following != null) {
            following?.printNodes()
        } else {
            print(" --> .")
        }
    }

    /**
     * @return the length of the SinglyLinkedList
     */
    fun length(h: Node?): Int {
        var count = 1
        var node: Node? = h
        while (node != null) {
            count++
            node = node.following
        }
        return count
    }

    /**
     * @return the sum of the Nodes
     */
    fun sumOfNodes(): Int {
        return data + (following?.sumOfNodes() ?: 0)
    }

    fun deleteNode(head: Node, data: Int): Node? {
        val n: Node = head

        if(n.data == data) {
            return head.following
        }
        var nextNode: Node? = n
        do {
            if (nextNode?.following?.data == data) {
                nextNode.following = nextNode.following?.following
            }
            nextNode = nextNode?.following
        } while (nextNode != null)
        //
        return head
    }
}