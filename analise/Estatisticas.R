#calculando e plotando um granfico de distribuicao normal

plot(function(z)dnorm(z),-3.5,3.5)


#Calculando e plotando um grafico de distribuicao acumulada 
plot(function(z)pnorm(z),-3.5,3.5)

# Grafico de distribuicao acumulada com eixos
plot(function(z)pnorm(z),-3.5,3.5, ylab="F(z)", xlab="z")


#Calcular p(z<1,73)
pnorm(1.73)

#Calcular p(0<z<1.73)
pnorm(1.73)-pnorm(0)

#Calcular p(z>1.73)
pnorm(1.73,lower=F)

#Calcular p(0.47<z<1.73)
pnorm(1.73)-pnorm(0.47)


# VAriavel com media igual a 3 e variacaia ugual a 16

#fazedo grafico da funcao de densidade
plot(function(x)dnorm(x, mean = 3,sd = 4), -10,16, ylab = "f(x)")


#calcular a probabilidade para P(2<X<5)
pnorm(5,3,4)-pnorm(2,3,4)

#calcular P(x>4)
pnorm(4,3,4, lower =F)

#Calcular P(z<zc) = 0.99
qnorm(0.99)


#outras distribuicoes

help("distribution")
