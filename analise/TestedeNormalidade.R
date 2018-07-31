#Teste de normalidade (Shapiro-Wilk)

S.10.10.1 <-read.csv("simulacoes/simila_10_10 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.10.10.2 <-read.csv("simulacoes/simila_10_10 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.10.10.3 <-read.csv("simulacoes/simila_10_10 (3).csv",header=TRUE, sep=";", na.strings="NA")

amostra<-S.10.10.2

shapiro.test(amostra$imunes)
shapiro.test(amostra$pseudo_imunes)
shapiro.test(amostra$infectantes_gerados)
shapiro.test(amostra$doentes)
shapiro.test(amostra$acidentados)
shapiro.test(amostra$sadios)
shapiro.test(amostra$nacimentos)

#Experimentos 10 100
S.10.100.1 <-read.csv("simulacoes/simila_10_100 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.10.100.2 <-read.csv("simulacoes/simila_10_100 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.10.100.3 <-read.csv("simulacoes/simila_10_100 (3).csv",header=TRUE, sep=";", na.strings="NA")


amostra<-S.10.100.2

shapiro.test(amostra$imunes)
shapiro.test(amostra$pseudo_imunes)
shapiro.test(amostra$infectantes_gerados)
shapiro.test(amostra$doentes)
shapiro.test(amostra$acidentados)
shapiro.test(amostra$sadios)
shapiro.test(amostra$nacimentos)

#Esperimento 100 10
S.100.10.1 <-read.csv("simulacoes/simila_100_10 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.100.10.2 <-read.csv("simulacoes/simila_100_10 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.100.10.3 <-read.csv("simulacoes/simila_100_10 (3).csv",header=TRUE, sep=";", na.strings="NA")


amostra<-S.10.10.2

shapiro.test(amostra$imunes)
shapiro.test(amostra$pseudo_imunes)
shapiro.test(amostra$infectantes_gerados)
shapiro.test(amostra$doentes)
shapiro.test(amostra$acidentados)
shapiro.test(amostra$sadios)
shapiro.test(amostra$nacimentos)


#simulacoes 100 100
S.100.100.1 <-read.csv("simulacoes/simila_100_100 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.100.100.2 <-read.csv("simulacoes/simila_100_100 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.100.100.3 <-read.csv("simulacoes/simila_100_100 (3).csv",header=TRUE, sep=";", na.strings="NA")


amostra<-S.10.10.2

shapiro.test(amostra$imunes)
shapiro.test(amostra$pseudo_imunes)
shapiro.test(amostra$infectantes_gerados)
shapiro.test(amostra$doentes)
shapiro.test(amostra$acidentados)
shapiro.test(amostra$sadios)
shapiro.test(amostra$nacimentos)

#Experimento 100 1000
S.100.1000.1 <-read.csv("simulacoes/simila_100_1000 (1).csv",header=TRUE, sep=";", na.strings="NA")
S.100.1000.2 <-read.csv("simulacoes/simila_100_1000 (2).csv",header=TRUE, sep=";", na.strings="NA")
S.100.1000.3 <-read.csv("simulacoes/simila_100_1000 (3).csv",header=TRUE, sep=";", na.strings="NA")


amostra<-S.10.10.2

shapiro.test(amostra$imunes)
shapiro.test(amostra$pseudo_imunes)
shapiro.test(amostra$infectantes_gerados)
shapiro.test(amostra$doentes)
shapiro.test(amostra$acidentados)
shapiro.test(amostra$sadios)
shapiro.test(amostra$nacimentos)

#experimento 1000
S.1000.100 <-read.csv("simulacoes/simila_1000_100.csv",header=TRUE, sep=";", na.strings="NA")
S.1000.1000 <-read.csv("simulacoes/simila_1000_1000.csv",header=TRUE, sep=";", na.strings="NA")


amostra<-S.1000.100

shapiro.test(amostra$imunes)
shapiro.test(amostra$pseudo_imunes)
shapiro.test(amostra$infectantes_gerados)
shapiro.test(amostra$doentes)
shapiro.test(amostra$acidentados)
shapiro.test(amostra$sadios)
shapiro.test(amostra$nacimentos)


amostra<-S.1000.1000

shapiro.test(amostra$imunes)
shapiro.test(amostra$pseudo_imunes)
shapiro.test(amostra$infectantes_gerados)
shapiro.test(amostra$doentes)
shapiro.test(amostra$acidentados)
shapiro.test(amostra$sadios)
shapiro.test(amostra$nacimentos)
