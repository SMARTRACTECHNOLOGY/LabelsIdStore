package net.smartcosmos.labels

import org.specs2.mutable.Specification
import net.smartcosmos.labels.models.Dragon
import java.sql.Connection
import org.junit.runner.RunWith
import org.specs2.runner.JUnitRunner



@RunWith(classOf[JUnitRunner])
class DragonModelTest extends Specification with DatabaseContext {
  
  "Dragon Model" should {
    "return all dragons" in { implicit c:Connection =>
      Dragon.getAll()
      ok
    }
  }
  
}