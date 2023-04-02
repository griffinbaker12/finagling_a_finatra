import com.twitter.example.thriftscala.MultiplicationService
import com.twitter.finatra.thrift.Controller
import com.twitter.util.Future

class ExampleThriftController
  
  extends Controller(MultiplicationService) {

  handle(MultiplicationService.Multiply) { args: MultiplicationService.Multiply.Args =>
    Future(args.a * args.b)
  }

}