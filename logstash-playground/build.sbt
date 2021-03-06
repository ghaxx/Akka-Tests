name := "logstash-playground"
version := "1.0"

val akkaVersion = "2.4.19"

libraryDependencies ++= Seq(
  "net.logstash.logback" % "logstash-logback-encoder" % "4.9",
  "ch.qos.logback" % "logback-access" % "1.2.3"
//  "org.apache.activemq" % "activemq-core" % "5.15.0"
)

resolvers += Resolver.bintrayRepo("cakesolutions", "maven")
