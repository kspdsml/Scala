import com.corundumstudio.socketio.listener.{ConnectListener, DataListener, DisconnectListener}
import com.corundumstudio.socketio.{AckRequest, Configuration, SocketIOClient, SocketIOServer}


class projectDemo3Server {

  val config: Configuration = new Configuration {
    setHostname("localhost")
    setPort(8080)
  }

  val server: SocketIOServer = new SocketIOServer(config)
  server.addConnectListener(new ConnectListener(this))
  server.addDisconnectListener(new DisconnectListener(this))

}

class ConnectListener(server: projectDemo3Server) extends ConnectListener {
  override def onConnect(socket: SocketIOClient): Unit = {

  }
}

class DisconnectListener(server: projectDemo3Server) extends DisconnectListener {
  override def onDisconnect(socket: SocketIOClient): Unit = {

  }
}
