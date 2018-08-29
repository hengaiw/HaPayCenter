# HaPayCenter
HaPayCenter基于Spring Cloud架构开发的聚合支付系统（四方支付系统），已对接支付宝的PC支付，WAP支付，PC支付，当面付等。具有代理体系，同一商户下同渠道的轮询机制，支付日限量、次限量等。可直接用于生产环境。交流QQ群469779247


项目启动：
HaServer > HaConfig > HaPayService > HaApi > HaGateway
启动命令：
java -ms64m -mx128m -Xmn64m -Djava.awt.headless=true -XX:MaxPermSize=64m -jar HaPayService.jar >>/dev/null 2>&1 &
