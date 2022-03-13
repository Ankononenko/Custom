// Writng joinToString

fun <T> joinToString(
    collection: Collection<T>,
    separator: String,
    postfix: String,
    prefix: String
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(){
    println(joinToString(listOf("A", "n", "t", "o", "n"), "-", ".", "~"))
}
