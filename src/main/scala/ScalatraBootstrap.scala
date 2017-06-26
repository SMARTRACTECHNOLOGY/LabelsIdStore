import org.scalatra.LifeCycle
import javax.servlet.ServletContext

import net.smartcosmos.labels.PingServlet
import net.smartcosmos.labels.DragonServlet
import com.zaxxer.hikari.HikariDataSource
import net.smartcosmos.labels.TidVideoServlet


class ScalatraBootstrap extends LifeCycle {

  
  
  override def init(context: ServletContext) {

    // mount servlets like this:
    context mount (new PingServlet, "/ping")
    context mount (new DragonServlet, "/dragon")
    context mount (new TidVideoServlet, "/tidvideo")
  }
}