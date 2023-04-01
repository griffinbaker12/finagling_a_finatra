import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class ExampleController extends Controller {

  get("/ping") { request: Request =>
    "pong"
  }
 
 // html!
  get("/html") { request: Request =>
    response.ok.html("<div><h1>Hello World!</h1><button>hey there, press me!</button></div>", script)     
  }

}