
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object CourseTemplate_Scope0 {
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

class CourseTemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Html,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String)(extraMenu: Html)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.45*/("""

"""),_display_(/*3.2*/BaseUser(title)/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
"""),format.raw/*4.1*/("""<div class="main">
    <div class="leftBar col-md-2">
        <table class="table table-hover" dir="rtl">
            <tr><td>
                منابع
            </td></tr>
            <tr><td>
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
            """),_display_(/*37.14*/extraMenu),format.raw/*37.23*/("""
            """),format.raw/*38.13*/("""<tr><td>
                بازخوردها
            </td></tr>
        </table>
    </div>
</div>

"""),_display_(/*45.2*/body),format.raw/*45.6*/("""

""")))}))
      }
    }
  }

  def render(title:String,extraMenu:Html,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(extraMenu)(body)

  def f:((String) => (Html) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (extraMenu) => (body) => apply(title)(extraMenu)(body)

  def ref: this.type = this

}


}

/**/
object CourseTemplate extends CourseTemplate_Scope0.CourseTemplate
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseTemplate.scala.html
                  HASH: 7dd5e3f116d874f6cbca551c038d90f3db71a397
                  MATRIX: 773->1|911->44|939->47|962->62|1000->63|1027->64|1872->882|1902->891|1943->904|2064->999|2088->1003
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|68->37|68->37|69->38|76->45|76->45
                  -- GENERATED --
              */
          