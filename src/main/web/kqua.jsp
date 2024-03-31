<%-- 
    Document   : kqua
    Created on : 31 thg 3, 2024, 17:30:18
    Author     : 84866
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kết Quả Thi Của Bạn</title>
    </head>
    <body>
     <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        h2 {
            margin-top: 0;
             text-align: center;
        }
        .result {
            margin-bottom: 20px;
            
        }
        .result label {
            font-weight: bold;
             font-size: 1.2em;
        }
        .answers {
            margin-top: 20px;
        }
        .answer {
            margin-bottom: 10px;
        }
        .answer label {
            font-weight: bold;
            
        }
         h3 a {
        color: red; /* làm cho màu chữ đen */
    }
    </style>
</head>
<body>
    <div class="container">
        <h2><style>
            .KẾT QUẢ BÀI THI CỦA BẠN {
                color: red;
            }
        </style>
        </h2>
        <div class="center">
             <p><b><span style="color: red; font-size: 1.5em;">HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG</span></b></p>
        </div>
        
        <div class="result">
            <label>Tổng số câu:</label> <span id="totalQuestions">10</span><br>
            <label>Số câu trả lời đúng:</label> <span id="correctAnswers">8</span><br>
            <label>Điểm số:</label> <span id="score" style="color: red; font-size: 1.2em;">80/100</span>
        </div>
        <h3><a href="list">Xem giải thích chi tiết</a></h3>
    </body>
</html>
