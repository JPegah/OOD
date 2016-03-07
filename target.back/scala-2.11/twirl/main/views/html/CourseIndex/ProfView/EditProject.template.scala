
package views.html.CourseIndex.ProfView

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object EditProject_Scope0 {
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

class EditProject extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/CourseTemplate(title)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<h1></h1>""")))}/*3.11*/{_display_(Seq[Any](format.raw/*3.12*/("""
"""),format.raw/*4.1*/("""<div class="rightBar col-md-7 col-md-offset">
<div class="courseInd">
    <div>
    <input class="inline" value="فاز اول پروژه طراحی شئ گرا">

       عنوان پروژه
</div>
    <div>
        <input class="inline" value="آشنایی با مستند سازی و موارد کابرد">
        توضیحات
    </div>
    <div>
        <button class="btn">
            بارگذاری
        </button>
        <a>
            صورت پروژه
        </a>
    </div>
    <div>
        <input class="inline" value="سال/ماه/روز">
        مهلت ارسال
        </div>
    <div>

        <input class="inline" value="">
        ارسال با تاخیر
        <input class="inline" value="سال/ماه/روز">
        ضریب تاخیر
        <input class="inline" type="checkbox">
      </div>
    <div>
        <input class="inline" value="">
        بارم
        </div>
    <button class="btn middle">
        ثبت
    </button>

</div>

</div>
""")))}),format.raw/*46.2*/("""
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
object EditProject extends EditProject_Scope0.EditProject
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/ProfView/EditProject.scala.html
                  HASH: 5f62c28fa38021012eb74acc66b91cfa080aa096
                  MATRIX: 778->1|887->15|915->18|944->39|982->40|1010->42|1038->52|1076->53|1104->55|2045->966
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|35->4|77->46
                  -- GENERATED --
              */
          