
package views.html.CourseIndex.ProfView

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object EditDescription_Scope0 {
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

class EditDescription extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
<a>
    حذف
</a>
    </li>
    <ul>
        <li>
            متدولوژی یو پی
<a>
    حذف
</a>
        </li>
        <li>
            متدولوژی چابک
        <a>
            حذف
        </a>
        </li>
        <li>
            <input class="formControl">
            <button class="btn">
                افزودن
            </button>
        </li>
    </ul>
    <li>
آشنایی با انوع متدولوژی ها
   <a>
       حذف
   </a>
    </li>

    <li>
        <input class="formControl">
        <button class="btn">
            افزودن
        </button>
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
object EditDescription extends EditDescription_Scope0.EditDescription
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/ProfView/EditDescription.scala.html
                  HASH: 913ec22865b11c91c177a566ff6ccfd43ebd6901
                  MATRIX: 786->1|895->15|923->18|952->39|990->40|1018->42|1047->54|1084->55|1112->57
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5
                  -- GENERATED --
              */
          