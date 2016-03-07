
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ForgetPass_Scope0 {
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

class ForgetPass extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/FormTemplate(title)/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
"""),format.raw/*3.1*/("""<body>
<div class="main">
<div class="leftBar col-md-4">

</div>
</div>
</div>
<div class="rightBar col-md-4 col-md-offset  RTOL">
        <div class="input-group">
              <span>
                  رایانامه
              </span>
  <input type="text" class="form-control" placeholder="رایانامه" aria-describedby="basic-addon1">

</div>
    <div>

            <button class="btn btn-default middle">
            ارسال
            </button>
    </div>


</div>

</div>
</body>
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
object ForgetPass extends ForgetPass_Scope0.ForgetPass
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/ForgetPass.scala.html
                  HASH: 4d2e6fa76fc4c23e7745c637de3b682969d9d101
                  MATRIX: 755->1|864->15|892->18|919->37|957->38|985->40
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3
                  -- GENERATED --
              */
          