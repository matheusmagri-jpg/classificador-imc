
# ⚖️ Classificador de IMC

Aplicação web desenvolvida para calcular o Índice de Massa Corporal (IMC) e apresentar a classificação correspondente com base no peso e na altura informados pelo usuário.

> Projeto desenvolvido com o objetivo de praticar HTML, CSS, JavaScript, manipulação do DOM e lógica de programação.

---

## 📸 Demonstração

<img width="1024" height="1024" alt="gen_3J5qY9GBkHf156GUX0cxIQL2IfG" src="https://github.com/user-attachments/assets/99dc82ad-9b46-4106-9d98-f2bf8f0b6b8b" />

![Demonstração do projeto](./assets/preview.png)

---

## 🚀 Funcionalidades

- Cálculo automático do IMC;
- Classificação do resultado;
- Validação dos campos preenchidos;
- Exibição de mensagens para dados inválidos;
- Interface simples e intuitiva;
- Atualização dinâmica do resultado na página;
- Formatação do IMC com casas decimais.

---

## 🧮 Como o IMC é calculado?

O cálculo é realizado utilizando a seguinte fórmula:

$$
IMC = \frac{peso}{altura^2}
$$

Onde:

- `peso` é informado em quilogramas;
- `altura` é informada em metros.

### Classificação do IMC

| Resultado | Classificação |
|:---:|---|
| Abaixo de 18,5 | Abaixo do peso |
| De 18,5 a 24,9 | Peso normal |
| De 25,0 a 29,9 | Sobrepeso |
| De 30,0 a 34,9 | Obesidade grau I |
| De 35,0 a 39,9 | Obesidade grau II |
| Acima de 40,0 | Obesidade grau III |

> A classificação apresentada é apenas informativa e não substitui a avaliação de um profissional da saúde.

---

## 🛠️ Tecnologias utilizadas

- **HTML5** — estrutura da aplicação;
- **CSS3** — estilização e layout;
- **JavaScript** — cálculo do IMC e interação com a página;
- **DOM** — manipulação dos elementos HTML.

---

## 📂 Estrutura do projeto

```text
classificador-imc/
├── index.html
├── style.css
├── script.js
└── README.md
