function initMap() {
    var coor= {lat: -12.057292115358852, lng: -77.06282571595808}
      map = new google.maps.Map(document.getElementById("map"), {
        zoom: 15,
        center: coor,
      });
    
      var marker = new google.maps.Marker({
          position: coor,
          map: map
        });
    }