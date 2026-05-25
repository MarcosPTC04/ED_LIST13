# 📌 Descrição

Este repositório apresenta a implementação de uma Lista Simplesmente Encadeada Genérica em Java. O projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais de Estruturas de Dados, incluindo manipulação de nós encadeados, gerenciamento de referências na memória, uso de interfaces genéricas e organização modular do código.

A aplicação implementa operações importantes de listas encadeadas, como inserção ordenada, remoção de nós, inversão da lista, merge de listas ordenadas e remoção do n-ésimo elemento a partir do final da estrutura, além da criação de testes para validação do funcionamento da lista em diferentes cenários.

---

# 🛠 Recursos Utilizados

Linguagem: Java
IDE: IntelliJ IDEA
Controle de versão: Git
Plataforma de hospedagem: GitHub

---

# 📋 Estrutura do Código

## 🔹 Interface MyList<T>

Define as operações principais da lista encadeada, incluindo:

Inserção de elementos
Impressão da lista
Inserção ordenada
Inversão da lista
Remoção de elementos a partir do final

---

## 🔹 Classe MyLinkedList<T>

Responsável pela implementação concreta da lista simplesmente encadeada, contendo:

Referência para o primeiro nó (`head`)
Referência para o último nó (`tail`)
Manipulação dinâmica dos nós através de referências
Implementação dos métodos da lista encadeada

---

## 🔹 Classe Node<T>

Representa os nós da estrutura encadeada, contendo:

Valor armazenado
Referência para o próximo nó da lista

---

## 🔹 Classes Exercise01 até Exercise05

Responsáveis pela execução prática dos exercícios propostos, demonstrando o funcionamento dos algoritmos implementados na lista encadeada.

Cada classe realiza testes específicos relacionados às atividades solicitadas.

---

## 🔹 Classe MyLinkedListTests

Responsável pelos testes gerais da aplicação, validando:

Inserção de elementos
Inversão da lista
Manipulação correta dos ponteiros
Funcionamento geral da estrutura

---

# ⚙️ Observações sobre a implementação

Estrutura baseada em nós encadeados
Uso de referências dinâmicas entre elementos
Implementação genérica utilizando `<T>`
Separação entre interface, estrutura, exercícios e testes
Organização em packages padronizados em inglês
Manipulação eficiente de ponteiros de referência

---

# ▶️ Exemplos de Execução

```text
Lista original:
10 -> 20 -> 30 -> 40 -> null

Lista invertida:
40 -> 30 -> 20 -> 10 -> null

Lista após remoção:
10 -> 20 -> 40 -> null
```

---

# 👨‍💻 Autor

Marcos Antonio de Oliveira Filho  
Curso: Análise e Desenvolvimento de Sistemas  
Disciplina: Estrutura de Dados I
