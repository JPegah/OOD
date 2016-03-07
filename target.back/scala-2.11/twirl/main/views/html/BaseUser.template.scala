
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object BaseUser_Scope0 {
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

class BaseUser extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String)(main: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.28*/("""

"""),_display_(/*3.2*/BaseTemplate(title)/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
"""),format.raw/*4.1*/("""<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>

        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a>
                    خروح
                </a></li>
                <li><a>
                    شما در قالب دانشجو وارد سایت شده اید.
                </a></li>

            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li><a>
                    تغییر رمز
                </a></li>

                <li class="active"><a href="#">
                    لیست دروس
                </a></li>
                <li><a>
                    درس های من
                </a>
                </li>
                <li><a>
                    اطلاعات من
                </a></li>


            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<body>"""),_display_(/*50.8*/main),format.raw/*50.12*/("""</body>
""")))}))
      }
    }
  }

  def render(title:String,main:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(main)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (main) => apply(title)(main)

  def ref: this.type = this

}


}

/**/
object BaseUser extends BaseUser_Scope0.BaseUser
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/BaseUser.scala.html
                  HASH: da89a1e078b70757ac4907d0bc3e961de50f9bed
                  MATRIX: 756->1|877->27|905->30|932->49|970->50|997->51|2531->1559|2556->1563
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|81->50|81->50
                  -- GENERATED --
              */
          