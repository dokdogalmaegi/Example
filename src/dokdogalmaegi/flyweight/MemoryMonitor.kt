package dokdogalmaegi.flyweight

object MemoryMonitor {
    private var usedMemory = 0

    fun allocateMemory(memory: Int) {
        usedMemory += memory
    }
}