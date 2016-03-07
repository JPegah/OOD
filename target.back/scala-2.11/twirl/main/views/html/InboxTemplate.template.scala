
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object InboxTemplate_Scope0 {
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

class InboxTemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/BaseUser(title)/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""
"""),format.raw/*4.1*/("""<div class="main">
    <div class="leftBar col-md-2">
        <table class="table table-hover" dir="rtl">
            <tr><td>
                صندوق ورودی
            </td></tr>
            <tr><td>
                صندوق خروجی
            </td></tr>
            <tr><td>
                ایجاد پیام جدید
            </td></tr>
        </table>
    </div>
</div>
"""),_display_(/*19.2*/content),format.raw/*19.9*/("""
""")))}))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object InboxTemplate extends InboxTemplate_Scope0.InboxTemplate
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/InboxTemplate.scala.html
                  HASH: 97f5c61b2a8469dfccccbc1e9ce13a324325995c
                  MATRIX: 766->1|890->30|918->33|941->48|979->49|1006->50|1394->412|1421->419
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|50->19|50->19
                  -- GENERATED --
              */
          