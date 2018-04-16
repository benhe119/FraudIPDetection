# FraudIPDetection
This is a project for detection of fraud IP Addresses and the number of times they have tried to hit the server, This can be used to avoid DDoS (Distributed Denial of Service) Attack. Kafka and Spark Streaming is used to detect these IP's.

Kafka Producer - Kafka Producer API is use to read a log file and publish records to Kafka topic.

Fraud IPs list - We will maintain a list of predefined fraud IP range which can be used to identify fraud IPs. For this application we are using in memory IP list.

Spark Streaming - This is a spark streaming application. It reads records from Kafka topic and will detect IP's and domains which are suspicious.

We have used Maven as build and project management tool. 
