
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object FormTemplate_Scope0 {
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

class FormTemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),_display_(/*2.2*/BaseTemplate(title)/*2.21*/ {_display_(Seq[Any](format.raw/*2.23*/("""

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
            <ul class="nav navbar-nav navbar-right">
                <li><a>
                    سامانه جامع پایشگر آموزشی دانشگاه صنعتی شریف
                </a></li>


            </ul>
        </div>
    </div>
</nav>
<div class="main">
    <div class="leftBar col-md-4">

    </div>
</div>
</div>
"""),_display_(/*35.2*/content),format.raw/*35.9*/("""
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
object FormTemplate extends FormTemplate_Scope0.FormTemplate
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/FormTemplate.scala.html
                  HASH: 30150f49b5bdcd6289a6306d6d6d952a73a9c763
                  MATRIX: 764->1|889->31|916->33|943->52|982->54|1010->56|2074->1094|2101->1101
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|66->35|66->35
                  -- GENERATED --
              */
          