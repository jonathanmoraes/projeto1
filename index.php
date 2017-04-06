<!DOCTYPE HTML>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="initial-scale=1,maximum-scale=1,user-scalable=no">
<title>bucar local</title><link rel="stylesheet" href="https://js.arcgis.com/4.3/esri/css/main.css">
<script src="https://js.arcgis.com/4.3/"></script>

<style>html,
    body,
    #viewDiv {
      padding: 0;
      margin: 0;
      height: 80%;
      width: 80%;
    }</style><script>require([
      "esri/Map",
      "esri/views/SceneView",
      "esri/widgets/Home",
      "dojo/domReady!"
    ], 
	function(
      Map, SceneView, Home
    ) {
      var map = new Map({
        basemap: "streets",
        ground: "world-elevation"
      });
	
	
      var view = new SceneView({
	  //if(lat!=43 || longi!=53){
	    container: "viewDiv",
        map: map,
	    center: [$lat,$longi2],
        zoom: 3
		//}else{
		//container: "viewDiv",
       // map: map,
	   // center: [43,53],
       /// zoom: 3
		
		//}
      });

      var homeBtn = new Home({
	     
        view: view
		
      });

      // Add the home button to the top left corner of the view
      view.ui.add(homeBtn, "top-left");
    });
	
	</script>
	</head>
	<body>
	<div id="viewDiv">
	
	</div>
	<form action="index2.php" method="get">
			<input type="text" name="txt_text" id="label1" value="23" /><br/>
			<input type="text" name="txt_text2" id="label2" value="43"/><br/>
	        <input type="submit" name="enviar" value="enviar">
			</form>
	

	</body>
	</html>
	