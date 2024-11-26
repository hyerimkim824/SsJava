<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문서</title>
<style>
    table{
        border-collapse:collapse;
        border:1px solid gray;
        width:500px;
        margin: 0 auto;
    }
    td{
        height:30px;
        border:1px solid gray;

    }
    td.title{
        width:100px;
        text-align:center;
        background-color:ivory;
        font-weight:bold;
        color:#ff6600;
        padding:0 10px;
    }
    input[type="number"]{
        text-align:right;
        width:50px;
        height:19px;
    }
    ul{
        list-style:none;
        padding:0 10px;
        margin:5px;

    }
    ul li{
        display:inline;

    }
</style>
</head>
<body>
<form action="s10_order.jsp" method="post" id="myForm">
    <table border="1">
        <tr>
            <td class="title"><b>식사류</b></td>
            <td>
                <ul>
                    <li>
                        <label for="c0">짜장면 </label>
                        <input type="number" name="food_c0" id="c0" min="0" max="99" value="0">
                    </li>
                    <li>
                        <label for="c1">짬뽕</label>
                        <input type="number" name="food_c1" id="c1" min="0" max="99" value="0">
                    </li>
                    <li>
                        <label for="c2">볶음밥</label>
                        <input type="number" name="food_c2" id="c2" min="0" max="99" value="0">
                    </li>

                </ul>
            </td>
        </tr>
        <tr align="center">
            <td colspan="2">
                <input type="submit" value="전송">
            </td>
        </tr>
    </table>
</form>
</body>
</html>