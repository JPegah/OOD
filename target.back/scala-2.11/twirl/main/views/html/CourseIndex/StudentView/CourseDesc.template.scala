
package views.html.CourseIndex.StudentView

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object CourseDesc_Scope0 {
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

class CourseDesc extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/CourseTemplate(title)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<h1></h1>
""")))}/*4.2*/{_display_(Seq[Any](format.raw/*4.3*/("""
"""),format.raw/*5.1*/("""<div class="rightBar col-md-7 col-md-offset">
    <div class="courseInd">
        <ul dir="rtl">
            <li>
                مقدمه
            </li>
            <ul>
                <li>
                    متدولوژی یو پی
                </li>
                <li>
                    متدولوژی چابک
                </li>
            </ul>
            <li>
                آشنایی با انوع متدولوژی ها
            </li>
        </ul>
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
object CourseDesc extends CourseDesc_Scope0.CourseDesc
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/StudentView/CourseDesc.scala.html
                  HASH: f60a17b13fd627178e6b116d1c63e3cd875b7882
                  MATRIX: 779->1|888->15|915->17|944->38|982->39|1009->40|1037->51|1074->52|1101->53
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5
                  -- GENERATED --
              */
          