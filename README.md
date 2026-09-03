# Classificador IMC

Aplicação em Java para calcular o Índice de Massa Corporal (IMC) e classificar o resultado (abaixo do peso, peso normal, sobrepeso, obesidade etc.), a partir do peso e da altura informados pelo usuário.

Projeto desenvolvido como exercício de estudo de Java e Programação Orientada a Objetos (POO).

## 🧮 Como funciona

O IMC é calculado pela fórmula:

```
IMC = peso (kg) / (altura (m) × altura (m))
```

Com base no valor obtido, o programa classifica o resultado de acordo com as faixas padrão de IMC:

| Faixa de IMC     | Classificação      |
|-------------------|---------------------|
| Abaixo de 18.5     | Abaixo do peso       |
| 18.5 – 24.9        | Peso normal          |
| 25.0 – 29.9        | Sobrepeso             |
| 30.0 – 34.9        | Obesidade grau I      |
| 35.0 – 39.9        | Obesidade grau II     |
| 40.0 ou mais       | Obesidade grau III    |

## 🚀 Tecnologias utilizadas

- Java
- NetBeans IDE (projeto gerado via Ant)

## ▶️ Como executar

### Pelo NetBeans

1. Clone o repositório:
   ```bash
   git clone https://github.com/matheusmagri-jpg/classificador-imc.git
   ```
2. Abra o projeto no NetBeans (`File > Open Project`).
3. Execute o projeto (`Run > Run Project` ou `F6`).

### Pela linha de comando

1. Compile os arquivos-fonte:
   ```bash
   javac -d build/classes src/classificador/imc/*.java
   ```
2. Execute a classe principal:
   ```bash
   java -cp build/classes classificador.imc.Main
   ```
   > Ajuste o nome da classe principal conforme o arquivo real do projeto, caso seja diferente.

## 📁 Estrutura do projeto

```
classificador-imc/
├── src/classificador/imc/   # Código-fonte da aplicação
├── nbproject/                # Configurações do projeto NetBeans
├── build.xml                 # Script de build (Ant)
├── manifest.mf                # Manifesto da aplicação
└── README.md
```

## 📌 Status

Projeto de estudo, em desenvolvimento.

## 📄 Licença

Este projeto é de uso livre para fins de estudo.
