<!DOCTYPE html>
<html ng-app="app">

<jsp:include page="htmlHeadStuff.jsp"/>


<jsp:include page="header.jsp"/>

<body ng-app="registerForm">
<div ng-controller="registerFormController">
    <div class="container">
        <br><br><br><br><br>
        <div class="row">
            <div class="col-sm-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <div class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapse1">Sign in</a>
                        </div>
                    </div>
                    <div id="collapse1" class="panel-collapse collapse">
                        <div class="panel-body">
                            <form role="form">
                                <div class="form-group">
                                    <input type="text" name="userEmail" id="userEmail" class="form-control input-sm" placeholder="EMail">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="userPassword" id="userPassword" class="form-control input-sm" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <strong><input type="checkbox" value="remember-me">&nbsp;&nbsp;Remember</strong>
                                </div>
                                <div class="form-group">
                                    <input type="submit" value="Sign in" class="btn btn-primary btn-block">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-sm-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <div class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapse2">Reset Password</a>
                        </div>
                    </div>
                    <div id="collapse2" class="panel-collapse collapse">
                        <div class="panel-body">
                            <form role="form">
                                <div class="form-group">
                                    <input type="text" name="userEmailToReset" id="userEmailToReset" class="form-control input-sm" placeholder="EMail">
                                </div>
                                <div class="form-group">
                                    <input type="submit" value="Reset Password" class="btn btn-primary btn-block">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <div class="col-sm-4">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <div class="panel-title">
                            <a data-toggle="collapse" data-parent="#accordion" href="#collapse3">Create Profile</a>
                        </div>
                    </div>
                    <div id="collapse3" class="panel-collapse collapse">
                        <div class="panel-body">
                            <form role="form">
                                <div class="form-group">
                                    <input type="text" name="firstName" id="firstName" class="form-control input-sm" placeholder="First Name">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="lastName" id="lastName" class="form-control input-sm" placeholder="Last Name">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="emailAddress" id="emailAddress" class="form-control input-sm" placeholder="EMail Address">
                                </div>
                                <div class="form-group">
                                    <input type="text" name="profileAccountNumber" id="profileAccountNumber" class="form-control input-sm" placeholder="Account Number">
                                </div>
                                <div class="form-group">
                                    <input type="password" name="password" id="password" class="form-control input-sm" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <input type="password" name="passwordConfirmation" id="passwordConfirmation" class="form-control input-sm" placeholder="Confirm Password">
                                </div>
                                <div class="form-group">
                                    <input type="submit" value="Register" class="btn btn-primary btn-block">
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-sm-12">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <div class="panel-title">Real Estate Property Search</div>
                    </div>
                    <div class="panel-body">
                        <form novalidate role="form" action="propertyDetails.jsp">
                            <div class="input-group">
                                <input type="text" ng-model="account.searchString" class="form-control" placeholder="Say or enter Account#(R1234567), Owner Name(Last Name or First Name), Street Number(10754), Street Name(Parker Road) or State Parcel#(223321205027)">
                                <span class="input-group-btn">
                                    <input type="submit" value="Search" class="btn btn-primary" ng-click="searchAccount(account)">
                                </span>
                            </div>
                        </form>
                        <br>
                        <div>
                            <a style="color: #375a7f; font-weight: bold;" href="angularjsApp/views/searchByMapView.html">Search By Map</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <pre>user = {{account | json}}</pre>
        <pre>master = {{master | json}}</pre>

    </div>
</div>

<jsp:include page="footer.jsp"/>


</body>
</html>