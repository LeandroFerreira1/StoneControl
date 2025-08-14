# 🏗️ StoneControl

> Sistema empresarial completo para gestão de chapas de granito e orçamentos

[![Java](https://img.shields.io/badge/Java-7-orange.svg)](https://www.oracle.com/java/)
[![JSF](https://img.shields.io/badge/JSF-2.1-blue.svg)](https://javaee.github.io/javaserverfaces-spec/)
[![Hibernate](https://img.shields.io/badge/Hibernate-ORM-green.svg)](https://hibernate.org/)
[![MySQL](https://img.shields.io/badge/MySQL-Database-blue.svg)](https://www.mysql.com/)
[![License](https://img.shields.io/badge/License-Apache%202.0-brightgreen.svg)](LICENSE)

## 📋 Sobre o Projeto

O **StoneControl** é uma aplicação web empresarial desenvolvida em Java EE que oferece uma solução completa para empresas do setor de pedras ornamentais. O sistema permite o gerenciamento eficiente de clientes, produtos comercializáveis, orçamentos e controle de estoque de chapas de granito.

### 🎯 Principais Funcionalidades

- **Gestão de Clientes**: Cadastro completo com dados pessoais e empresariais
- **Catálogo de Produtos**: Gerenciamento de itens comercializáveis com tipos e unidades
- **Sistema de Orçamentos**: Criação e controle de orçamentos com itens detalhados
- **Controle de Usuários**: Sistema de autenticação e autorização
- **Gestão Geográfica**: Controle de cidades e estados para endereçamento
- **Interface Responsiva**: Interface web moderna e intuitiva

## 🛠️ Stack Tecnológica

### Backend
- **Java 7** - Linguagem de programação principal
- **JSF 2.1 (Mojarra)** - Framework para interface web
- **Hibernate ORM** - Mapeamento objeto-relacional
- **JPA** - Especificação de persistência
- **Lombok** - Redução de código boilerplate

### Frontend
- **XHTML** - Linguagem de marcação
- **CSS3** - Estilização
- **JavaScript** - Interatividade

### Banco de Dados
- **MySQL 5.x** - Sistema de gerenciamento de banco de dados
- **MySQL Connector/J** - Driver JDBC

### Servidor de Aplicação
- **GlassFish 3.1.2** - Servidor de aplicação Java EE

### Ferramentas de Desenvolvimento
- **Eclipse IDE** - Ambiente de desenvolvimento
- **Maven** - Gerenciamento de dependências (implícito)

## 🏗️ Arquitetura do Sistema

O projeto segue o padrão **MVC (Model-View-Controller)** com uma arquitetura em camadas bem definida:

```
src/
├── entidade/          # Modelos de dados (JPA Entities)
├── dao/               # Camada de acesso a dados
├── controle/          # Controladores (Managed Beans)
├── util/              # Utilitários e configurações
└── teste/             # Testes unitários
```

### 📊 Modelo de Dados

O sistema possui as seguintes entidades principais:

- **Cliente**: Dados completos de clientes (PF/PJ)
- **Orcamento**: Controle de orçamentos e propostas
- **ItemOrcamento**: Itens detalhados dos orçamentos
- **Comercializavel**: Produtos e serviços oferecidos
- **Usuario**: Controle de acesso ao sistema
- **Cidade/UF**: Dados geográficos para endereçamento

## 🚀 Como Executar

### Pré-requisitos

- Java JDK 7 ou superior
- MySQL Server 5.x
- GlassFish Server 3.1.2
- Eclipse IDE (recomendado)

### Configuração do Banco de Dados

1. Crie um banco de dados MySQL:
```sql
CREATE DATABASE stonecontrol;
```

2. Configure as credenciais no arquivo `src/hibernate.cfg.xml`:
```xml
<property name="connection.username">root</property>
<property name="connection.password">mysql</property>
```

### Deploy da Aplicação

1. Clone o repositório
2. Importe o projeto no Eclipse
3. Configure o GlassFish Server
4. Execute o deploy da aplicação
5. Acesse: `http://localhost:8080/StoneControl`

## 📁 Estrutura do Projeto

```
StoneControl/
├── src/
│   ├── controle/      # Managed Beans (Controllers)
│   ├── dao/           # Data Access Objects
│   ├── entidade/      # JPA Entities
│   ├── util/          # Utilities & Configurations
│   └── teste/         # Unit Tests
├── WebContent/
│   ├── resources/     # CSS, JS, Images
│   ├── WEB-INF/       # Configuration Files
│   └── *.xhtml        # JSF Pages
├── resources/         # External Libraries
└── build/             # Compiled Classes
```

## 🔧 Funcionalidades Técnicas

### Segurança
- Sistema de autenticação de usuários
- Criptografia de senhas
- Filtros de segurança para controle de acesso

### Persistência
- Mapeamento JPA/Hibernate
- Transações automáticas
- Conexão pool configurável
- Auto-criação de tabelas

### Interface
- Componentes JSF reutilizáveis
- Validação client-side e server-side
- Navegação declarativa
- Templates responsivos

## 🧪 Testes

O projeto inclui testes unitários localizados em `src/teste/`:
- Testes de entidades
- Testes de funcionalidades principais


## 🤝 Contribuição

Contribuições são bem-vindas! Para contribuir:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`)
3. Commit suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. Push para a branch (`git push origin feature/AmazingFeature`)
5. Abra um Pull Request

## 📄 Licença

Este projeto está licenciado sob a Licença Apache 2.0 - veja o arquivo [LICENSE](LICENSE) para detalhes.

## 👨‍💻 Desenvolvedor

Desenvolvido com ❤️ para demonstrar expertise em:
- Desenvolvimento Java EE
- Arquitetura de software empresarial
- Padrões de design e boas práticas
- Integração de tecnologias web

---

⭐ Se este projeto foi útil para você, considere dar uma estrela!
