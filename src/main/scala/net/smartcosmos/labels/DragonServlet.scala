package net.smartcosmos.labels

import net.smartcosmos.labels.utils.BaseServlet
import anorm._
import java.sql.Connection
import net.smartcosmos.labels.models.Dragon
import net.smartcosmos.labels.utils.DB

class DragonServlet extends BaseServlet{

  get("/"){
    logger.info("getting some dragons...")
    DB.tx{implicit c:Connection =>
       Dragon.getAll()
    }
  }
  
}