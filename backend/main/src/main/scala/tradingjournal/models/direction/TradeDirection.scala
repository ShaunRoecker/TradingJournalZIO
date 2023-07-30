package tradejournal.models


sealed trait TradeDirection
object TradeDirection {
  case object Long extends TradeDirection
  case object Short extends TradeDirection
}