function getRootPath(){
	var curPath = location.href;   //	http://localhost:8088/SSM_1_JSON/index.jsp
	var pathName = location.pathname;   //	SSM_1_JSON/index.jsp
	var pos = curPath.indexOf(pathName);  
	var localhostPath = curPath.substring(0, pos);   //	http://localhost:8088/
	var projectName = pathName.substring(0, pathName.substr(1).indexOf("/")+1);  //  SSM_1_JSON
	return (localhostPath+projectName);    //	http://localhost:8088/SSM_1_JSON
}
//jquery
document.write('<script type="text/javascript" src="'+getRootPath()+'/js/jquery.min.js"></script>');
//bootstrap
document.write('<script type="text/javascript" src="'+getRootPath()+'/js/bootstrap.js"></script>');
document.write('<link rel="stylesheet" href="'+getRootPath()+'/css/bootstrap.css" type="text/css"></link>');
document.write('<link rel="stylesheet" href="'+getRootPath()+'/css/bootstrap-theme.css" type="text/css"></link>');

//cityPicker
document.write('<script type="text/javascript" src="'+getRootPath()+'/js/cityPicker-1.1.5.js"></script>');
document.write('<script type="text/javascript" src="'+getRootPath()+'/js/citydata.min.js"></script>');
document.write('<link rel="stylesheet" href="'+getRootPath()+'/css/city-picker.css" type="text/css"></link>');



