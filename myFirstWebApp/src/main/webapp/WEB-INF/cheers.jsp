
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Your Form</title>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
            crossorigin="anonymous"></script>
    <script src="https://kit.fontawesome.com/da971305a9.js" crossorigin="anonymous"></script>
</head>

<body class="container-fluid col-12" style="display: flex; justify-content: center; align-items: center; width: 100%;">

<form method="post">
    <h1 class="justify-content-center mb-5"> WELCOME TO JAVABANK </h1>
    <div>
        <div class="row justify-content-left mb-3">
            <div class="col-5">
                <label for="exampleInputUser1" class="form-label">Name</label>
            </div>
            <div class="col-7">
                <input name="name" type="text" class="form-control" id="exampleInputUser1" aria-describedby="emailHelp">
            </div>
        </div>

        <div class="row justify-content-left mb-3">
            <div class="col-5">
                <label for="exampleInputUser1" class="form-label">Email</label>
            </div>
            <div class="col-7">
                <input name="name" type="text" class="form-control" id="email" aria-describedby="emailHelp">
            </div>
        </div>

        <div class="row justify-content-left mb-3">
            <div class="col-5">
                <label for="exampleInputUser1" class="form-label">Phone number</label>
            </div>
            <div class="col-7">
                <input name="name" type="text" class="form-control" id="phone" aria-describedby="emailHelp">
                <button type="submit" class="btn btn-primary mt-5"> Submit </button>
            </div>
        </div>


    </div>

</form>

</body>
</html>
