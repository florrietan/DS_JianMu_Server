// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/florrie/JianMu/conf/routes
// @DATE:Sat Oct 09 15:19:05 CST 2021


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
