
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mbm/university/OOD/OOD-phase5/OOD/conf/routes
// @DATE:Mon Mar 07 15:02:38 IRST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Application_1: controllers.Application,
  // @LINE:9
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Application_1: controllers.Application,
    // @LINE:9
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Courses""", """controllers.Application.Courses()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """LogIn""", """controllers.Application.LogIn()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/UploadBox""", """controllers.Application.Upload(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/Message""", """controllers.Application.MessageThread()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/CourseIndex""", """controllers.Application.CourseIndex(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/comment""", """controllers.Application.Comment(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/exam/$e_id<[^/]+>""", """controllers.Application.Exams(id:Long, e_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/Project/$p_id<[^/]+>""", """controllers.Application.Projects(id:Long, p_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/CourseDescription""", """controllers.Application.CourseDescription(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/Grades""", """controllers.Application.Grades(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/Project/$p_id<[^/]+>""", """controllers.Application.ProjectInd(id:Long, p_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/Resources""", """controllers.Application.Resources(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/AddGrade""", """controllers.Application.AddGrade(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/EditGrades""", """controllers.Application.EditGrades(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/EditProject""", """controllers.Application.EditProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/EditResources""", """controllers.Application.EditResources(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/ProjectEdit/p_id""", """controllers.Application.ProjectEdit(id:Long, p_id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ForgetPass""", """controllers.Application.ForgetPass()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile/Inbox""", """controllers.Application.Inbox()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Course/$id<[^/]+>/newComment""", """controllers.Application.newComment(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Application_Courses0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Courses")))
  )
  private[this] lazy val controllers_Application_Courses0_invoker = createInvoker(
    Application_1.Courses(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "Courses",
      Nil,
      "GET",
      """ Home page
GET     /                           controllers.Application.index()""",
      this.prefix + """Courses"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_LogIn2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("LogIn")))
  )
  private[this] lazy val controllers_Application_LogIn2_invoker = createInvoker(
    Application_1.LogIn(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "LogIn",
      Nil,
      "GET",
      """""",
      this.prefix + """LogIn"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Application_Upload3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/UploadBox")))
  )
  private[this] lazy val controllers_Application_Upload3_invoker = createInvoker(
    Application_1.Upload(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "Upload",
      Seq(classOf[Long]),
      "GET",
      """POST    /LogIn                      controllers.Application.LogIn()
GET     /ChangePass                controllers.Application.ChangePass()""",
      this.prefix + """Course/$id<[^/]+>/UploadBox"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Application_MessageThread4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/Message")))
  )
  private[this] lazy val controllers_Application_MessageThread4_invoker = createInvoker(
    Application_1.MessageThread(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "MessageThread",
      Nil,
      "GET",
      """""",
      this.prefix + """profile/Message"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Application_CourseIndex5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/CourseIndex")))
  )
  private[this] lazy val controllers_Application_CourseIndex5_invoker = createInvoker(
    Application_1.CourseIndex(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "CourseIndex",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/CourseIndex"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_Application_Comment6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/comment")))
  )
  private[this] lazy val controllers_Application_Comment6_invoker = createInvoker(
    Application_1.Comment(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "Comment",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/comment"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Application_Exams7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/exam/"), DynamicPart("e_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_Exams7_invoker = createInvoker(
    Application_1.Exams(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "Exams",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/exam/$e_id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Application_Projects8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/Project/"), DynamicPart("p_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_Projects8_invoker = createInvoker(
    Application_1.Projects(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "Projects",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/Project/$p_id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Application_CourseDescription9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/CourseDescription")))
  )
  private[this] lazy val controllers_Application_CourseDescription9_invoker = createInvoker(
    Application_1.CourseDescription(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "CourseDescription",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/CourseDescription"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_Application_Grades10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/Grades")))
  )
  private[this] lazy val controllers_Application_Grades10_invoker = createInvoker(
    Application_1.Grades(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "Grades",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/Grades"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Application_ProjectInd11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/Project/"), DynamicPart("p_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Application_ProjectInd11_invoker = createInvoker(
    Application_1.ProjectInd(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "ProjectInd",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/Project/$p_id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Application_Resources12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/Resources")))
  )
  private[this] lazy val controllers_Application_Resources12_invoker = createInvoker(
    Application_1.Resources(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "Resources",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/Resources"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Application_AddGrade13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/AddGrade")))
  )
  private[this] lazy val controllers_Application_AddGrade13_invoker = createInvoker(
    Application_1.AddGrade(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "AddGrade",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/AddGrade"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_Application_EditGrades14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/EditGrades")))
  )
  private[this] lazy val controllers_Application_EditGrades14_invoker = createInvoker(
    Application_1.EditGrades(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "EditGrades",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/EditGrades"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Application_EditProject15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/EditProject")))
  )
  private[this] lazy val controllers_Application_EditProject15_invoker = createInvoker(
    Application_1.EditProject(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "EditProject",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/EditProject"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_Application_EditResources16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/EditResources")))
  )
  private[this] lazy val controllers_Application_EditResources16_invoker = createInvoker(
    Application_1.EditResources(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "EditResources",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/EditResources"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Application_ProjectEdit17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/ProjectEdit/p_id")))
  )
  private[this] lazy val controllers_Application_ProjectEdit17_invoker = createInvoker(
    Application_1.ProjectEdit(fakeValue[Long], fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "ProjectEdit",
      Seq(classOf[Long], classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/ProjectEdit/p_id"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Application_ForgetPass18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ForgetPass")))
  )
  private[this] lazy val controllers_Application_ForgetPass18_invoker = createInvoker(
    Application_1.ForgetPass(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "ForgetPass",
      Nil,
      "GET",
      """""",
      this.prefix + """ForgetPass"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Application_Inbox19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile/Inbox")))
  )
  private[this] lazy val controllers_Application_Inbox19_invoker = createInvoker(
    Application_1.Inbox(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "Inbox",
      Nil,
      "GET",
      """""",
      this.prefix + """profile/Inbox"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Application_newComment20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Course/"), DynamicPart("id", """[^/]+""",true), StaticPart("/newComment")))
  )
  private[this] lazy val controllers_Application_newComment20_invoker = createInvoker(
    Application_1.newComment(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "newComment",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Course/$id<[^/]+>/newComment"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Application_Courses0_route(params) =>
      call { 
        controllers_Application_Courses0_invoker.call(Application_1.Courses())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:10
    case controllers_Application_LogIn2_route(params) =>
      call { 
        controllers_Application_LogIn2_invoker.call(Application_1.LogIn())
      }
  
    // @LINE:13
    case controllers_Application_Upload3_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_Upload3_invoker.call(Application_1.Upload(id))
      }
  
    // @LINE:14
    case controllers_Application_MessageThread4_route(params) =>
      call { 
        controllers_Application_MessageThread4_invoker.call(Application_1.MessageThread())
      }
  
    // @LINE:15
    case controllers_Application_CourseIndex5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_CourseIndex5_invoker.call(Application_1.CourseIndex(id))
      }
  
    // @LINE:16
    case controllers_Application_Comment6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_Comment6_invoker.call(Application_1.Comment(id))
      }
  
    // @LINE:17
    case controllers_Application_Exams7_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("e_id", None)) { (id, e_id) =>
        controllers_Application_Exams7_invoker.call(Application_1.Exams(id, e_id))
      }
  
    // @LINE:18
    case controllers_Application_Projects8_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("p_id", None)) { (id, p_id) =>
        controllers_Application_Projects8_invoker.call(Application_1.Projects(id, p_id))
      }
  
    // @LINE:19
    case controllers_Application_CourseDescription9_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_CourseDescription9_invoker.call(Application_1.CourseDescription(id))
      }
  
    // @LINE:20
    case controllers_Application_Grades10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_Grades10_invoker.call(Application_1.Grades(id))
      }
  
    // @LINE:21
    case controllers_Application_ProjectInd11_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Long]("p_id", None)) { (id, p_id) =>
        controllers_Application_ProjectInd11_invoker.call(Application_1.ProjectInd(id, p_id))
      }
  
    // @LINE:22
    case controllers_Application_Resources12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_Resources12_invoker.call(Application_1.Resources(id))
      }
  
    // @LINE:23
    case controllers_Application_AddGrade13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_AddGrade13_invoker.call(Application_1.AddGrade(id))
      }
  
    // @LINE:24
    case controllers_Application_EditGrades14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_EditGrades14_invoker.call(Application_1.EditGrades(id))
      }
  
    // @LINE:25
    case controllers_Application_EditProject15_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_EditProject15_invoker.call(Application_1.EditProject(id))
      }
  
    // @LINE:26
    case controllers_Application_EditResources16_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_EditResources16_invoker.call(Application_1.EditResources(id))
      }
  
    // @LINE:27
    case controllers_Application_ProjectEdit17_route(params) =>
      call(params.fromPath[Long]("id", None), params.fromQuery[Long]("p_id", None)) { (id, p_id) =>
        controllers_Application_ProjectEdit17_invoker.call(Application_1.ProjectEdit(id, p_id))
      }
  
    // @LINE:28
    case controllers_Application_ForgetPass18_route(params) =>
      call { 
        controllers_Application_ForgetPass18_invoker.call(Application_1.ForgetPass())
      }
  
    // @LINE:29
    case controllers_Application_Inbox19_route(params) =>
      call { 
        controllers_Application_Inbox19_invoker.call(Application_1.Inbox())
      }
  
    // @LINE:30
    case controllers_Application_newComment20_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_newComment20_invoker.call(Application_1.newComment(id))
      }
  }
}