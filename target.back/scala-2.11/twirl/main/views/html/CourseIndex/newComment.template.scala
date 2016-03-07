
package views.html.CourseIndex

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object newComment_Scope0 {
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

class newComment extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""

"""),_display_(/*3.2*/CommentTemplate(title)/*3.24*/{_display_(Seq[Any](format.raw/*3.25*/("""
    """),format.raw/*4.5*/("""<div class="commentBox">
    <div class="commentTitle">
        <div>
           بازخورد برای پروژهای درس
        </div>
    <span class="dropdown user chat">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
امتیاز

 <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
    <li><a href="#">1</a></li>
    <li><a href="#">2</a></li>
     <li><a href="#">3</a></li>
       <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>

  </ul>
</span>
        </div>
        <textarea placeholder="لطفا متن بازخورد را در این جا بنویسید"></textarea>
        <br>
        <button class="btn">
            ثبت
        </button>

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
object newComment extends newComment_Scope0.newComment
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/newComment.scala.html
                  HASH: 8e2a5c597b60f47969d864a72c7ff36ddeef3b65
                  MATRIX: 767->1|876->15|906->20|936->42|974->43|1006->49
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          