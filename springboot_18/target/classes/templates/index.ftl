<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
</head>
<body>
<h1>标题：123123</h1>
<h2>用户名为 ${name}</h2>
<p>
    你好，
    <#if name=="彭宇晟">
<h3>我是H3的 ${name}</h3>
<#elseif name=="pengyusheng">
    <h4>我是H4的 ${name}</h4>
<#else>
    <h5>我是H5的 ${name}</h5>
</#if>
</p>

<#--  循环遍历用户信息    -->
<ol>
    <#list userList as user1>
        <li>用户名为 ${user1.username},年龄为 ${user1.userage}</li>
    </#list>

</ol>
</body>


</html>

