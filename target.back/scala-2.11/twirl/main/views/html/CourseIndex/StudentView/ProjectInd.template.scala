
package views.html.CourseIndex.StudentView

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ProjectInd_Scope0 {
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

class ProjectInd extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

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
 <p class="name">
    فاز اول پروژه اول
 </p>
    <p class="name">
        توضیحات: آشنایی با مستندات
    </p>
    <p class="name"><a>
        صورت پروژه
    </a></p>
    <p class="name">
        مهلت ارسال: 2/2/94
    </p>
    <p class="name">
        2 نمره
    </p>
    <button class="btn middle">
        بارگذاری پروژه
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
object ProjectInd extends ProjectInd_Scope0.ProjectInd
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/StudentView/ProjectInd.scala.html
                  HASH: 2048195cc700b55680aa8e4cad0b81709581596e
                  MATRIX: 779->1|888->15|918->20|947->41|985->42|1013->44|1042->56|1079->57|1107->59
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|37->6
                  -- GENERATED --
              */
          