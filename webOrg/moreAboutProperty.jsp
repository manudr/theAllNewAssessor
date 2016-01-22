<%--
  Created by IntelliJ IDEA.
  User: mdronamr
  Date: 12/29/15
  Time: 9:39 AM
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<html ng-app="countryApp">

<jsp:include page="htmlHeadStuff.jsp"/>


<jsp:include page="header.jsp"/>

<body>

<div class="container">
    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion" href="#propertyDetails">Property Details</a>
            </h4>
        </div>

        <div id="propertyDetails" class="panel-body panel-collapse collapse in">
            <div id="zillow-large-search-box-widget-container" style="width:100%;overflow:hidden;background-color:#e7f1fd;color:#555; font: normal normal normal 13px verdana,arial,sans-serif;line-height:13px;margin:0 auto;padding:0;text-align:center;border:1px solid #adcfff;letter-spacing:0;text-transform:none;"><h2 style="color:#d61;text-align:left;font-size:20px;line-height:20px;font-weight:normal;float:left;width:100%;margin-left:10px;margin-top:5px;letter-spacing:0;text-transform:none;">Find Homes</h2><div style="float:right;"><a href="http://www.zillow.com/" target="_blank"><img style="border:0;" src="http://www.zillow.com/widgets/GetVersionedResource.htm?path=/static/images/powered-by-zillow.gif" alt="Zillow Real Estate Information"/></a></div><iframe scrolling="no" src="http://www.zillow.com/widgets/search/LargeSearchBoxWidget.htm?did=zillow-large-search-box-iframe-widget&type=iframe&rgname=Seattle+WA&shvi=yes" width="100%" frameborder="0" height="100%"></iframe><table id="zillow-tnc-widget-footer-links" width="100%" style="font: normal normal normal 10px verdana,arial,sans-serif;text-align:left;line-height:12px;margin:10px 5px;padding:0;border-spacing:0;border-collapse:collapse;"><tbody style="margin:0;padding:0;"><tr style="margin:0;padding:0;"><td style="font-weight:bold;font-size:10px;color:#555;text-align:left;margin:0;padding:0;">QUICK LINKS:</td></tr><tr style="margin:0;padding:0;"><td style="margin:0;padding:0;"><span id="widgetFooterLink" class="regionBasedLink"><a href="http://www.zillow.com/seattle-wa/" target="_blank" style="color:#36b;font-family:verdana,arial,sans-serif;font-size:10px;margin:0 5px 0 0;padding:0;text-decoration:none;"><span class="region">Seattle</span> Real Estate Listing</a></span></td><td style="margin:0;padding:0;"><span id="widgetFooterLink"><a href="http://www.zillow.com/mortgage-rates/" target="_blank" style="color:#36b;font-family:verdana,arial,sans-serif;font-size:10px;margin:0 5px 0 0;padding:0;text-decoration:none;">Mortgage Rates</a></span></td><td style="margin:0;padding:0;"><span id="widgetFooterLink"><a href="https://www.zillow.com/refinance/" target="_blank" style="color:#36b;font-family:verdana,arial,sans-serif;font-size:10px;margin:0 5px 0 0;padding:0;text-decoration:none;">Refinancing</a></span></td></tr><tr style="margin:0;padding:0;"><td style="margin:0;padding:0;"><span id="widgetFooterLink" class="regionBasedLink"><a href="http://www.zillow.com/seattle-wa/foreclosures/" target="_blank" style="color:#36b;font-size:10px;margin:0 5px 0 0;padding:0;text-decoration:none;"><span class="region">Seattle</span> Foreclosures</a></span></td><td style="margin:0;padding:0;"><span id="widgetFooterLink"><a href="https://www.zillow.com/mortgage-calculator/" target="_blank" style="color:#36b;font-size:10px;margin:0 5px 0 0;padding:0;text-decoration:none;">Mortgage Calculators</a></span></td><td style="margin:0;padding:0;"><span id="widgetFooterLink"><a href="http://www.zillow.com/mortgage-rates/" target="_blank" style="color:#36b;font-size:10px;margin:0 5px 0 0;padding:0;text-decoration:none;">Purchase Loans</a></span></td></tr></tbody></table></div>
        </div>
    </div>

    <div class="panel panel-primary">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#buildingDetails">Building Details</a>
            </h4>
        </div>

        <div id="buildingDetails" class="panel-body panel-collapse collapse">


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