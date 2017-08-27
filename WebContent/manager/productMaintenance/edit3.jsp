<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>添加/编辑新类型</title>

<style type="text/css">
.divtype
{
	height:42px;
}
</style>
</head>

<body >
<div class="main-body-position">
<div class="mydiv-for-head2 thick">产品类型维护&gt;添加新类型</div>
<div class="container container-position"  style="padding-right: 124px;">
<div id="TabbedPanels1" class="TabbedPanels" width="97%">
  <ul class="TabbedPanelsTabGroup">
    <li class="TabbedPanelsTab" tabindex="0"><span class="basefont1">产品基本信息</span></li>
    <li class="TabbedPanelsTab" tabindex="0"><span class="basefont1">底层案例库</span></li>
    <li class="TabbedPanelsTab" tabindex="0"><span class="basefont1">编码案例库</span></li>
    <li class="TabbedPanelsTab" tabindex="0"><span class="basefont1">新造型库</span></li>
    <li class="TabbedPanelsTab" tabindex="0"><span class="basefont1">参数设置</span></li>
    <li class="TabbedPanelsTab" tabindex="0"><span class="basefont1">造型生成</span></li>
    <li class="TabbedPanelsTab" tabindex="0"><span class="basefont1">造型调整</span></li>
  </ul>
  <div class="TabbedPanelsContentGroup">
    <div class="TabbedPanelsContent">
      <form id="form1" name="form1" method="post" action="">
        <p>
          <label for="product_name"><span class="thick">产品名称</span></label>
          <input type="text" name="product_name" id="product_name" />
        </p>
        <p><span class="thick"> 产品图标</span> <a href="#">浏览上传</a>        </p>
        <table width="78%">
          <tr>
            <td width="9%" align="left" valign="top"><span class="topduiqi">
              <label for="product_introduction2" class="thick">产品介绍</label>
            </span></td>
            <td width="91%" align="left" valign="top"><span class="topduiqi">
              <textarea name="product_introduction1" cols="80" rows="15" class="introduction_position" id="product_introduction3"></textarea>
            </span></td>
          </tr>
        </table>
        <p class="topduiqi">&nbsp; </p>
        <p class="introduction_position"><span class="thick">产品降维词汇</span></p>
        <p class="introduction_position"><span class="blankfornew"><span class="TabbedPanelsContent">
          <label>词汇组织方式
<input type="submit" name="cihui" id="cihui" value="词汇" />
          </label>
          <label>
            <input type="submit" name="cidui" id="cidui" value="词对" />
          </label>
        </span></span></p>
        <p class="introduction_position">
          <label><span class="thick">算法选择</span>
<input type="submit" name="gaojiaobei_suanfa" id="gaojiaobei_suanfa" value="高脚杯算法" />
          </label>
          <input type="submit" name="youting_suanfa" id="youting_suanfa" value="游艇算法" />
          <input type="submit" name="zhiwu_suanfa" id="zhiwu_suanfa" value="织物算法" />
          <input type="submit" name="meiqizao_suanfa" id="meiqizao_suanfa" value="煤气灶算法" />
        </p>
        <p class="introduction_position">&nbsp;</p>
        <p class="juzhong_for_new">
          <input type="submit" name="save_new_product" id="save_new_product" value="保存" /> 
          <input type="reset" name="cancel" id="cancel" value="取消" />
        </p>
      </form>
    </div>
    <div class="TabbedPanelsContent">
      <form id="form2" name="form2" method="post" action="" class="siblings"> 
        <table width="80%">
          <tr>
            <td width="9%" class="topduiqi"><span class="thick">产品介绍</span></td>
            <td><textarea name="product_introduction2" id="product_introduction2" cols="80" rows="15"></textarea></td>
          </tr>
        </table>
        <p>&nbsp;</p>
        <div id="addtype">
          <div class="divtype" id="type1">
            <label for="type1" class="thick">类型1</label>
          <input name="type1" type="text" value="阔口型" size="10" />
</div>
        <div class="divtype" id="type2">
          <label for="type2" class="thick">类型2</label>
          <input name="type2" type="text" value="收口型" size="10" />
        </div>
        <div class="divtype">
          <label for="type3" class="thick">类型3</label>
          <input name="type3" type="text" id="type3" size="10" />
        </div>
        <div id="toHide">
        <div class="divtype"id="type4">
          <label for="type4" class="thick">类型4</label>
          <input name="type4" type="text"  size="10" />
        </div>
         <div class="divtype" id="type5">
          <label for="type5" class="thick">类型5</label>
          <input name="type5" type="text" size="10" />
        </div>
         <div class="divtype"id="type6" >
          <label for="type6" class="thick">类型6</label>
          <input name="type6" type="text" size="10" />
        </div>
         <div class="divtype"id="type7">
          <label for="type7" class="thick">类型7</label>
          <input name="type7" type="text"  size="10" />
        </div>
         <div class="divtype"id="type8">
          <label for="type8" class="thick">类型8</label>
          <input name="type8" type="text"  size="10" />
        </div>
        </div>
        <p><span class="thick"> <a href="javascript:void(0)" class="blue" id="add" >+添加新类型</a> </span></p>
        </div>
        <p class="blue">&nbsp;</p>
        <p class="juzhong_for_new">
          <input type="submit" name="save_new_product2" id="save_new_product2" value="保存" />
        <input type="reset" name="cancel2" id="cancel2" value="取消" />
      </p>
      </form>
    </div>
    <div class="TabbedPanelsContent">
      <form id="form3" name="form3" method="post" action="">
        <table width="80%" border="0">
          <tr>
            <td width="9%" class="topduiqi">产品介绍</td>
            <td><textarea name="product_introduction" id="product_introduction" cols="80" rows="15">  意象降维词汇库，是由基础意象语义库，通过问卷调查数理统计，降维得到针对高脚杯的具有意象代表性的词汇，以及该词汇统计后得出的权重。</textarea></td>
          </tr>
        </table>
        <p>&nbsp;</p>
        <p class="thick">轮廓编码</p>
        <table width="85%" border="0">
          <tr>
            <td width="20%">收口形轮廓编码</td>
            <td width="20%">外扩型轮廓编码</td>
            <td width="20%" class="juzhong_for_new">&nbsp;</td>
            <td width="20%">&nbsp;</td>
            <td>&nbsp;</td>
          </tr>
        </table>
        <p class="blue">+添加新类型</p>
        <p>&nbsp;</p>
        <p class="thick">部件编码</p>
        <table width="85%" border="0">
          <tr>
            <td width="20%" height="45">杯柄部件编码</td>
            <td width="20%">杯肚部件编码</td>
            <td width="20%">&nbsp;</td>
            <td width="20%">&nbsp;</td>
            <td width="20%">&nbsp;</td>
          </tr>
        </table>
        <p><span class="blue">+添加新类型</span></p>
        <p>&nbsp;</p>
        <p class="thick">色彩编码</p>
        <table width="85%" border="0">
          <tr>
            <td width="20%">暖色系编码</td>
            <td width="20%">冷色系编码</td>
            <td width="20%">&nbsp;</td>
            <td width="20%">&nbsp;</td>
            <td width="20%">&nbsp;</td>
          </tr>
        </table>
        <p><span class="blue">+添加新类型</span></p>
        <p>&nbsp;</p>
        <p class="thick">材质编码</p>
        <p><span class="blue">+添加新类型</span></p>
        <p>&nbsp;</p>
        <p class="juzhong_for_new">
          <input type="submit" name="save_new_product3" id="save_new_product3" value="保存" />
          <input type="reset" name="cancel3" id="cancel3" value="取消" />
        </p>
      </form>
    </div>
    <div class="TabbedPanelsContent">
      <form id="form4" name="form4" method="post" action="">
        <table width="80%" border="0">
          <tr>
            <td width="9%" class="topduiqi"><span class="thick">产品介绍</span></td>
            <td><textarea name="product_introduction4" id="product_introduction1" cols="80" rows="15"></textarea></td>
          </tr>
        </table>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p class="juzhong_for_new">
          <input type="submit" name="save_new_product4" id="save_new_product4" value="保存" />
          <input type="reset" name="cancel4" id="cancel4" value="取消" />
        </p>
      </form>
    </div>
    <div class="TabbedPanelsContent">
      <form id="form5" name="form5" method="post" action="">
        <table width="80%" border="0">
          <tr>
            <td width="9%" valign="top" class="thick"><span class="topduiqi">产品介绍</span></td>
            <td><textarea name="product_introduction5" id="product_introduction5" cols="80" rows="15"></textarea></td>
          </tr>
        </table>
        <p>&nbsp;</p>
        <p>
          <label for="questionarylink" class="thick">用户选择调查说明链接</label>
          <input type="text" name="questionarylink" id="questionarylink" />
        </p>
        <p>
          <label for="suanfa_link" class="thick">算法说明连接</label>
          <input type="text" name="suanfa_link" id="suanfa_link" />
        </p>
        <p>&nbsp; </p>
        <p class="juzhong_for_new">
          <input type="submit" name="save_new_product5" id="save_new_product5" value="保存" />
          <input type="reset" name="cancel5" id="cancel5" value="取消" />
        </p>
      </form>
    </div>
    <div class="TabbedPanelsContent">
      <form id="form6" name="form6" method="post" action="">
        <table width="80%" border="0">
          <tr>
            <td width="9%" class="topduiqi"><span class="thick">介绍</span></td>
            <td><textarea name="product_introduction6" id="product_introduction6" cols="80" rows="15"></textarea></td>
          </tr>
        </table>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p class="juzhong_for_new">
          <input type="submit" name="save_new_product6" id="save_new_product6" value="保存" />
          <input type="reset" name="cancel6" id="cancel6" value="取消" />
        </p>
      </form>
    </div>
    <div class="TabbedPanelsContent">
      <form id="form7" name="form7" method="post" action="">
        <table width="80%">
          <tr>
            <td width="9%" valign="top" class="VTabbedPanels"><span class="thick"><span class="topduiqi">产品介绍</span></span></td>
            <td><textarea name="product_introduction7" id="product_introduction7" cols="80" rows="15"></textarea></td>
          </tr>
        </table>
        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p class="juzhong_for_new">
          <input type="submit" name="save_new_product7" id="save_new_product7" value="保存" />
          <input type="reset" name="cancel7" id="cancel7" value="取消" />
        </p>
      </form>
    </div>
  </div>
</div>
</div>
<p>&nbsp;</p>

</div>
<script type="text/javascript">
var TabbedPanels1 = new Spry.Widget.TabbedPanels("TabbedPanels1");
</script>

<script>
//$("#toHide").fadeIn(0)
$("#type4").fadeOut(0);
$("#type5").fadeOut(0);
$("#type6").fadeOut(0);
$("#type7").fadeOut(0);
$("#type8").fadeOut(0);
var number="4";
$("#add").click(function(){
    $("#type"+number).fadeIn(0);	
	number=(number+1)%9;
});

</script>
</body>
</html>
    