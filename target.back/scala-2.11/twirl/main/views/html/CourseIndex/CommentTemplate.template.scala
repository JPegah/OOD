
package views.html.CourseIndex

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object CommentTemplate_Scope0 {
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

class CommentTemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String)(comments: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),_display_(/*2.2*/CourseTemplate(title)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<h1></h1>
""")))}/*4.2*/{_display_(Seq[Any](format.raw/*4.3*/("""
"""),format.raw/*5.1*/("""<div class="rightBar col-md-7 col-md-offset">
<span class="dropdown middleTitle">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
      مشاهده نظرات
      <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
      <li><a href="#">پروژه ها</a></li>
      <li><a href="#">تمرین ها</a></li>
      <li><a href="#">امتحان ها</a></li>
      <li role="separator" class="divider"></li>
      <li><a href="#">منبع</a></li>
  </ul>
</span>
    <span class="dropdown middleTitle">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
      ثبت نظر
      <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
      <li><a href="#">پروژه ها</a></li>
      <li><a href="#">تمرین ها</a></li>
      <li><a href="#">امتحان ها</a></li>
      <li role="separator" class="divider"></li>
      <li><a href="#">منبع</a></li>
  </ul>
</span>
    """),_display_(/*32.6*/comments),format.raw/*32.14*/("""
"""),format.raw/*33.1*/("""</div>""")))}),format.raw/*33.8*/("""
"""))
      }
    }
  }

  def render(title:String,comments:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(comments)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (comments) => apply(title)(comments)

  def ref: this.type = this

}


}

/**/
object CommentTemplate extends CommentTemplate_Scope0.CommentTemplate
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/CommentTemplate.scala.html
                  HASH: 8c81fd219d743242ecfb0113344d4e3e49b24226
                  MATRIX: 782->1|907->31|934->33|963->54|1001->55|1028->56|1056->67|1093->68|1120->69|2262->1185|2291->1193|2319->1194|2356->1201
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5|63->32|63->32|64->33|64->33
                  -- GENERATED --
              */
          