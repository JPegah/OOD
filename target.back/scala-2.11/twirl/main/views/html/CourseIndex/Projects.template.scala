
package views.html.CourseIndex

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Projects_Scope0 {
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

class Projects extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/CourseTemplate(title: String)/*2.31*/{_display_(Seq[Any](format.raw/*2.32*/("""
"""),format.raw/*3.1*/("""<h1></h1>
""")))}/*4.2*/{_display_(Seq[Any](format.raw/*4.3*/("""
"""),format.raw/*5.1*/("""<div class="rightBar col-md-7 col-md-offset">
<div class="courseInd">
    <div class="course">
        <span class="col-md-3"><div>
مهلت ارسال: 93/2/7
</div>
            <div>
                <button class="btn">
                    2 نمره
                </button>
</div>
        </span>
        <span>
            <div>
            <a>
                پروژه اول فاز اول
            </a>
</div>
            <div>
                آشنایی با مستندسازی و تعیین موارد کاربردی
</div>
        </span>

        <br>
                <span class="col-md-3"><div>
مهلت ارسال: 93/2/7
</div>
            <div>
                <button class="btn">
                    2 نمره
                </button>
</div>
        </span>
        <span>
            <div>
            <a>
پروزه اول فاز دوم
            </a>
</div>
            <div>
                آشنایی با مستندسازی و تعیین موارد کاربردی
</div>
        </span>
    </div>
    <div class="course">
        <span class="col-md-3"><div>
مهلت ارسال: 93/2/7
</div>
            <div>
                <button class="btn">
                    2 نمره
                </button>
</div>
        </span>
        <span>
            <div>
            <a>
                پروژه اول فاز اول
            </a>
</div>
            <div>
                آشنایی با مستندسازی و تعیین موارد کاربردی
</div>
        </span>

        <br>
                <span class="col-md-3"><div>
مهلت ارسال: 93/2/7
</div>
            <div>
                <button class="btn">
                    2 نمره
                </button>
</div>
        </span>
        <span>
            <div>
            <a>
پروزه اول فاز دوم
            </a>
</div>
            <div>
                آشنایی با مستندسازی و تعیین موارد کاربردی
</div>
        </span>
    </div>
    </div>
</div>
""")))}),format.raw/*93.2*/("""

"""))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object Projects extends Projects_Scope0.Projects
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/Projects.scala.html
                  HASH: a8080736a8de0420918e3ac349e4be90fa059e7b
                  MATRIX: 763->1|872->15|900->18|937->47|975->48|1003->50|1032->62|1069->63|1097->65|2988->1926
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|35->4|35->4|36->5|124->93
                  -- GENERATED --
              */
          