package bookshelf.service

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class Test : WordSpec() {
    init{
        "SpringExtension" should {
            "test" {
                val a = 1
                a shouldBe 1
            }
        }
    }
}