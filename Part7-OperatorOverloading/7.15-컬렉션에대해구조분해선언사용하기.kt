data class NameComponents2(val name: String, val extension: String)

fun splitFilenames(fullName: String): NameComponents2 {
    val (name, extension) = fullName.split('.', limit = 2)
    return NameComponents2(name, extension)
}
