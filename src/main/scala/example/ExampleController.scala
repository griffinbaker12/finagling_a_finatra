import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class ExampleController extends Controller {
    get("/ping") { request: Request => 
        "pong"   
    }
    get("/randomHtml") { request: Request => 
        // generate random html
        val html = "<html><body><h1>Random HTML</h1></body></html>"
        response.ok.html(html)
    }
}