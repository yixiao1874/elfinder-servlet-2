<%--
  Created by IntelliJ IDEA.
  User: 14999
  Date: 2017/11/2
  Time: 0:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>elFinder 2.1</title>

    <!-- jQuery and jQuery UI (REQUIRED) -->
    <link rel="stylesheet" type="text/css" href="webjars/jquery-ui-themes/1.11.4/smoothness/jquery-ui.min.css">
    <script src="webjars/jquery/1.12.4/jquery.min.js"></script>
    <script src="webjars/jquery-ui/1.11.4/jquery-ui.min.js"></script>

    <!-- elFinder CSS (REQUIRED) -->
    <link rel="stylesheet" type="text/css" href="webjars/elfinder/2.1.11/css/elfinder.min.css">
    <link rel="stylesheet" type="text/css" href="webjars/elfinder/2.1.11/css/theme.css">

    <!-- elFinder JS (REQUIRED) -->
    <script src="webjars/elfinder/2.1.11/js/elfinder.min.js"></script>

    <!-- elFinder translation (OPTIONAL) -->
    <script src="webjars/elfinder/2.1.11/js/i18n/elfinder.ru.js"></script>

    <!-- elFinder initialization (REQUIRED) -->
    <script type="text/javascript" charset="utf-8">
        // Documentation for client options:
        // https://github.com/Studio-42/elFinder/wiki/Client-configuration-options
        $(document).ready(function() {
            $('#elfinder').elfinder({
                url : 'elfinder-servlet/connector',
                // , lang: 'ru'                    // language (OPTIONAL)
            });
        });
    </script>
</head>
<body>

<!-- Element where elFinder will be created (REQUIRED) -->
<div id="elfinder"></div>

</body>
</html>
