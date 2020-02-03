<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

       <html>
       <head>
       <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
       <title>Insert title here</title>
       </head>
       <body>
       <h2>登录</h2>
       <fieldset>
              <form method="post"  action="/auth/login">
                     用户名：<input type="text" name="username"/><br>
                     密码：<input type="text" name="userpwd"/><br>
                     <input type="submit" value="登录"/>
              </form>
       </fieldset>
       </body>
       </html>