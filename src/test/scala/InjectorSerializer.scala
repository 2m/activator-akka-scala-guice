package akkaguice

import akka.actor.{ ActorRef, ActorSystem, ExtendedActorSystem }
import akka.serialization._
import com.typesafe.config.ConfigFactory

class InjectorSerializer(val system: ExtendedActorSystem) extends Serializer {

  // This is whether "fromBinary" requires a "clazz" or not
  def includeManifest = false

  override def identifier = 815162342

  private val binaryRep = Array.empty[Byte]
  def toBinary(obj: AnyRef) = binaryRep

  def fromBinary(bytes: Array[Byte], clazz: Option[Class[_]]) = GuiceAkkaExtension(system).injector
}
