
fun main() {
    println(solution(setOf("A", "B", "C"), mutableListOf("A", "B", "B", "D", "C")))
}


fun solution(setSource: Set<String>, listSource: MutableList<String>): MutableSet<String> {
    val result = mutableSetOf<String>()
    result.addAll(setSource)
    result.addAll(listSource)
    return result
}