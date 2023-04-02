import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter

object ExampleServerMain extends Server

Class Server extends HttpServer {
  override def configureHttp(router: HttpRouter): Unit = {
    router
      .add[ExampleController]
  }
} 