
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Inbox_Scope0 {
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

class Inbox extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,LogicClasses.Users,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(title:String)(user: LogicClasses.Users):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.42*/("""
"""),_display_(/*3.2*/InboxTemplate(title)/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""

"""),format.raw/*5.1*/("""<div class="rightBar col-md-7 col-md-offset">
<div class="courseList">
<div class="courseInd">
    <span class="chat">
        hey look at new version of the project
    </span>
    <span class="user">
        project
    </span>
    <span class="user">
	
        </span>


</div>
    <div class="courseInd">
    <span class="chat">
        hey look at new version of the project
    </span>
        <span class="user">
        project
    </span>
    <span class="user">
        لاله
        </span>
        </div>
</div>
</div>
""")))}),format.raw/*33.2*/("""
"""))
      }
    }
  }

  def render(title:String,user:LogicClasses.Users): play.twirl.api.HtmlFormat.Appendable = apply(title)(user)

  def f:((String) => (LogicClasses.Users) => play.twirl.api.HtmlFormat.Appendable) = (title) => (user) => apply(title)(user)

  def ref: this.type = this

}


}

/**/
object Inbox extends Inbox_Scope0.Inbox
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 17:35:24 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/Inbox.scala.html
                  HASH: 3118f25c0ea92f375948ec6c407e6f2dd9c73c2b
                  MATRIX: 764->3|899->43|927->46|955->66|993->67|1023->71|1612->630
                  LINES: 27->2|32->2|33->3|33->3|33->3|35->5|63->33
                  -- GENERATED --
              */
          