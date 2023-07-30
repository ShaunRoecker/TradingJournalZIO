package tradejournal.models



sealed trait Contract {
  def exchange: Exchange

}

object Contract {
  case object ES extends Contract { // E-Mini S&P 500
    val exchange: Exchange = Exchange.CME
  }

  case object NQ extends Contract { // E-Mini NASDAQ-100
    val exchange: Exchange = Exchange.CME
  }

  case object YM extends Contract { // E-Mini Dow
    val exchange: Exchange = Exchange.CME
  }

  case object RTY extends Contract { // E-Mini Russell 2000
    val exchange: Exchange = Exchange.CME
  }

  case object GC extends Contract { // Gold
    val exchange: Exchange = Exchange.CME
  }

  case object SI extends Contract { // Silver
    val exchange: Exchange = Exchange.CME
  }

  case object CL extends Contract { // Crude Oil
    val exchange: Exchange = Exchange.CME
  }

  case object NG extends Contract { // Natural Gas
    val exchange: Exchange = Exchange.CME
  }

  // Micro E-Minis
  case object MES extends Contract { // Micro E-Mini S&P 500
    val exchange: Exchange = Exchange.CME
  }

  case object MNQ extends Contract { // Micro E-Mini NASDAQ-100
    val exchange: Exchange = Exchange.CME
  }

  case object MYM extends Contract { // Micro E-Mini Dow
    val exchange: Exchange = Exchange.CME
  }

  case object M2K extends Contract { // Micro E-Mini Russell 2000
    val exchange: Exchange = Exchange.CME
  }

}