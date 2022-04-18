<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">

<head>
    <meta charset="UTF-8"/>
    <title>Payment Report</title>
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css"/>
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="well col-xs-10 col-sm-10 col-md-6 col-xs-offset-1 col-sm-offset-1 col-md-offset-3">
            <div class="row">
                <div class="col-xs-6 col-sm-6 col-md-6">
                    <strong th:text="${result}"></strong>
                    <br>
                </div>
                <div class="col-xs-6 col-sm-6 col-md-6 text-right">

                </div>
            </div>
            <div class="row">
                <div class="text-center">
                    <img src="https://i.stack.imgur.com/YbIni.png"/>
                    <div class="buttons">
                     <a href='http://localhost:3000/Home'>
                  <button type="button" class="btn btn-success"> Continue Shopping </button>
                  </div>

                </div>
               
                <table class="table table-hover">
                    <thead>
                    <tr>
                        <div>
                        <h5>Bank Account No=846310110001798</h5>
                        <h5>TranscationId=UHY657435WR53609</h5>
                        <h5>UTR No=1TR26G876</h5>

                    </tr>
                    </thead>
                    <tbody>

                    <tr th:each="entry : ${parameters}">

                        <td th:text="${entry.key} + '  : -  ' + ${entry.value}"></td>
                      
                    </tr>
                    </tbody>
                </table>

                <button type="button" class="btn btn-info btn-lg">THANK YOU FOR YOUR PURCHASE...!!!</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>