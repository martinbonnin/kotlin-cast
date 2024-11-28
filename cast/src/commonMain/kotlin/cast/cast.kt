package cast

/**
 * Tries to cast [this] to [T] or returns `null` if [this] is not an instance of [T].
 *
 * This is the equivalent of:
 * ```
 * this as? T
 * ```
 */
inline fun <reified T : Any> Any?.safeAs(): T? = this as? T
/**
 * Tries to cast [this] to [T] or throws if [this] is not an instance of [T].
 *
 * This is the equivalent of:
 * ```
 * this as T
 * ```
 */
inline fun <reified T : Any> Any?.cast(): T = this as T
/**
 * Tries to cast [this] to [T] or throws an [AssertionError] if [this] is not an instance of [T].
 */
inline fun <reified T : Any> Any?.assertedCast(message: () -> String): T = this as? T ?: throw AssertionError(message())
