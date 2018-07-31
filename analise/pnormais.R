#Experimentos 10 100
S.10.100.1 <-read.csv("simulacoes/simila_10_100 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.10.100.2 <-read.csv("simulacoes/simila_10_100 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.10.100.3 <-read.csv("simulacoes/simila_10_100 (3).csv",header=TRUE, sep=";", na.strings="NA")


amostra<-S.10.100.2

amostra<-amostra[1:95,1:7]
restantes<-amostra[95:101,1:7]

stat.desc(amostra)[c(9,13), 1:7]

#imunes
plot(function(x)dnorm(x, mean = 60.94, sd = 5.44), 40, 80, ylab = "f(x)")
#calculo para 0.95
#qnorm(0.95)
qnorm(0.95,mean = 60.94, sd = 5.44) 
qnorm(0.95,mean = 60.94, sd = 5.44, lower.tail = FALSE) 

restantes[1:7,1]


#pseudo imunes 
plot(function(x)dnorm(x, mean = 30.70, sd = 7.76), 0, 60, ylab = "f(x)")
#calculo para 0.95
#qnorm(0.95)
qnorm(0.95,mean = 30.70, sd = 7.76) 
qnorm(0.95,mean = 30.70, sd = 7.76, lower.tail = FALSE) 

restantes[1:7,2]

#infectantes
plot(function(x)dnorm(x, mean = 0.46, sd = 1.23), 0, 60, ylab = "f(x)")
#calculo para 0.95
#qnorm(0.95)
qnorm(0.95,mean = 0.46, sd = 1.23) 
qnorm(0.95,mean = 0.46, sd = 1.23, lower.tail = FALSE) 

restantes[1:7,3]

#doentes
plot(function(x)dnorm(x, mean = 1.17, sd = 2.98), 0, 60, ylab = "f(x)")
#calculo para 0.95
#qnorm(0.95)
qnorm(0.95,mean = 1.17, sd = 2.98) 
qnorm(0.95,mean = 1.17, sd = 2.98, lower.tail = FALSE) 

restantes[1:7,4]

#acidentados
plot(function(x)dnorm(x, mean = 8.05, sd = 2.76), 0, 60, ylab = "f(x)")
#calculo para 0.95
#qnorm(0.95)
qnorm(0.95,mean = 8.05, sd = 2.76) 
qnorm(0.95,mean = 8.05, sd = 2.76, lower.tail = FALSE) 

restantes[1:7,5]

#sadios
plot(function(x)dnorm(x, mean = 22.40, sd = 4.64), 0, 60, ylab = "f(x)")
#calculo para 0.95
#qnorm(0.95)
qnorm(0.95,mean = 22.40, sd = 4.64) 
qnorm(0.95,mean = 22.40, sd = 4.64, lower.tail = FALSE) 

restantes[1:7,6]

#nascimentos
plot(function(x)dnorm(x, mean = 18.19, sd = 5.08), 0, 60, ylab = "f(x)")
#calculo para 0.95
#qnorm(0.95)
qnorm(0.95,mean = 18.19, sd = 5.08) 
qnorm(0.95,mean = 18.19, sd = 5.08, lower.tail = FALSE) 

restantes[1:7,7]
