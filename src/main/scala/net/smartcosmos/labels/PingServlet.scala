package net.smartcosmos.labels

import net.smartcosmos.labels.utils.BaseServlet

/**
  * Created by tim on 8/8/16.
  */
class PingServlet extends BaseServlet{

  get("/"){
    "ping"
  }
}
