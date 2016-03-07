
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object MessageThread_Scope0 {
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

class MessageThread extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/InboxTemplate(title)/*2.22*/{_display_(Seq[Any](format.raw/*2.23*/("""
"""),format.raw/*3.1*/("""<div class="rightBar col-md-7 col-md-offset">
<div class="courseList">
<div class="courseInd">
    <div class="user">

            پگاه جندقی
 در تاریخ 2/2/92 ارسال شده:
        </div>
    <div>
        hey look at new version of the project it is attached
        <br>
        good luck
        <br>
    </div>


</div>
    <div class="courseInd">
        <div class="user">

       لاله
    ارسال شده در تاریخ 3/2/93
        </div>
    <div >
        hey look at new version of the project
    </div>


        </div>
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
object MessageThread extends MessageThread_Scope0.MessageThread
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/MessageThread.scala.html
                  HASH: 3286dec737a111537aedae3d8dff32b571b13cef
                  MATRIX: 761->1|870->15|898->18|926->38|964->39|992->41
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3
                  -- GENERATED --
              */
          