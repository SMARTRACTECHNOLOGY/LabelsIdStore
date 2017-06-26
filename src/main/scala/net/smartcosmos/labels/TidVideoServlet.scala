package net.smartcosmos.labels

import net.smartcosmos.labels.utils.BaseServlet
import anorm._
import java.sql.Connection
import net.smartcosmos.labels.models.Dragon
import net.smartcosmos.labels.utils.DB
import net.smartcosmos.labels.models.TidVideo

class TidVideoServlet extends BaseServlet{

  get("/:tid"){
    val tid = params.get("tid")
    tid.map{ t =>
      logger.info("getting a tid...")
     
      DB.tx{implicit c:Connection =>
         TidVideo.getVideoForTid(t)
      }
    }.getOrElse(halt(404))
  }
  
  post("/:tid/:videoId"){
    val tid = params.get("tid")
    val videoId = params.get("videoId").map(_.toLong)
    
    val r = for{
      t <- tid
      v <- videoId
    } yield{
      DB.tx{implicit c:Connection =>
         TidVideo.setVideoForTid(t, v)
      }
    }
    r.getOrElse(halt(404))
  }
  
}