# Sistema Bancário Java - Desafio Acadêmico

## Descrição do Projeto

Este projeto é um **sistema bancário simplificado** desenvolvido em **Java**, com aplicação em console.  
O objetivo é aplicar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como **herança, polimorfismo, encapsulamento, composição e interfaces**, em um projeto prático.

O sistema permite a criação de clientes, contas correntes e contas poupança, bem como operações bancárias básicas como depósito, saque, transferência e cálculo de impostos para contas tributáveis.

---

## Funcionalidades

- **Cadastro de Cliente**: Cada cliente pode possuir múltiplas contas.  
- **Tipos de Conta**:
  - **Conta Corrente**: Permite saque com taxa e está sujeita a imposto.  
  - **Conta Poupança**: Isenta de impostos.  
- **Operações Bancárias**:
  - Depósito
  - Saque
  - Transferência entre contas (Corrente ↔ Poupança)
- **Cálculo de Impostos**:
  - Conta Corrente implementa a interface `Tributavel`.
  - O sistema calcula 10% do saldo como imposto (exemplo didático).
- **Menu interativo**:
  - Permite que o usuário escolha a operação desejada via console.

---



