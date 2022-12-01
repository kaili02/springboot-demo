# 安装docker-compose情况下，在docker-compose.yml下执行如下命令，安装kafka
docker-compose up -d

# 修改本机host对应的ip hostname映射
# windows下 路径 C:\Windows\System32\drivers\etc\hosts, 添加如下内容

47.92.207.184 kafka001

# ip为kafka所在容器的宿主机IP，hostname为kafka所在容器的hostname