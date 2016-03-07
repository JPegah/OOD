
package views.html.CourseIndex

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object courseIndex_Scope0 {
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

class courseIndex extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/CourseTemplate(title)/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
"""),format.raw/*4.1*/("""<h1></h1>
""")))}/*5.2*/{_display_(Seq[Any](format.raw/*5.3*/("""

"""),format.raw/*7.1*/("""<div class="rightBar col-md-7 col-md-offset">
<div class="courseInd">
 <p class="name">
     طراحی شئ گرای سیستم ها
 </p>
    <p class="name">
        مدرس: دکتر رامسین
    </p>
    <p class="name">
زمان برگزاری کلاس ها: یکشنبه و سه شنبه 1 تا 3
    </p>
    <p class="name">
        مکان: کلاس 101
    </p>
    <p class="name">
        دانشکده مهندسی کامپیوتر
    </p>
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
object courseIndex extends courseIndex_Scope0.courseIndex
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/courseIndex.scala.html
                  HASH: 4d5f98ee355cb1ca451d03a966d6d3e2a36ee577
                  MATRIX: 769->1|878->15|908->20|937->41|975->42|1003->44|1032->56|1069->57|1099->61
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|38->7
                  -- GENERATED --
              */
          