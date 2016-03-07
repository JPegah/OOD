
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object LogIn_Scope0 {
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

class LogIn extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/FormTemplate(title)/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""

"""),format.raw/*4.1*/("""<div class="rightBar col-md-4 col-md-offset  RTOL">
<div class="input-group">
<span>
نام کاربری
</span>
<input type="text" class="form-control" placeholder="نام کاربری" aria-describedby="basic-addon1">

</div>

<div class="input-group">
<span>
گذرواژه
</span>
<input type="text" class="form-control" placeholder="گذرواژه" aria-describedby="basic-addon1">

</div>
<div>

<button class="btn btn-default middle"> ورود</button>
</div>
<div>

<a class="middle" href="ForgetPass">
رمز عبور خود را فراموش کرده اید؟
</a>

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
object LogIn extends LogIn_Scope0.LogIn
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/LogIn.scala.html
                  HASH: 018f924d613a96e1d15d77cb3ce3df45470c1b57
                  MATRIX: 745->1|854->15|882->18|909->37|947->38|977->42
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4
                  -- GENERATED --
              */
          