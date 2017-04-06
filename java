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
    }</style>
	<script>
	
	 </script>
	<script >require([
      "esri/Map",
      "esri/views/SceneView",
      "esri/widgets/Home",
      "dojo/domReady!"
    ], 
	
	function valor(
      Map, SceneView, Home
    ) {
      var map = new Map({
        basemap: "streets",
        ground: "world-elevation"
      });
	 //function valor()
	 //{
	    var valor1 = document.form1.txt_text.value;
		var valor2 = document.form1.txt_text2.value;
		//var lat1 = parseInt(lat.value),
		//var longi1 = parseInt(longi.value),
	   //alert("voce digitou"+valor1);
	 
	 
	 //}
	
      var view = new SceneView({
	
	    container: "viewDiv",
        map: map,
	    center: [valor1,valor2],
        zoom: 3
		
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

		<form name="form1">
	
			<input type="number" name="txt_text" value="43" /><br/>
			<input type="number" name="txt_text2" value="53"/><br/>
	        <input type="button" name="button" value="enviar" onClick="valor()">
      </form>


	

	</body>
	</html>
