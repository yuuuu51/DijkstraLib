package io.github.yuuuu51.dijkstralib.element

class ElementFactory {

    companion object {
        fun createNode(id: String): Node {
            return Node(id)
        }

        fun createEdge(id: String, length: Int): Edge {
            return Edge(id, length)
        }
    }
}