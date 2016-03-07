
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object BaseTemplate_Scope0 {
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

class BaseTemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),format.raw/*2.1*/("""<html>
<head lang="en">
    <link rel="stylesheet" href=""""),_display_(/*4.35*/routes/*4.41*/.Assets.versioned("stylesheets/style.css")),format.raw/*4.83*/("""">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    <meta charset="UTF-8">
    <title>
        """),_display_(/*10.10*/title),format.raw/*10.15*/("""
    """),format.raw/*11.5*/("""</title>

</head>
"""),_display_(/*14.2*/body),format.raw/*14.6*/("""
"""),format.raw/*15.1*/("""</html>
"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


}

/**/
object BaseTemplate extends BaseTemplate_Scope0.BaseTemplate
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/BaseTemplate.scala.html
                  HASH: 9a53008d45021a615713bb9a65479cbb9ea31b59
                  MATRIX: 764->1|886->28|913->29|997->87|1011->93|1073->135|1463->498|1489->503|1521->508|1566->527|1590->531|1618->532
                  LINES: 27->1|32->1|33->2|35->4|35->4|35->4|41->10|41->10|42->11|45->14|45->14|46->15
                  -- GENERATED --
              */
          