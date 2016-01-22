<!DOCTYPE html>
<html ng-app="countryApp">

<jsp:include page="htmlHeadStuff.jsp"/>


<jsp:include page="header.jsp"/>

<body ng-controller="CountryCtrl">

<script>
    var countryApp = angular.module('countryApp', []);
    countryApp.controller('CountryCtrl', function ($scope, $http){
        $http.get('/apps/theAllNewAssessor/rservices/accountService/accounts/R0376407').success(function(data) {
            $scope.account = data;
        });
    });
</script>

<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#propertyDetails">Property Details</a>
            </h4>
        </div>

        <div id="propertyDetails" class="panel-body panel-collapse collapse in">
            <div class="row">
                <div class="col-sm-6">

                    <div class="data-display-block">
                        <div class="data-display-header-column">Account Number</div>
                        <div class="data-display-data-column">{{account.accountNo}}</div>
                        <div class="data-display-header-column">State Parcel Number</div>
                        <div class="data-display-data-column">{{account.parcelNo}}</div>
                        <div class="data-display-header-column">Tax District</div>
                        <div class="data-display-data-column">{{account.defaultTaxDistrict}}</div>
                        <div class="data-display-header-column">Subdivision Name</div>
                        <div class="data-display-data-column">{{account.appeal.sale.saleInventory.subdivision}}</div>
                        <div class="data-display-header-column">Reception No</div>
                        <div class="data-display-data-column"><a href="http://apps.douglas.co.us/apps/assessor/landmarkServlet?receptionNo=199362407">199362407</a></div>
                        <div class="data-display-header-column">Appraisal Year</div>
                        <div class="data-display-data-column">{{account.taxYear}}</div>
                        <div class="data-display-header-column">Account Type</div>
                        <div class="data-display-data-column">{{account.acctType}}</div>
                        <div class="data-display-header-column">Number of Buildings</div>
                        <div class="data-display-data-column">1</div>
                        <div class="data-display-header-column">Neighborhood-Ext</div>
                        <div class="data-display-data-column">116-C</div>
                        <div class="data-display-header-column">Location Description</div>
                        <div class="data-display-data-column">LOT 3 BLOCK 2 CLARKE FARMS #5B .25 AM/L</div>
                    </div>
                </div>

                <div class="col-sm-6">
                    <div class="data-display-block">
                        <div class="data-display-header-column">Owner Name</div>
                        <div class="data-display-data-column">
                            MANMOHAN DRONAMRAJU & SAHITHI VANAM
                        </div>
                        <div class="data-display-header-column">Mailing Address</div>
                        <div class="data-display-data-column">
                            13830 GLENCOE ST THORNTON, CO 80602-7835
                        </div>
                        <div class="data-display-header-column">Property Address</div>
                        <div class="data-display-data-column">10724 MARCOTT ST Parker CO 80134</div>
                        <div class="data-display-header-column">Total Actual Value</div>
                        <div class="data-display-data-column">$415,333</div>
                        <div class="data-display-header-column">Total Assessed Value</div>
                        <div class="data-display-data-column">$33,060</div>
                        <div class="data-display-header-column">Tax Rate</div>
                        <div class="data-display-data-column">9.8665%</div>
                        <div class="data-display-header-column">Appraisal Year</div>
                        <div class="data-display-data-column">2015</div>
                        <div class="data-display-header-column">Account Type</div>
                        <div class="data-display-data-column">Residential</div>
                    </div>
                </div>
            </div>

        </div>
    </div>

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#buildingDetails">Building Details</a>
            </h4>
        </div>

        <div id="buildingDetails" class="panel-body panel-collapse collapse">
            <div class="row">
                <div class="col-sm-6">
                    <div class="data-display-header-column">Building Class Code</div>
                    <div class="data-display-data-column">1213</div>
                    <div class="data-display-header-column">Building Type</div>
                    <div class="data-display-data-column">TOWNHOUSE IMPROVEMENT</div>
                    <div class="data-display-header-column">Tax District</div>
                    <div class="data-display-data-column">0803</div>
                    <div class="data-display-header-column">Subdivision Name</div>
                    <div class="data-display-data-column">CLARKE FARMS</div>
                    <div class="data-display-header-column">Reception No</div>
                    <div class="data-display-data-column"><a href="http://apps.douglas.co.us/apps/assessor/landmarkServlet?receptionNo=199362407">199362407</a></div>
                    <div class="data-display-header-column">Appraisal Year</div>
                    <div class="data-display-data-column">2015</div>
                    <div class="data-display-header-column">Account Type</div>
                    <div class="data-display-data-column">Residential</div>
                    <div class="data-display-header-column">Number of Buildings</div>
                    <div class="data-display-data-column">1</div>
                    <div class="data-display-header-column">Neighborhood-Ext</div>
                    <div class="data-display-data-column">116-C</div>
                    <div class="data-display-header-column">Location Description</div>
                    <div class="data-display-data-column">LOT 3 BLOCK 2 CLARKE FARMS #5B .25 AM/L</div>
                </div>

                <div class="col-sm-6">
                    <div class="data-display-header-column">Owner Name</div>
                    <div class="data-display-data-column">
                        MANMOHAN DRONAMRAJU & SAHITHI VANAM
                    </div>
                    <div class="data-display-header-column">Mailing Address</div>
                    <div class="data-display-data-column">
                        13830 GLENCOE ST THORNTON, CO 80602-7835
                    </div>
                    <div class="data-display-header-column">Property Address</div>
                    <div class="data-display-data-column">10724 MARCOTT ST Parker CO 80134</div>
                    <div class="data-display-header-column">Total Actual Value</div>
                    <div class="data-display-data-column">$415,333</div>
                    <div class="data-display-header-column">Total Assessed Value</div>
                    <div class="data-display-data-column">$33,060</div>
                    <div class="data-display-header-column">Tax Rate</div>
                    <div class="data-display-data-column">9.8665%</div>
                    <div class="data-display-header-column">Appraisal Year</div>
                    <div class="data-display-data-column">2015</div>
                    <div class="data-display-header-column">Account Type</div>
                    <div class="data-display-data-column">Residential</div>

                </div>
            </div>

        </div>
    </div>

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#neighborhoodSales">Neighborhood Sales</a>
            </h4>
        </div>

        <div id="neighborhoodSales" class="panel-body panel-collapse collapse">


        </div>
    </div>

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#historicalValues">Historical Values</a>
            </h4>
        </div>

        <div id="historicalValues" class="panel-body panel-collapse collapse">


        </div>
    </div>

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#taxDistrictDetails">Tax District Details</a>
            </h4>
        </div>

        <div id="taxDistrictDetails" class="panel-body panel-collapse collapse">


        </div>
    </div>

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#generateNotices">Generate Notices</a>
            </h4>
        </div>

        <div id="generateNotices" class="panel-body panel-collapse collapse">


        </div>
    </div>
</div>

<jsp:include page="footer.jsp"/>

</body>
</html>