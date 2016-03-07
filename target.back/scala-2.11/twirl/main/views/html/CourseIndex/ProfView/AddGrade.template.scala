
package views.html.CourseIndex.ProfView

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object AddGrade_Scope0 {
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

class AddGrade extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/CourseTemplate(title)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<h1></h1>
""")))}/*4.2*/{_display_(Seq[Any](format.raw/*4.3*/("""
"""),format.raw/*5.1*/("""<div class="rightBar col-md-7 col-md-offset">
    <div class="courseList">
        <div class="gradeBox">
    <div class="title">
        نمرات تمرینها
    </div>
        <div class="linkGrade"><a>
            تمرین اول
        </a></div>
        <div><a class="linkGrade">
            تمرین اول
        </a></div>
</div>
        <div class="RtoL middle">
            <button class="btn">
            افزودن نمره
        </button>
             <input class="input-form">
        نمره:


</div></div>

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
object AddGrade extends AddGrade_Scope0.AddGrade
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/ProfView/AddGrade.scala.html
                  HASH: a48696e58ddbb544317f8981fb245d2bbee689ea
                  MATRIX: 772->1|881->15|909->18|938->39|976->40|1004->42|1033->54|1070->55|1098->57
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5
                  -- GENERATED --
              */
          