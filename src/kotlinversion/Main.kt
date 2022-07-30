package kotlinversion

typealias NodeKt = Node

fun main(args: Array<String>) {
    val factory = Location(3, 7)
    val customer1 = Location(1, 4)
    val customer2 = Location(1, 10)
    val customer3 = Location(2, 1)
    val customer4 = Location(5, 2)
    val customer5 = Location(6, 5)
    val customer6 = Location(8, 4)
    val customer7 = Location(8, 9)
    val customer8 = Location(9, 2)

    val node = NodeKt(factory.distanceBetween(customer1))
    node.appendToEnd(factory.distanceBetween(customer2))
    node.appendToEnd(factory.distanceBetween(customer3))
    node.appendToEnd(factory.distanceBetween(customer4))
    node.appendToEnd(factory.distanceBetween(customer5))
    node.appendToEnd(factory.distanceBetween(customer6))
    node.appendToEnd(factory.distanceBetween(customer7))
    node.appendToEnd(factory.distanceBetween(customer8))
    node.printNodes()
    println()
    val length = node.length(node.following)
    println("length of nodes $length")

    val sum = node.sumOfNodes()
    println("sum of all nodes $sum")

    var next: NodeKt? = node
    do {
        println("deleting ${next?.data}")
        next = next?.deleteNode(next, next.data)
    }while (next != null)

    // proof of deleting all nodes
    println("Node: ${next?.data}")
}