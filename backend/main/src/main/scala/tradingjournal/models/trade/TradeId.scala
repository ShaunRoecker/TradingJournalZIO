
package tradejournal.models

import zio._
import zio.json._
import java.util.UUID


final case class TradeId(id: UUID) extends AnyVal

object TradeId {

  def random: UIO[TradeId] = Random.nextUUID.map(TradeId(_))

  def fromString(id: String): Task[TradeId] =
    ZIO.attempt {
      TradeId(UUID.fromString(id))
    }

  implicit val codec: JsonCodec[TradeId] =
    JsonCodec[UUID].transform(TradeId(_), _.id)

}
