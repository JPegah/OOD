
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object Courses_Scope0 {
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

class Courses extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),_display_(/*3.2*/BaseUser(title)/*3.17*/{_display_(Seq[Any](format.raw/*3.18*/("""


"""),format.raw/*6.1*/("""<div class="main">
    <div class="leftBar col-md-2">

    </div>
</div>

<div class="rightBar col-md-7 col-md-offset">
    <div>
        <button class="btn btn-default">
            جست و جو
        </button>
        <span class="dropdown">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
      استاد
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
        <span class="dropdown">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
      نام درس
      <span class="caret"></span>
  </button>
  <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
      <li><a href="#">
          سال تحصیلی
      </a></li>
      <li>

      </li>
      <li><a href="#">

      </a></li>
      <li role="separator" class="divider"></li>
      <li><a href="#">Separated link</a></li>
  </ul>


</span>
        <span class="dropdown">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
      دانشکده ارائه دهند
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

        <span class="dropdown">
  <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
      نبمسال تحصیلی
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
        <input type="checkbox">
    </div>
    <div class="courseList">
        <div class="course">
            <span class="col-md-9">
                <div>
                    نیمسال دوم 92-93
                </div>
                <div>
                    دانشکده مهندسی کامپیوتر
                </div>

            </span>
            <span class="col-md-3">
                <div><a href="CourseIndex/courseIndex.html">
                    طراحی شئ گرای سیستم ها
                </a></div>

            </span>
            <span>
                <p>
                    مدرس: دکتر رامسین
                </p>
            </span>
        </div>
        <div class="course">
            <span class="col-md-9">
                <div>
                    نیمسال دوم 92-93
                </div>
                <div>
                    دانشکده مهندسی کامپیوتر
                </div>

            </span>
            <span class="col-md-3">
                <div><a href="CourseIndex/courseIndex.html">
                    طراحی شئ گرای سیستم ها
                </a></div>

            </span>
            <span>
                <p>
                    مدرس: دکتر رامسین
                </p>
            </span>
        </div>
        <div class="course">
            <span class="col-md-9">
                <div>
                    نیمسال دوم 92-93
                </div>
                <div>
                    دانشکده مهندسی کامپیوتر
                </div>

            </span>
            <span class="col-md-3">
                <div><a href="CourseIndex/courseIndex.html">
                    طراحی شئ گرای سیستم ها
                </a></div>

            </span>
            <span>
                <p>
                    مدرس: دکتر رامسین
                </p>
            </span>
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
object Courses extends Courses_Scope0.Courses
              /*
                  -- GENERATED --
                  DATE: Mon Mar 07 15:02:38 IRST 2016
                  SOURCE: /home/mbm/university/OOD/OOD-phase5/OOD/app/views/Courses.scala.html
                  HASH: 0c8fe00cd741850e7799a2918188f385b314a063
                  MATRIX: 749->1|859->16|889->21|912->36|950->37|982->43
                  LINES: 27->1|32->1|34->3|34->3|34->3|37->6
                  -- GENERATED --
              */
          