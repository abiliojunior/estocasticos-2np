S01 <-   read.csv("simulacoes/simila_100_100 (1).csv",header=TRUE, sep=";", na.strings="NA")
tempo<-seq(1:101)
S01.trans<-cbind(tempo,S01)

plot(S01.trans)




hist(S.100.10.1$imunes)

quadrado<-sqrt(S.100.10.1)
hist(quadrado$imunes)

lognep<-log(S.100.10.1)
hist(lognep$pseudo_imunes)

shapiro.test(lognep$pseudo_imunes)
fligner.test(lognep$pseudo_imunes)


numSummary(S.100.100.3$imunes, statistics=c("mean", "sd"))


###—###—###—###—###
x=rnorm(10,2,2)
y=rnorm(10,4,2)
A=data.frame(x,y)

require(xtable)
xtable(A)

## outro modelo
Modelo=summary(lm(x~y))
xtable(Modelo)
###—###—###—###—###
           