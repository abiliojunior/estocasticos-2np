
library(car)
library(ggplot2)
library(pastecs)
library(psych)
#library(Rcmdr)
#Experimentos 10 10
S.10.10.1 <-read.csv("simulacoes/simila_10_10 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.10.10.2 <-read.csv("simulacoes/simila_10_10 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.10.10.3 <-read.csv("simulacoes/simila_10_10 (3).csv",header=TRUE, sep=";", na.strings="NA")

exp01<-stat.desc(S.10.10.1)[c(8,9,13), 1:7]
exp02<-stat.desc(S.10.10.2)[c(8,9,13), 1:7]
exp03<-stat.desc(S.10.10.3)[c(8,9,13), 1:7]

require(xtable)
exp01


xtable(exp01)
xtable(exp02)
xtable(exp03)

#Experimentos 10 100
S.10.100.1 <-read.csv("simulacoes/simila_10_100 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.10.100.2 <-read.csv("simulacoes/simila_10_100 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.10.100.3 <-read.csv("simulacoes/simila_10_100 (3).csv",header=TRUE, sep=";", na.strings="NA")


exp04<-stat.desc(S.10.100.1)[c(8,9,13), 1:7]
exp05<-stat.desc(S.10.100.2)[c(8,9,13), 1:7]
exp06<-stat.desc(S.10.100.3)[c(8,9,13), 1:7]

xtable(exp04)
xtable(exp05)
xtable(exp06)

#Esperimento 100 10
S.100.10.1 <-read.csv("simulacoes/simila_100_10 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.100.10.2 <-read.csv("simulacoes/simila_100_10 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.100.10.3 <-read.csv("simulacoes/simila_100_10 (3).csv",header=TRUE, sep=";", na.strings="NA")

exp07<-stat.desc(S.100.10.1)[c(8,9,13), 1:7]
exp08<-stat.desc(S.100.10.2)[c(8,9,13), 1:7]
exp09<-stat.desc(S.100.10.3)[c(8,9,13), 1:7]

xtable(exp07)
xtable(exp08)
xtable(exp09)

#simulacoes 100 100
S.100.100.1 <-read.csv("simulacoes/simila_100_100 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.100.100.2 <-read.csv("simulacoes/simila_100_100 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.100.100.3 <-read.csv("simulacoes/simila_100_100 (3).csv",header=TRUE, sep=";", na.strings="NA")

exp10<-stat.desc(S.100.100.1)[c(8,9,13), 1:7]
exp11<-stat.desc(S.100.100.2)[c(8,9,13), 1:7]
exp12<-stat.desc(S.100.100.3)[c(8,9,13), 1:7]

xtable(exp10)
xtable(exp11)
xtable(exp12)

#Experimento 100 1000
S.100.1000.1 <-read.csv("simulacoes/simila_100_1000 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.100.1000.2 <-read.csv("simulacoes/simila_100_1000 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.100.1000.3 <-read.csv("simulacoes/simila_100_1000 (3).csv",header=TRUE, sep=";", na.strings="NA")

exp13<-stat.desc(S.100.1000.1)[c(8,9,13), 1:7]
exp14<-stat.desc(S.100.1000.2)[c(8,9,13), 1:7]
exp15<-stat.desc(S.100.1000.3)[c(8,9,13), 1:7]

xtable(exp13)
xtable(exp14)
xtable(exp15)

#experimento 1000
S.1000.100 <-read.csv("simulacoes/simila_1000_100.csv",header=TRUE, sep=";", na.strings="NA")
S.1000.1000 <-read.csv("simulacoes/simila_1000_1000.csv",header=TRUE, sep=";", na.strings="NA")

exp16<-stat.desc(S.1000.100)[c(8,9,13), 1:7]
exp17<-stat.desc(S.1000.1000)[c(8,9,13), 1:7]


xtable(exp16)
xtable(exp17)

