package recursion

data class Node(val value: Int, val left: Node? = null, val right: Node? = null)


fun search(value: Int, node: Node?): Node? {
    println(node?.value)
    return when {
        node == null -> null
        value == node.value -> node
        value > node.value -> search(value, node.right)
        value < node.value -> search(value, node.left)
        else -> null
    }
}

val data = Node(
    8,
    Node(3, Node(1), Node(6, Node(4), Node(7))),
    Node(10,null, Node(14, Node(13)))
)

fun main() {
    println("Search In binary tree for 4 => ${search(4, data)?.value}")
    println("Search In binary tree for 13 => ${search(13, data)?.value}")
    println("Search In binary tree for 2 => ${search(2, data)?.value}")
}