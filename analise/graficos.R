library(car)
library(ggplot2)
library(pastecs)
library(psych)
#library(Rcmdr)

S.10.10.2 <-read.csv("simulacoes/simila_10_10 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.10.100.1 <-read.csv("simulacoes/simila_10_100 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.100.10.2 <-read.csv("simulacoes/simila_100_10 (2).csv",header=TRUE, sep=";", na.strings="NA")

amostra<-sqrt(S.10.10.2)
#imunes
hist.imunes <- ggplot(amostra, aes(imunes)) 
hist.imunes<-hist.imunes + labs( x = "Imunes", y = "Densidade") + geom_histogram(aes(y = ..density..),binwidth = 1, colour = "black", fill = "white")  + stat_function(fun = dnorm, args =list(mean = mean(amostra$imunes, na.rm = TRUE), sd = sd(amostra$imunes, na.rm = TRUE)), colour= "tomato", size = 1.5)
hist.imunes
ggsave("Exp_Imunes.eps")

#pseudoImunes

hist.pseudoImunes <- ggplot(amostra, aes(pseudo_imunes)) 
hist.pseudoImunes<-hist.pseudoImunes + labs( x = "Pseudo-imunes", y = "Densidade") + geom_histogram(aes(y = ..density..),binwidth = 1, colour = "black", fill = "white")  + stat_function(fun = dnorm, args =list(mean = mean(amostra$pseudo_imunes, na.rm = TRUE), sd = sd(amostra$pseudo_imunes, na.rm = TRUE)), colour= "tomato", size = 1.5)
hist.pseudoImunes
ggsave("Exp_pseudoImunes.eps")

#infectantesGerados

hist.infectantes_gerados <- ggplot(amostra, aes(infectantes_gerados)) 
hist.infectantes_gerados<-hist.infectantes_gerados + labs( x = "Infectantes gerados", y = "Densidade") + geom_histogram(aes(y = ..density..),binwidth = 1, colour = "black", fill = "white")  + stat_function(fun = dnorm, args =list(mean = mean(amostra$infectantes_gerados, na.rm = TRUE), sd = sd(amostra$infectantes_gerados, na.rm = TRUE)), colour= "tomato", size = 1.5)
hist.infectantes_gerados
ggsave("Exp_infectantes_gerados.eps")

#doentes
hist.doentes <- ggplot(amostra, aes(doentes)) 
hist.doentes<-hist.doentes + labs( x = "Doentes", y = "Densidade") + geom_histogram(aes(y = ..density..),binwidth = 1, colour = "black", fill = "white")  + stat_function(fun = dnorm, args =list(mean = mean(amostra$doentes, na.rm = TRUE), sd = sd(amostra$doentes, na.rm = TRUE)), colour= "tomato", size = 1.5)
hist.doentes
ggsave("Exp_doentes.eps")

#acidentados
hist.acidentados <- ggplot(amostra, aes(acidentados)) 
hist.acidentados<-hist.acidentados + labs( x = "Acidentados", y = "Densidade") + geom_histogram(aes(y = ..density..),binwidth = 1, colour = "black", fill = "white")  + stat_function(fun = dnorm, args =list(mean = mean(amostra$acidentados, na.rm = TRUE), sd = sd(amostra$acidentados, na.rm = TRUE)), colour= "tomato", size = 1.5)
hist.acidentados
ggsave("Exp_acidentados.eps")

#sadios
hist.sadios <- ggplot(amostra, aes(sadios)) 
hist.sadios<-hist.sadios + labs( x = "Sadios", y = "Densidade") + geom_histogram(aes(y = ..density..),binwidth = 1, colour = "black", fill = "white")  + stat_function(fun = dnorm, args =list(mean = mean(amostra$sadios, na.rm = TRUE), sd = sd(amostra$sadios, na.rm = TRUE)), colour= "tomato", size = 1.5)
hist.sadios
ggsave("Exp_sadios.eps")

#nascimentos
hist.nascimentos <- ggplot(amostra, aes(nacimentos)) 
hist.nascimentos<-hist.nascimentos + labs( x = "Nascimentos", y = "Densidade") + geom_histogram(aes(y = ..density..),binwidth = 1, colour = "black", fill = "white")  + stat_function(fun = dnorm, args =list(mean = mean(amostra$nacimentos, na.rm = TRUE), sd = sd(amostra$nacimentos, na.rm = TRUE)), colour= "tomato", size = 1.5)
hist.nascimentos
ggsave("Exp_nascimentos.eps")


