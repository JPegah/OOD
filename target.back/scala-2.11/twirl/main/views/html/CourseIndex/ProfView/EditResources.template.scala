
package views.html.CourseIndex.ProfView

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object EditResources_Scope0 {
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

class EditResources extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
    <div>
        <button class="btn">
            حذف
        </button>
    <a>
        کتاب زبان اصلی طراحی شئ گرای سیستم ها
    </a>
        </div>
    <br>
    <div>
        <button class="btn">
            حذف
        </button>
        <a>
        کتاب هنر برنامه نویسی
    </a></div>
    <button class="btn middle">
        افزودن منبع
    </button>
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
object EditResources extends EditResources_Scope0.EditResources
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/ProfView/EditResources.scala.html
                  HASH: ca5ccedf1d4b977a36ed7b3c3a4f2ec48c933020
                  MATRIX: 782->1|891->15|919->18|948->39|986->40|1014->42|1043->54|1080->55|1108->57
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5
                  -- GENERATED --
              */
          