import sbt._
import Keys._
import Versions._

object Dependencies {
  object ZIO {
    val zio             = "dev.zio"     %% "zio"                % zioVersion
    val zioHttp         = "dev.zio"     %% "zio-http"           % zioHttpVersion
    val zioStreams      = "dev.zio"     %% "zio-streams"        % zioStreamsVersion
    val zioParser       = "dev.zio"     %% "zio-parser"         % zioParserVersion
    val zioPrelude      = "dev.zio"     %% "zio-prelude"        % zioPreludeVersion
    val zioOptics       = "dev.zio"     %% "zio-optics"         % zioOpticsVersion
    val zioJson         = "dev.zio"     %% "zio-json"           % zioJsonVersion
    val zioQuill        = "io.getquill" %% "quill-jdbc-zio"     % zioQuillVersion,
  }

  val zioDependencies: Seq[ModuleID] = Seq(
    ZIO.zio,
    ZIO.zioHttp, 
    ZIO.zioStreams, 
    ZIO.zioParser,
    ZIO.zioOptics,
    ZIO.zioPrelude,
    ZIO.zioJson,
    ZIO.zioQuill
  ) 
}


