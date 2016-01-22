var cities = [
    {
        city : '2',
        desc : 'Info of 2',
        lat : 39.520973,
        long : -104.785743
    },
    {
        city : '3',
        desc : 'Info of 3',
        lat : 39.372794,
        long : -104.860595
    },
    {
        city : '4',
        desc : 'Info of 4',
        lat : 39.518600,
        long : -104.761363
    }
];

App.controller('MapCtrl', function ($scope) {

    var mapOptions = {
        zoom: 8,
        center: new google.maps.LatLng(39.3761,-104.8535)
    }

    $scope.map = new google.maps.Map(document.getElementById('map'), mapOptions);

    $scope.markers = [];

    var infoWindow = new google.maps.InfoWindow();

    var createMarker = function (info){

        var marker = new google.maps.Marker({
            map: $scope.map,
            position: new google.maps.LatLng(info.lat, info.long),
            title: info.city
        });
        marker.content = '<div class="infoWindowContent">' + info.desc + '</div>';

        google.maps.event.addListener(marker, 'click', function(){
            infoWindow.setContent('<h2>' + marker.title + '</h2>' + marker.content);
            infoWindow.open($scope.map, marker);
        });

        $scope.markers.push(marker);

    }

    for (i = 0; i < cities.length; i++){
        createMarker(cities[i]);
    }

    $scope.openInfoWindow = function(e, selectedMarker){
        e.preventDefault();
        google.maps.event.trigger(selectedMarker, 'click');
    }

});