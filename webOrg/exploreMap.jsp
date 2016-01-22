<jsp:include page="header.jsp"/>

<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4 class="panel-title">Explore Map</h4>
        </div>

        <div id="neighborhoodSales" class="panel-body">
            <html>
                <head>
                    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
                    <script type="text/javascript">
                        google.load('visualization', '1.1', {packages: ['map']});
                        google.setOnLoadCallback(drawMap);

                        function drawMap () {
                            var data = new google.visualization.DataTable();
                            data.addColumn('string', 'Address');
                            data.addColumn('string', 'Location');
                            data.addColumn('string', 'Marker')

                            data.addRows([
                                ['10908 MARCOTT DR Parker CO, United States',        'Parker',      'green' ],
                                ['10906 MARCOTT DR Parker CO, United States',   'Castle Rock',      'green'],
                                ['10904 MARCOTT DR Parker CO, United States',
                                    '<a href="walkScore.html"><b>Explore Larkspur</b></a><br>' +
                                    '<b>City:</b> Larkspur<br>' +
                                    '<b>Sales in last 18 months:</b> 200<br>' +
                                    '<b>No. of Permits:</b> 400000<br>' +
                                    '<b>Residential:</b> 60000<br>' +
                                    '<b>Commercial:</b> 20000<br>' +
                                    '<b>Schools:</b> 5<br>' +
                                    '<b>Population:</b> 72,509<br>' +
                                    '<b>City:</b> Castle Pines North<br>' +
                                    '<b>City:</b> Castle Pines North<br>' +
                                    '<b>Population:</b> 200000<br>',
                                    'green' ],
                                ['10902 MARCOTT DR Parker CO, United States',  'Lone Tree',        'green'],
                                ['10717 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10715 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10713 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10709 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10911 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10725 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10722 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10720 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10714 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10710 MARCOTT ST Parker CO, United States',  'Lone Tree',        'green'],
                                ['10708 MARCOTT ST Parker CO, United States',  'Littleton',        'green'],
                                ['10704 MARCOTT ST Parker CO, United States',
                                    '<a href="walkScore.html"><b>Explore Castle Pines North</b></a><br>' +
                                    '<b>City:</b> Castle Pines North<br>' +
                                    '<b>Sales in last 18 months:</b> 5000<br>' +
                                    '<b>No. of Permits:</b> 5000000<br>' +
                                    '<b>Residential:</b> 200000<br>' +
                                    '<b>Commercial:</b> 650000<br>' +
                                    '<b>Schools:</b> 65<br>' +
                                    '<b>Population:</b> 267,509<br>' +
                                    '<b>City:</b> Castle Pines North<br>' +
                                    '<b>City:</b> Castle Pines North<br>' +
                                    '<b>Population:</b> 200000<br>',

                                    'blue' ]
                            ]);
                            var url = 'http://icons.iconarchive.com/icons/icons-land/vista-map-markers/48/';

                            var options = {
                                zoomLevel: 18,
                                showTip: true,
                                useMapTypeControl: true,
                                icons: {
                                    blue: {
                                        normal:   url + 'Map-Marker-Ball-Azure-icon.png',
                                        selected: url + 'Map-Marker-Ball-Right-Azure-icon.png'
                                    },
                                    green: {
                                        normal:   url + 'Map-Marker-Push-Pin-1-Chartreuse-icon.png',
                                        selected: url + 'Map-Marker-Push-Pin-1-Right-Chartreuse-icon.png'
                                    },
                                    pink: {
                                        normal:   url + 'Map-Marker-Ball-Pink-icon.png',
                                        selected: url + 'Map-Marker-Ball-Right-Pink-icon.png'
                                    }
                                }
                            };
                            var map = new google.visualization.Map(document.getElementById('map_div'));

                            map.draw(data, options);
                        }
                    </script>
                </head>
            <body>
            <div id="map_div" style="width: 100%; height: 700px"></div>
            </body>
            </html>

        </div>
    </div>
</div>
<jsp:include page="footer.jsp"/>