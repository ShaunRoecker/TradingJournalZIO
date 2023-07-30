package tradejournal.models



sealed trait Exchange
object Exchange {
  case object CME extends Exchange
  case object NYMEX extends Exchange
  case object COMEX extends Exchange
  case object CBOT extends Exchange
  
}
