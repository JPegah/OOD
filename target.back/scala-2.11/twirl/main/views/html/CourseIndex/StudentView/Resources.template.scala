
package views.html.CourseIndex.StudentView

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Resources_Scope0 {
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

class Resources extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/CourseTemplate(title)/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
"""),format.raw/*4.1*/("""<h1></h1>
""")))}/*5.2*/{_display_(Seq[Any](format.raw/*5.3*/("""
"""),format.raw/*6.1*/("""<div class="rightBar col-md-7 col-md-offset">
<div class="courseInd">
    <a>
        کتاب زبان اصلی طراحی شئ گرای سیستم ها
    </a>
    <br>
    <a>
        کتاب هنر برنامه نویسی
    </a>
    </div>
</div>
""")))}))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object Resources extends Resources_Scope0.Resources
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/StudentView/Resources.scala.html
                  HASH: 0f8f6cfb4415a849d4be5c9a0c2d56b581e51830
                  MATRIX: 777->1|886->15|916->20|945->41|983->42|1011->44|1040->56|1077->57|1105->59
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6
                  -- GENERATED --
              */
          