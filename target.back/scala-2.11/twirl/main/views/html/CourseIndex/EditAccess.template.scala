
package views.html.CourseIndex

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object EditAccess_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class EditAccess extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head lang="en">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <title>نمرات</title>

</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>

    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a>
            خروح
        </a></li>
          <li><a>
              شما در قالب دانشجو وارد سایت شده اید.
          </a></li>

      </ul>

      <ul class="nav navbar-nav navbar-right">
          <li><a>
              تغییر رمز
          </a></li>

         <li class="active"><a href="#">
لیست دروس
         </a></li>
        <li><a>
درس های من
        </a>
        </li>
          <li><a>
              اطلاعات من
          </a></li>


      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="main">
<div class="leftBar col-md-2">
    <table class="table table-hover" dir="rtl">
        <tr><td>
            منابع
        </td></tr>
        <tr class="active"><td>
            دستیاران
        </td></tr>
        <tr><td>
            لینک های کمکی
        </td></tr>
        <tr><td>
            پروژه ها
        </td></tr>
        <tr><td>
            تمرین ها
        </td></tr>
        <tr><td>
            آزمون ها
        </td></tr>
        <tr><td>
            نمرات
        </td></tr>
        <tr><td>
            برنامه تمرین ها
        </td></tr>
        <tr><td>
            برنامه درس
        </td></tr>
        <tr><td>
            شرح جلسات
        </td></tr>
        <tr><td>
            بازخوردها
        </td></tr>
    </table>
</div>
</div>
</div>
<div class="rightBar col-md-7 col-md-offset">


</div>

</div>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object EditAccess extends EditAccess_Scope0.EditAccess
              /*
                  -- GENERATED --
                  DATE: Sat Mar 05 17:20:44 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/EditAccess.scala.html
                  HASH: 7f1b3255885def6152bc11f2d0fae08c068ec51b
                  MATRIX: 849->0
                  LINES: 32->1
                  -- GENERATED --
              */
          