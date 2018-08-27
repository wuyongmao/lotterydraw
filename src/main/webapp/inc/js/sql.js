var USERNO="";
  //初始化 数据库 
	 function initDatabase()
	  {
		  var db = getCurrentDb();//初始化数据库
	      if(!db) {alert("您的浏览器不支持HTML5本地数据库");return;}
	      db.transaction(function (trans) {//启动一个事务，并设置回调函数
	          //执行创建表的Sql脚本
	          trans.executeSql("create table if not exists Scan(position text null,user text null,code text null,ucom text null,ubgnm text null,udeptnm text null,uareanm text null,uspecif text null,udate text null,mark text null )", [], function (trans, result) {
	          }, function (trans, message) {//消息的回调函数alert(message);});
	      }, function (trans, result) {
	      }, function (trans, message) {
	      });
	      });
	  }
	  function getCurrentDb() {
	      //打开数据库，或者直接连接数据库参数：数据库名称，版本，概述，大小
	      //如果数据库不存在那么创建之
	      var db = openDatabase("myDb", "1.0", "it's to save demo data!", 1024 * 1024*5); 
	      return db;
	  }
	  //显示所有数据库中的数据到页面上去
	  function showAllTheData(sqlstr,arry,seachCallBackf) {
	     // $("#tblData").empty();
	     var strdata="";
	      var db = getCurrentDb();
	      db.transaction(function (trans) {
	          trans.executeSql(sqlstr, arry, seachCallBackf, function (ts, message) {alert(message);var tst = message;});
	      });
	  }
	  //获取资料的笔数 明明就上面的一样
	  function countData(sqlstr,arry,countCallBackf)
	  {
		  var db = getCurrentDb();
	      db.transaction(function (trans) {
	          trans.executeSql(sqlstr, arry, countCallBackf, function (ts, message) {alert(message);var tst = message;});
	      });
	  }
	  //修改资料 
	  function upCacheData()
	  {
		  var db = getCurrentDb();
	      db.transaction(function (trans) {
	          trans.executeSql("update Scan set mark='Y' where code=? ", ['ok','小花'], function (ts, data) {
	              if (data) {
	                  for (var i = 0; i < data.rows.length; i++) {
	                	  elart("提交成功");//获取某行数据的json对象
	                  }
	              }
	          }, function (ts, message) {alert(message);var tst = message;});
	      });
	  }
	  function insertData(parms)
	  {
		  var db = getCurrentDb();
          //执行sql脚本，插入数据
          db.transaction(function (trans) {
              trans.executeSql("insert into Scan(position,user,code,ucom,ubgnm,udeptnm,uareanm,uspecif,udate,mark) values(?,?,?,?,?,?,?,?,?,?) ", parms, function (ts, data) {
            	     if(data)
            	    	 {
            	    	 
            	    	 }
              }, function (ts, message) {
                  alert(message);
              });
          });  
      }
	
