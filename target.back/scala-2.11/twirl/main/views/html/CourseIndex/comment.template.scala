
package views.html.CourseIndex

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object comment_Scope0 {
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

class comment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/CommentTemplate(title)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
"""),format.raw/*3.1*/("""<div class="commentBox">
    <div class="commentTitle">
    <div>
       نوشته شده در تاریخ 1/1/94 توسط لاله
    <span class="user chat">
        امتیاز از 10: 2
    </span>
        </div>
        </div>
    <div>
        پروژه بسیار نامناسب است. دستیار بی نظم حجم زیاد و توقعات نابحا
    </div>
</div>
    <div class="commentBox">
    <div class="commentTitle">
    <div>
       نوشته شده در تاریخ 1/1/94 توسط لاله
    <span class="user chat">
        امتیاز از 10: 2
    </span>
        </div>
        </div>
    <div>
        پروژه بسیار نامناسب است. دستیار بی نظم حجم زیاد و توقعات نابحا
    </div>
</div>
""")))}),format.raw/*29.2*/("""


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
object comment extends comment_Scope0.comment
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/comment.scala.html
                  HASH: c058946e80d6fb91310969d67c27f8bf1b678102
                  MATRIX: 761->1|870->15|898->18|928->40|966->41|994->43|1661->680
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|60->29
                  -- GENERATED --
              */
          