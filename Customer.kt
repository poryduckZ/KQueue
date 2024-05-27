class Customer(private val id: Int, private val name: String) {
    fun queueUp(queue: MutableList<Customer>) {
        queue.add(this)
    }

    override fun toString(): String {
        return "Customer $id: $name"
    }
}