
package tradejournal.models

// import zio._
// import zio.json._
import java.time.LocalDateTime


final case class Trade(
    id: TradeId,
    contract: Contract,
    tradeDirection: TradeDirection,
    entryPrice: BigDecimal,
    exitPrice: Option[BigDecimal],
    entryDate: LocalDateTime,
    exitDate: Option[LocalDateTime],
) {

}

object Trade {

}