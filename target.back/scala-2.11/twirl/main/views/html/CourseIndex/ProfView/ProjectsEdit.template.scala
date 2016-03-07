
package views.html.CourseIndex.ProfView

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object ProjectsEdit_Scope0 {
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

class ProjectsEdit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),_display_(/*2.2*/CourseTemplate(title)/*2.23*/{_display_(Seq[Any](format.raw/*2.24*/("""
"""),format.raw/*3.1*/("""<h1></h1>""")))}/*3.11*/{_display_(Seq[Any](format.raw/*3.12*/("""
"""),format.raw/*4.1*/("""<div class="rightBar col-md-7 col-md-offset">
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
        </span>

    <div>
    <button class="btn">
        بارگذاری پاسخ
    </button></div><br>
    <div>


    <span class="middle left">
        <button class="btn">
            ویرایش
        </button>
        <button class="btn">
            حذف
        </button>
    </span>
         <span>
            <button class="btn">
مشاهده پاسخ دانشجویان
    </button>
        </span>
    </div>
        </div>
    <button class="btn middle">
افزودن پروژه
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
object ProjectsEdit extends ProjectsEdit_Scope0.ProjectsEdit
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/CourseIndex/ProfView/ProjectsEdit.scala.html
                  HASH: 6157260e4f3ff55d82a187d4e4a67af37280ad29
                  MATRIX: 780->1|889->15|917->18|946->39|984->40|1012->42|1040->52|1078->53|1106->55
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|34->3|34->3|35->4
                  -- GENERATED --
              */
          