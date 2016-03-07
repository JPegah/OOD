
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ChangePass_Scope0 {
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

class ChangePass extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""
"""),_display_(/*2.2*/FormTemplate(title)/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
"""),format.raw/*3.1*/("""<div class="main">
<div class="leftBar col-md-4">
</div>
</div>
</div>
<div class="rightBar col-md-4 col-md-offset  RTOL">
    <div>
        کاربر گرامی لطفا رمز عبور جدید خود را وارد کنید.
    </div>
        <div class="input-group">
              <span>
                  گذرواژه جدید
              </span>
  <input type="text" class="form-control" aria-describedby="basic-addon1">

</div>

            <div class="input-group">
<span>
    تایید گذرواژه جدید
</span>
  <input type="text" class="form-control" aria-describedby="basic-addon1">

</div>
    <div>

            <button class="btn btn-default middle">
            ارسال

            </button>
    </div>
    <div>


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
object ChangePass extends ChangePass_Scope0.ChangePass
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/ChangePass.scala.html
                  HASH: aabe4fa2e50317925601fbc0139b2f43dc7db4f4
                  MATRIX: 755->1|865->16|893->19|920->38|958->39|986->41
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3
                  -- GENERATED --
              */
          