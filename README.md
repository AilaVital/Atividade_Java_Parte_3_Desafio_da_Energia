# ⚡ Laboratório de Práticas: Missão Java - Parte 3 (Desafio da Energia)

Repositório com a solução da Parte 3 da Missão Java, focada na implementação de recursos de energia com validações rígidas de estado via Orientação a Objetos.

## 🎯 Objetivos do Desafio
- **Manipulação de Atributos Privados**: Validação do atributo `energia` no intervalo fixo de [0, 100].
- **Lógica de Métodos com Retorno**: Uso do tipo de retorno `boolean` no método `podeUsarHabilidade()`.
- **Reutilização de Métodos**: Chamada de métodos de consulta dentro de métodos de alteração.
- **Formatação de Saída**: Atualização do `toString()` para inclusão do novo recurso.

---

## 📁 Estrutura do Projeto

| Arquivo | Descrição |
| :--- | :--- |
| `Personagem.java` | Classe com os atributos encapsulados, getters/setters com limites e métodos `podeUsarHabilidade()`, `usarHabilidade()`, `descansar()` e `toString()`. |
| `Main.java` | Classe com os testes de consumo de energia, descansos e rejeição de valores inválidos via setters. |

---

## ⚡ Desafio-Relâmpago - Caça aos Erros

| # | Erro Identificado | Correção Aplicada |
| :-: | :--- | :--- |
| **1** | Acesso direto ao atributo `private` (`p1.energia = 90;`). | `p1.setEnergia(90);` |
| **2** | Uso de atribuição `=` em vez de comparação `==` na condição `if`. | `if (p1.podeUsarHabilidade(200))` |
| **3** | Chamada de `usarHabilidade()` sem fornecer o parâmetro obrigatorio de `custo`. | `p1.usarHabilidade("Raio", 200);` |

---

## 📝 Explicação Teórica (Perguntas da Atividade)

### 1. Por que `podeUsarHabilidade()` retorna `boolean`?
Porque ele atua como um método de verificação/consulta. A sua única função é responder se uma condição lógica é verdadeira (`true`) ou falsa (`false`) para que outros métodos (como o `usarHabilidade()`) possam tomar decisões com base nessa resposta.

### 2. O que acontece se `setEnergia(150)` for chamado?
O valor `150` é ignorado e rejeitado pela validação `if (energia >= 0 && energia <= 100)` dentro do setter. O objeto mantém o seu valor de energia anterior inalterado.

### 3. Qual é a diferença entre um método que consulta o objeto e um método que altera seu estado?
- **Método de Consulta** (ex: `getEnergia()`, `podeUsarHabilidade()`): Apenas lê ou calcula dados sobre o objeto sem modificar suas variáveis. Não altera o estado interno e geralmente retorna um valor.
- **Método de Alteração de Estado** (ex: `setEnergia()`, `descansar()`, `usarHabilidade()`): Modifica os valores armazenados nos atributos do objeto (altera seu estado interno) e normalmente possui retorno do tipo `void`.
