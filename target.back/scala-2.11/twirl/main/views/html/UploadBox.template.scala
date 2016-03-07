
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object UploadBox_Scope0 {
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

class UploadBox extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/FormTemplate(title)/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
"""),format.raw/*4.1*/("""<div class="main">
<div class="leftBar col-md-4">

</div>
</div>
<div class="rightBar col-md-4 col-md-offset">
    <div class="courseList"><div>
         <span class="dropdown">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
 انتخاب پروژه و فاز
    <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
    <li><a href="#">Action</a></li>
    <li><a href="#">Another action</a></li>
    <li><a href="#">Something else here</a></li>
    <li role="separator" class="divider"></li>
    <li><a href="#">Separated link</a></li>
  </ul>
</span>
    </div>
    <div>
        <input class="form upForm">
        <button class="btn">
            انتخاب فایل
        </button>

    </div>
    <button class="btn middle">
        بارگذاری
</button>
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
object UploadBox extends UploadBox_Scope0.UploadBox
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/UploadBox.scala.html
                  HASH: ac1abab6837be60982fa2054b5d5ad98b1eb0109
                  MATRIX: 753->1|863->16|893->21|920->40|958->41|986->43
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          