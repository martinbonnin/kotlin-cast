import polycast.cast
import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
  @Test
  fun test() {
    val data: Any? = mapOf("key" to "value")

    val value = data.cast<Map<String, Any?>>()
      .get("key")
      .cast<String>()

    assertEquals("value", value) // YAYYYYY!!!
  }
}