library(car)
library(ggplot2)
library(pastecs)
library(psych)
#library(Rcmdr)

S.10.100.1 <-read.csv("simulacoes/simila_10_100 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.10.100.2 <-read.csv("simulacoes/simila_10_100 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.10.100.3 <-read.csv("simulacoes/simila_10_100 (3).csv",header=TRUE, sep=";", na.strings="NA")

hist(S.10.100.1$imunes,xlab = "ai dentu", col = c("blue", "red"))


stat.desc(S.10.100.1) 
stat.desc(S.10.100.2)
stat.desc(S.10.100.3)

hist.imunes<- ggplot(S.10.100.1, aes(imunes))
hist.imunes+theme(legend.position = "none")
geom_histogram(aes(y = ..density..), colour = "black", fill = "white")
hist.imunes


S.imunes <- qplot(sample = S.10.100.1$imunes, stat="qq")
S.imunes 


hist.imunes <- ggplot(S.10.100.1, aes(imunes)) 
hist.imunes + geom_histogram(aes(y = ..density..), colour = "black", fill = "white")  + stat_function(fun = dnorm, args =list(mean = mean(S.10.100.1$imunes, na.rm = TRUE), sd = sd(S.10.100.1$imunes, na.rm = TRUE)), colour= "black", size = 1)
hist.day1


stat.desc(cbind(S.10.100.1$imunes, S.10.100.1$nacimentos), basic = FALSE, norm = TRUE)
require(xtable)
xtable(stat.desc(S.10.100.1[, c("imunes", "nacimentos")], basic = FALSE, norm = TRUE))


shapiro.test(S.10.100.1$imunes)
shapiro.test(S.10.100.1$pseudo_imunes)
shapiro.test(S.10.100.1$infectantes_gerados)
shapiro.test(S.10.100.1$acidentados)
shapiro.test(S.10.100.1$sadios)
shapiro.test(S.10.100.1$nacimentos)
norm

fatiado<-S.10.100.1[1:95,1:7]
fatiado
