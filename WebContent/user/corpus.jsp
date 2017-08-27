<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../css/corpus.css" rel="stylesheet" type="text/css" />
<link href="../css/loginDialog.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="../js/jquery-1.8.2.min.js"></script>
<title>意象映射-语义库11</title>

<script type="text/javascript">
	$("#dimensionContent").fadeOut(0);
	$("#qestionContent").fadeOut(0);
	$("#baseToggle").click(function() {
		$("#baseContent").fadeToggle(0);
	});
	$("#dimensionToggle").click(function() {
		$("#dimensionContent").fadeToggle(0);
	});
	$("#qestionToggle").click(function() {
		$("#qestionContent").fadeToggle(0);
	});
</script>
<script type="text/javascript">
	//$("#theInitial").fadeOut(0);
	$("#detail").fadeOut(0);

	$("#theType").fadeOut(0);
	$("#theGoblet").fadeOut(0);
	$("#theYacht").fadeOut(0);
	$("#theHanky").fadeOut(0);
	$("#theRange").fadeOut(0);
	$("#theGoblet2").fadeOut(0);
	$("#theYacht2").fadeOut(0);
	$("#theHanky2").fadeOut(0);
	$("#theRange2").fadeOut(0);
	
	
	$("#register").fadeOut(0);
	
	var now = "theInitial";
	var nowLeft = "byInitial";
	$("#byInitial").css("color", "blue");

	$("#byInitial").click(function() {
		if (now != "theInitial") {
			$("#" + now).fadeOut(0);
			$("#theInitial").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theInitial";
			nowLeft = "byInitial";
			$("#byInitial").css("color", "blue");
		}
	});

	$("#showA1").click(function() {
		$("#theInitial").fadeOut(0);
		$("#detail").fadeIn(0);
		now = "detail";
	})

	$("#byType").click(function() {
		if (now != "theType") {
			$("#" + now).fadeOut(0);
			$("#theType").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theType";
			nowLeft = "byType";
			$("#byType").css("color", "blue");
		}
	});
	$("#goblet").click(function() {
		if (now != "theGoblet") {
			$("#" + now).fadeOut(0);
			$("#theGoblet").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theGoblet";
			nowLeft = "goblet";
			$("#goblet").css("color", "blue");
		}
	});
	$("#yacht").click(function() {
		if (now != "theYacht") {
			$("#" + now).fadeOut(0);
			$("#theYacht").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theYacht";
			nowLeft = "yacht";
			$("#yacht").css("color", "blue");
		}
	});
	$("#hanky").click(function() {
		if (now != "theHanky") {
			$("#" + now).fadeOut(0);
			$("#theHanky").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theHanky";
			nowLeft = "hanky";
			$("#hanky").css("color", "blue");
		}
	});
	$("#range").click(function() {
		if (now != "theRange") {
			$("#" + now).fadeOut(0);
			$("#theRange").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theRange";
			nowLeft = "range";
			$("#range").css("color", "blue");
		}
	});
	$("#goblet2").click(function() {
		if (now != "theGoblet2") {
			$("#" + now).fadeOut(0);
			$("#theGoblet2").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theGoblet2";
			nowLeft = "goblet2";
			$("#goblet2").css("color", "blue");
		}
	});
	$("#yacht2").click(function() {
		if (now != "theYacht2") {
			$("#" + now).fadeOut(0);
			$("#theYacht2").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theYacht2";
			nowLeft = "yacht2";
			$("#yacht2").css("color", "blue");
		}
	});
	$("#hanky2").click(function() {
		if (now != "theHanky2") {
			$("#" + now).fadeOut(0);
			$("#theHanky2").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theHanky2";
			nowLeft = "hanky2";
			$("#hanky2").css("color", "blue");
		}
	});
	$("#range2").click(function() {
		if (now != "theRange2") {
			$("#" + now).fadeOut(0);
			$("#theRange2").fadeIn(0);
			$("#" + nowLeft).css("color", "black");
			now = "theRange2";
			nowLeft = "range2";
			$("#range2").css("color", "blue");
		}
	});
</script>
<script type="text/javascript">
	function loginCheck() {
		var account = document.getElementById("account");
		var password = document.getElementById("password");
		if (account.value == "") {
			alert("请输入账号");
			return false;
		} else if (password.value == "") {
			alert("请输入密码");
			return false;
		}
	}
</script>
<script type="text/javascript">



	$(function($) {
		//弹出登录
		$("#loginBtn").hover(function() {
			$(this).stop().animate({
				opacity : '1'
			}, 600);
		}, function() {
			$(this).stop().animate({
				opacity : '0.6'
			}, 1000);
		}).on('click', function() {
			$("body").append("<div id='mask'></div>");
			$("#mask").addClass("mask").fadeIn("slow");
			$("#LoginBox").fadeIn("slow");
		});
		//
		//按钮的透明度
		$("#loginbtn").hover(function() {
			$(this).stop().animate({
				opacity : '1'
			}, 600);
		}, function() {
			$(this).stop().animate({
				opacity : '0.8'
			}, 1000);
		});
		//关闭
		$(".close_btn").hover(function() {
			$(this).css({
				color : 'black'
			})
		}, function() {
			$(this).css({
				color : '#51A3BB'
			})
		}).on('click', function() {
			$("#LoginBox").fadeOut("fast");
			$("#mask").css({
				display : 'none'
			});
		});
	});
</script>
<script type="text/javascript">
	function registerCheck() {
		var newAccount = document.getElementById("newAccount");
		var newPassword = document.getElementById("newPassword");
		if (newAccount.value == "") {
			alert("请输入账号");
			return false;
		} else if (newPassword.value == "") {
			alert("请输入密码");
			return false;
		}
	}
</script>
<script type="text/javascript">
	$(function($) {
		//弹出注册
		$("#registerBtn").hover(function() {
			$(this).stop().animate({
				opacity : '1'
			}, 600);
		}, function() {
			$(this).stop().animate({
				opacity : '0.6'
			}, 1000);
		}).on('click', function() {
			$("body").append("<div id='mask'></div>");
			$("#mask").addClass("mask").fadeIn("slow");
			$("#RegisterBox").fadeIn("slow");
		});
		//
		//按钮的透明度
		$("#registerbtn").hover(function() {
			$(this).stop().animate({
				opacity : '1'
			}, 600);
		}, function() {
			$(this).stop().animate({
				opacity : '0.8'
			}, 1000);
		});
		//关闭
		$(".close_btn").hover(function() {
			$(this).css({
				color : 'black'
			})
		}, function() {
			$(this).css({
				color : '#51A3BB'
			})
		}).on('click', function() {
			$("#RegisterBox").fadeOut("fast");
			$("#mask").css({
				display : 'none'
			});
		});
	});
</script>
</head>
<body>
	<div id="header">
		<div id="logo">
			<img src="../images/vocabularys/generate/homeLogo.png" />
		</div>
		<div id="navigation">
			<ul>
				<li><a href="../index.html"><img
						src="../images/vocabularys/generate/navigationHome.png"></a></li>
				<li><a><img
						src="../images/vocabularys/generate/navigationCorpus.png"></a></li>
				<li><a href="facade.html"><img
						src="../images/vocabularys/generate/navigationFacade.png"></a></li>
				<li><a href="imago.html"><img
						src="../images/vocabularys/generate/navigationImago.png"></a></li>
			</ul>
		</div>
		<div id="rightHead">
			<div id="operator">
				<div id="login">
					<a href="javascript:void(0)" id="loginBtn"><img
						src="../images/vocabularys/generate/login.png"></a>${name}
				</div>
				
				
				<div id="username">
					欢迎您，  ${account }${status }
				</div>
				
				
				
				<div id="register">
					<a href="javascript:void(0)" id="registerBtn"><img
						src="../images/vocabularys/generate/register.png"></a>
				</div>
			</div>
			<div id="search">
				<img src="../images/vocabularys/generate/search.png">
			</div>
		</div>
	</div>
	<div id="content">
		<div id="leftBody">
			<div id="base">
				<a href="javascript:void(0)" id="baseToggle">基础意象语义库</a>
				<ul id="baseContent">
					<li><a href="javascript:void(0)" id="byInitial">首字母分类</a></li>
					<li><a href="javascript:void(0)" id="byType">词汇类型分类</a></li>
				</ul>
			</div>
			<div id="dimension">
				<a href="javascript:void(0)" id="dimensionToggle">降维词汇库</a>
				<ul id="dimensionContent">
					<li><a href="javascript:void(0)" id="goblet">高脚杯</a></li>
					<li><a href="javascript:void(0)" id="yacht">游艇</a></li>
					<li><a href="javascript:void(0)" id="hanky">织物</a></li>
					<li><a href="javascript:void(0)" id="range">燃气灶</a></li>
				</ul>
			</div>
			<div id="qestion">
				<a href="javascript:void(0)" id="qestionToggle">问卷调查与检验</a>
				<ul id="qestionContent">
					<li><a href="javascript:void(0)" id="goblet2">高脚杯</a></li>
					<li><a href="javascript:void(0)" id="yacht2">游艇</a></li>
					<li><a href="javascript:void(0)" id="hanky2">织物</a></li>
					<li><a href="javascript:void(0)" id="range2">燃气灶</a></li>
				</ul>
			</div>
		</div>
		<div id="rightBody">
			<div id="theInitial">
				<div class="introduce">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					基础意象词汇库收集各类用户表达产品外观造型感受的词汇。词汇来源分为两类，一类从已有的文献中收集而来，
					另一类来源于市场反馈、调查对象自由表达、开发者要求。</div>
				<div id="initialBlock">
					<div class="name">A</div>
					<div class="value">
						<a href="javascript:void(0)" id="showA1"><img
							src="../images/vocabularys/YixiangVocabularys-basicorga/a1.png" /></a>
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/a2.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/a3.png" />
					</div>
					<div class="name">C</div>
					<div class="value">
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c1.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c2.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c3.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c4.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c5.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c6.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c7.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c8.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c9.png" />
						<img
							src="../images/vocabularys/YixiangVocabularys-basicorga/c10.png" />
					</div>
				</div>
			</div>
			<div id="detail">
				<div id="word">安宁</div>
				<div id="interpretation">
					<div class="title">基本释义</div>
					<div class="value">
						1.秩序正常，没有骚扰；<br> 2.心情安定、平静。
					</div>
				</div>
				<div id="interpretation2">
					<div class="title">详细释义</div>
					<div class="value">
						1.安定，太平。<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;《诗经 小雅
						常棣》：“丧乱既平，既安且宁。” 《庄子 天下》：“愿天下之安宁，以活民命。” 汉 枚乘《七发》：“今时天下安宁，四宇和平。” 唐
						韩愈《举韩泰自代状》：“官吏惩惧，不敢为非，百姓安宁，并得其所。” 明
						黄元吉《流星马》第四折：“文官每按四时调和鼎鼐，武将每定八方威震华夏，则愿得千千年社稷安宁。”
						阮章竞《送别》：“不把狗们杀干净，千代万代都不安宁。”<br> <br> 2.康宁，安康。<br>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;唐 白居易 《蜀路石妇》：“其夫有父母，老病不安宁。”
						《再生缘》第二一回：“合府相逢多欢悦，圣躬痊愈免耽惊……且说内宫皇太后，圣躬自此渐安宁。”
						柳子戏《孙安动本》第四场：“品级台前三叩首，臣问万岁驾安宁。”<br> <br>
						3.谓心情、环境、气氛安定平静。<br> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;魏
						曹植《弃妇诗》：“招摇待霜露，何必春夏成。晚获为良实，愿君且安宁。” 巴金《里昂》：“我必须把心里的话写出来，才能够得到安宁。”
						萧红《手》：“因为星期日的早晨，全个学校出现在特有的安宁里。”
					</div>
				</div>
				<div id="near">
					<div class="title">近义词</div>
					<div class="value">
						<span>悠闲</span> <span>安定</span> <span>安适</span> <span>安好</span> <span>安详</span>
						<span>清静</span> <span>安逸</span> <span>稳重</span> <span>安详</span> <span>平和</span>
						<span>和缓</span> <span>安闲</span> <span>平宁</span> <span>平安</span> <span>宁静</span>
						<span>安全</span> <span>安静</span> <span>安清</span> <span>镇静</span> <span>幽静</span>
						<span>静谧</span> <span>稳定</span> <span>清闲</span> <span>平静</span> <span>承平</span>
						<span>安乐</span> <span>安谧</span> <span>从容</span> <span>自在</span> <span>舒适</span>
						<span>太平</span> <span>寂静</span> <span>冷静</span> <span>和平</span> <span>安稳</span>
						<span>安然</span>
					</div>
				</div>
				<div id="different">
					<div class="title">反义词</div>
					<div class="value">
						<span>混乱</span> <span>纷乱</span> <span>烦躁</span> <span>烦恼</span> <span>动乱</span>
						<span>骚扰</span> <span>烦扰</span> <span>动荡</span> <span>烦闷</span> <span>纷扰</span>
					</div>
				</div>
			</div>
			<div id="theType">词汇类型分类</div>
			<div id="theGoblet">
				<div class="title">
					<img
						src="../images/vocabularys/dedimensioin-vocabularys/gaojiaobei_03.png" />
					<div class="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						意象降维词汇库，是由基础意象词汇库，通过问卷调查数理统计，降维得到针对高脚杯的具有代表性的词汇，以及该词汇统计后得出的权重。</div>
				</div>
				<div class="value">
					<img src="../images/vocabularys/dedimensioin-vocabularys/w1.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w2.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w3.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w4.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w5.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w6.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w7.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w8.png" />
				</div>
			</div>
			<div id="theYacht">
				<div class="title">
					<img
						src="../images/vocabularys/dedimensioin-vocabularys/houseboat_03.png" />
					<div class="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						意象降维词汇库，是由基础意象词汇库，通过问卷调查数理统计，降维得到针对游艇的具有代表性的词汇，以及该词汇统计后得出的权重。</div>
				</div>
				<div class="value">
					<img src="../images/vocabularys/dedimensioin-vocabularys/w1.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w2.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w5.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w6.png" />
				</div>
			</div>
			<div id="theHanky">
				<div class="title">
					<img
						src="../images/vocabularys/dedimensioin-vocabularys/fabric_03.png" />
					<div class="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						意象降维词汇库，是由基础意象词汇库，通过问卷调查数理统计，降维得到针对织物的具有代表性的词汇，以及该词汇统计后得出的权重。</div>
				</div>
				<div class="value">
					<img src="../images/vocabularys/dedimensioin-vocabularys/w1.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w2.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w5.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w6.png" />
				</div>
			</div>
			<div id="theRange">
				<div class="title">
					<img
						src="../images/vocabularys/dedimensioin-vocabularys/gas-stove_03.png" />
					<div class="right">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						意象降维词汇库，是由基础意象词汇库，通过问卷调查数理统计，降维得到针对燃气灶的具有代表性的词汇，以及该词汇统计后得出的权重。</div>
				</div>
				<div class="value">
					<img src="../images/vocabularys/dedimensioin-vocabularys/w1.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w2.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w5.png" />
					<img src="../images/vocabularys/dedimensioin-vocabularys/w6.png" />
				</div>
			</div>
			<div id="theGoblet2">
				<div class="title">
					<img
						src="../images/vocabularys/dedimensioin-vocabularys/gaojiaobei_03.png" />
					<div class="right">
						问卷调查包括意象词汇降维调查和意象造型关联调查两部分。<br> <br>
						（1）意象词汇降维调查问卷。针对不同产品类型进行意象降维词汇的选择。根据需求调查问卷中包括对
						被调查对象特征设定，调查产品的基本介绍，以及选择词汇的基本规则。<br>
						（2）意象造型关联调查问卷。根据需求，调查问卷中包括对被被调查对象特征限定，调查产品的基本介绍。 以及选择判断的基本规则。
					</div>
				</div>
				<div class="value">
					<img src="../images/vocabularys/semantic-dimension-survey/j1.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j2.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j3.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j4.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j5.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j6.png" />
				</div>
			</div>
			<div id="theYacht2">
				<div class="title">
					<img
						src="../images/vocabularys/dedimensioin-vocabularys/houseboat_03.png" />
					<div class="right">
						问卷调查包括意象词汇降维调查和意象造型关联调查两部分。<br> <br>
						（1）意象词汇降维调查问卷。针对不同产品类型进行意象降维词汇的选择。根据需求调查问卷中包括对
						被调查对象特征设定，调查产品的基本介绍，以及选择词汇的基本规则。<br>
						（2）意象造型关联调查问卷。根据需求，调查问卷中包括对被被调查对象特征限定，调查产品的基本介绍。 以及选择判断的基本规则。
					</div>
				</div>
				<div class="value">
					<img src="../images/vocabularys/semantic-dimension-survey/j1.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j2.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j3.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j4.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j5.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j6.png" />
				</div>
			</div>
			<div id="theHanky2">
				<div class="title">
					<img
						src="../images/vocabularys/dedimensioin-vocabularys/fabric_03.png" />
					<div class="right">
						问卷调查包括意象词汇降维调查和意象造型关联调查两部分。<br> <br>
						（1）意象词汇降维调查问卷。针对不同产品类型进行意象降维词汇的选择。根据需求调查问卷中包括对
						被调查对象特征设定，调查产品的基本介绍，以及选择词汇的基本规则。<br>
						（2）意象造型关联调查问卷。根据需求，调查问卷中包括对被被调查对象特征限定，调查产品的基本介绍。 以及选择判断的基本规则。
					</div>
				</div>
				<div class="value">
					<img src="../images/vocabularys/semantic-dimension-survey/j1.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j2.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j3.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j4.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j5.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j6.png" />
				</div>
			</div>
			<div id="theRange2">
				<div class="title">
					<img
						src="../images/vocabularys/dedimensioin-vocabularys/gas-stove_03.png" />
					<div class="right">
						问卷调查包括意象词汇降维调查和意象造型关联调查两部分。<br> <br>
						（1）意象词汇降维调查问卷。针对不同产品类型进行意象降维词汇的选择。根据需求调查问卷中包括对
						被调查对象特征设定，调查产品的基本介绍，以及选择词汇的基本规则。<br>
						（2）意象造型关联调查问卷。根据需求，调查问卷中包括对被被调查对象特征限定，调查产品的基本介绍。 以及选择判断的基本规则。
					</div>
				</div>
				<div class="value">
					<img src="../images/vocabularys/semantic-dimension-survey/j1.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j2.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j3.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j4.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j5.png" />
					<img src="../images/vocabularys/semantic-dimension-survey/j6.png" />
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="upFooter">
			<div id="concernUs">
				<p>关注我们</p>
				<ul id="concernUsContent">
					<li><a href="javascript:void(0)">关于意象</a></li>
					<li><a href="javascript:void(0)">意象新闻</a></li>
					<li><a href="javascript:void(0)">意象QQ群：123456</a></li>
					<li><a href="javascript:void(0)">意象微信：yixiangyingshe_1</a></li>
				</ul>
			</div>
			<div id="tuochUs">
				<p>联系我们</p>
				<ul id="tuochUsContent">
					<li>有任何想法请联系我们。</li>
					<li>中国浙江省杭州市西湖区</li>
					<li>中国美院象山校区18号楼115室</li>
					<li>057187200225</li>
					<li>aliu6@126.com</li>
				</ul>
			</div>
			<div id="quickLink">
				<p>快速链接</p>
				<ul id="quickLinkContent">
					<li><a href="javascript:void(0)">中国美院大学生科技园</a></li>
					<li><a href="javascript:void(0)">中国美术学院</a></li>
					<li><a href="javascript:void(0)">中国美院设计学院</a></li>
					<li><a href="javascript:void(0)">知识工程师入口</a></li>
				</ul>
			</div>
		</div>
		<hr>
		<div id="downFooter">COPYRIGHT 2016 YIXIANGYINGSHE ALL RIGHTS
			RESERVED</div>
	</div>
	<div id="LoginBox">
		<form action="customerLogin.do" method="post"
			onSubmit="return loginCheck()" on>
			<div class="rowTitle">
				意象造型映射<a href="javascript:void(0)" title="关闭窗口" class="close_btn"
					id="closeBtn">×</a>
			</div>
			<div class="row">
				<span>账号</span> <br>
				<div class="inputBox">
					<input type="text" class="txt" id="account" name="account"
						placeholder="账号" />
				</div>
			</div>
			<div class="row">
				<span>密码</span><br>
				<div class="inputBox">
					<input type="password" class="txt" id="password" name="password"
						placeholder="密码" />
				</div>
			</div>
			<div class="row">
				<button type="submit" id="loginbtn">登录</button>
			</div>
		</form>
		<div id="loginHint">
			还没有账号？<a href="javascript:void(0)" id="turnToRegister">注册</a>
		</div>
		<script type="text/javascript">
			$("#turnToRegister").on('click', function() {
				$("#LoginBox").fadeOut(0);
				$("#RegisterBox").fadeIn(0);
			})
		</script>
	</div>
	<div id="RegisterBox">
		<form action="customerRegister.do" method="post"
			onSubmit="return registerCheck()">
			<div class="rowTitle">
				意象造型映射<a href="javascript:void(0)" title="关闭窗口" class="close_btn"
					id="closeBtn">×</a>
			</div>
			<div class="row">
				<span>账号</span> <br>
				<div class="inputBox">
					<input type="text" class="txt" id="newAccount" name="newAccount"
						placeholder="账号" />
				</div>
			</div>
			<div class="row">
				<span>密码</span><br>
				<div class="inputBox">
					<input type="password" class="txt" id="newPassword"
						name="newPassword" placeholder="密码" />
				</div>
			</div>
			<div class="row">
				<button type="submit" id="registerbtn">注册</button>
			</div>
		</form>
		<div id="registerHint">
			注册成功，请<a href="javascript:void(0)" id="turnToLogin">登录</a>
		</div>
		<script type="text/javascript">
			$("#turnToLogin").on('click', function() {
				$("#RegisterBox").fadeOut(0);
				$("#LoginBox").fadeIn(0);
			})
		</script>
	</div>


</body>
</html>