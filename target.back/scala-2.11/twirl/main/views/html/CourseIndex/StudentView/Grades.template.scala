
package views.html.CourseIndex.StudentView

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Grades_Scope0 {
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

class Grades extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/CourseTemplate(title)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<h1></h1>
""")))}/*4.2*/{_display_(Seq[Any](format.raw/*4.3*/("""
"""),format.raw/*5.1*/("""<div class="rightBar col-md-7 col-md-offset">
    <table class="table table-striped" dir="rtl">
        <tr>
            <td>
                نام
            </td>
            <td>
                شماره دانشجویی
            </td>
            <td>
                تمرین اول از 100 (2 نمره)
            </td>
            <td>
                تاخیر تمرین اول
            </td>
            <td>
                آزمونک اول از 20(1 نمره)
            </td>
            <td>
                پایان ترم از 50(3 نمره)
            </td>
            <td>
                میان ترم از 70(8 نمره)
            </td>
        </tr>
        <tr>
            <td>
                پگاه جندقی
            </td>
            <td>
                90105978
            </td>
            <td>
                100
            </td>
            <td>
                0
            </td>
            <td>
                -
            </td>
            <td>
                -
            </td>
            <td>
                2
            </td>
        </tr>
        <tr>
            <td>
                بیشینه نمرات
            </td>
            <td>

            </td>
            <td>

            </td>
            <td>

            </td>
            <td>

            </td>
            <td>

            </td>
            <td>

            </td>
        </tr>
    </table>

</div>
""")))}),format.raw/*79.2*/("""
"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object Grades extends Grades_Scope0.Grades
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/StudentView/Grades.scala.html
                  HASH: 03bfd763a4024e48f28aa817245ca257f3cf5a37
                  MATRIX: 771->1|880->15|908->18|937->39|975->40|1003->42|1032->54|1069->55|1097->57|2559->1489
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5|110->79
                  -- GENERATED --
              */
          