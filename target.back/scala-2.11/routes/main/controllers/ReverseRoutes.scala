
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mbm/university/OOD/OOD-phase5/OOD/conf/routes
// @DATE:Mon Mar 07 15:02:38 IRST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers {

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def ForgetPass(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ForgetPass")
    }
  
    // @LINE:21
    def ProjectInd(id:Long, p_id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/Project/" + implicitly[PathBindable[Long]].unbind("p_id", p_id))
    }
  
    // @LINE:10
    def LogIn(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "LogIn")
    }
  
    // @LINE:7
    def Courses(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Courses")
    }
  
    // @LINE:23
    def AddGrade(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/AddGrade")
    }
  
    // @LINE:29
    def Inbox(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile/Inbox")
    }
  
    // @LINE:25
    def EditProject(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/EditProject")
    }
  
    // @LINE:15
    def CourseIndex(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/CourseIndex")
    }
  
    // @LINE:20
    def Grades(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/Grades")
    }
  
    // @LINE:18
    def Projects(id:Long, p_id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/Project/" + implicitly[PathBindable[Long]].unbind("p_id", p_id))
    }
  
    // @LINE:30
    def newComment(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/newComment")
    }
  
    // @LINE:27
    def ProjectEdit(id:Long, p_id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/ProjectEdit/p_id" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("p_id", p_id)))))
    }
  
    // @LINE:22
    def Resources(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/Resources")
    }
  
    // @LINE:16
    def Comment(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/comment")
    }
  
    // @LINE:26
    def EditResources(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/EditResources")
    }
  
    // @LINE:17
    def Exams(id:Long, e_id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/exam/" + implicitly[PathBindable[Long]].unbind("e_id", e_id))
    }
  
    // @LINE:13
    def Upload(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/UploadBox")
    }
  
    // @LINE:14
    def MessageThread(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "profile/Message")
    }
  
    // @LINE:19
    def CourseDescription(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/CourseDescription")
    }
  
    // @LINE:24
    def EditGrades(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "Course/" + implicitly[PathBindable[Long]].unbind("id", id) + "/EditGrades")
    }
  
  }


}