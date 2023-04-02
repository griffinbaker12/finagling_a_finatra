import com.twitter.finatra.thrift.ThriftServer
import com.twitter.finatra.thrift.routing.ThriftRouter

object ExampleServerMain extends ExampleServer

class ExampleServer extends ThriftServer {
  
  override def configureThrift(router: ThriftRouter): Unit = {
    router
      .add[ExampleThriftController]
  }
  
}