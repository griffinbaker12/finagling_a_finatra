import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class ExampleController extends Controller {

  get("/ping") { request: Request =>
    "pong"
  }

}