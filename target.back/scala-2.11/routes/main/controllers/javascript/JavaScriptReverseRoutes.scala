
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/mbm/university/OOD/OOD-phase5/OOD/conf/routes
// @DATE:Mon Mar 07 15:02:38 IRST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:7
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def ForgetPass: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.ForgetPass",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "ForgetPass"})
        }
      """
    )
  
    // @LINE:21
    def ProjectInd: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.ProjectInd",
      """
        function(id,p_id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/Project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("p_id", p_id)})
        }
      """
    )
  
    // @LINE:10
    def LogIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.LogIn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "LogIn"})
        }
      """
    )
  
    // @LINE:7
    def Courses: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.Courses",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Courses"})
        }
      """
    )
  
    // @LINE:23
    def AddGrade: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.AddGrade",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/AddGrade"})
        }
      """
    )
  
    // @LINE:29
    def Inbox: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.Inbox",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/Inbox"})
        }
      """
    )
  
    // @LINE:25
    def EditProject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.EditProject",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/EditProject"})
        }
      """
    )
  
    // @LINE:15
    def CourseIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.CourseIndex",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/CourseIndex"})
        }
      """
    )
  
    // @LINE:20
    def Grades: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.Grades",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/Grades"})
        }
      """
    )
  
    // @LINE:18
    def Projects: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.Projects",
      """
        function(id,p_id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/Project/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("p_id", p_id)})
        }
      """
    )
  
    // @LINE:30
    def newComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.newComment",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/newComment"})
        }
      """
    )
  
    // @LINE:27
    def ProjectEdit: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.ProjectEdit",
      """
        function(id,p_id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/ProjectEdit/p_id" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("p_id", p_id)])})
        }
      """
    )
  
    // @LINE:22
    def Resources: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.Resources",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/Resources"})
        }
      """
    )
  
    // @LINE:16
    def Comment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.Comment",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/comment"})
        }
      """
    )
  
    // @LINE:26
    def EditResources: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.EditResources",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/EditResources"})
        }
      """
    )
  
    // @LINE:17
    def Exams: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.Exams",
      """
        function(id,e_id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/exam/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("e_id", e_id)})
        }
      """
    )
  
    // @LINE:13
    def Upload: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.Upload",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/UploadBox"})
        }
      """
    )
  
    // @LINE:14
    def MessageThread: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.MessageThread",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile/Message"})
        }
      """
    )
  
    // @LINE:19
    def CourseDescription: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.CourseDescription",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/CourseDescription"})
        }
      """
    )
  
    // @LINE:24
    def EditGrades: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.EditGrades",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Course/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/EditGrades"})
        }
      """
    )
  
  }


}