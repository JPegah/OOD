
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mbm/university/OOD/OOD-phase5/OOD/conf/routes
// @DATE:Mon Mar 07 15:02:38 IRST 2016


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
