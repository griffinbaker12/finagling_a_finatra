import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter

object Server extends HttpServer {
  override def configureHttp(router: HttpRouter): Unit = {
    router
      .add[ExampleController]
  }
}