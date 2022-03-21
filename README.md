# Atividade Colaborativa 01

Este repositório contém as resoluções para a primeira atividade correspondente às atividades colaborativas de DAC-2021.2.

# Teste de objetivos de aprendizagem

# 1  - Qual a diferença entre image e container?

Imagem é um pacote de arquivos e contêiner é um processo que os executa. Ou seja, no Docker, uma imagem é um conjunto de arquivos contendo as dependências que são necessárias para a execução de um processo, ou seja, bibliotecas, pacotes, dentre outros recursos. Dessa forma, as imagens são bases para execução de contêineres. Estes últimos utilizam de uma visão de uma imagem existente, sendo que esta pode ser utilizada como base para execução de processos em vários contêineres simultaneamente. 

# 2 - Qual a diferença entre os comandos COPY, EXPOSE e ADD?

EXPOSE é um comando do docker utilizado para indiciar qual porta deverá ser liberada para a criação de um contêiner. A execução desse comando não libera a porta, mas registra dentro do Dockerfile qual a porta que deverá ser utilizada pelo contêiner. 
Já os comandos COPY e ADD, ambos são utilizados para copiar arquivos e pastas de uma máquina para um contêiner. Entretanto, o comando ADD consegue copiar também arquivos remotos e compactados. Assim sendo, o padrão mais comum é utilizar COPY para realizar a cópia de arquivos locais, e e comando ADD especificamente para arquivos remotos ou que estejam compactados.

# 3 - Qual a diferença entre os comandos RUN, CMD e ENTRYPOINT?

O comando RUN pode ser utilizado para instalar os pacotes necessários para utilizar a aplicação. Assim, vai ser responsável por fazer o build da imagem em questão, e executar os seus comandos principais, para criar uma nova camada com essa imagem como base.
O comando CMD é utilizado para estabelecer um comando padrão que será executado quando um contêiner docker for inicializado com o comando RUN, mesmo que este comando estabelecido não seja especificado por quem realizou a execução. 
Já o ENTRYPOINT permite realizar a configuração de um contêiner para que este possa ser executável, também estabelecendo um comando padrão para ser executado quando o contêiner for inicializado. Difere do CMD porque neste, se algum comando for especificado durante a inicialização do contêiner, o comando padrão será ignorado, sendo que no ENTRYPOINT isso não acontece.

# 4 – Qual a diferença entre as estratégias de shell e exec?

A estratégia exec é utilizada para realizar um novo comando dentro de um contêiner que já esteja rodando. Este só será realizado enquanto o processo primário do contêiner estiver em andamento, e não será reinicializado junto com o contêiner. Já a estratégia Shell é utilizada para que o shell utilizado como padrão no docker para estabelecer os tipos de comando seja sobreescrito por outro shell com instruções escritas em formato JSON dentro do Dockerfile.

# 5 – Qual a diferença entre os comandos docker stop <container_id> e docker kill <container_id>?

Tanto o docker stop quanto o docker kill servem para parar a execução dos contêineres, entretanto o comando docker kill realiza essa função de forma mais abrupta, parando a execução imediatamente, enquanto que o docker stop envia por padrão um sinal de requisição para fechar a execução principal do contêiner, com um tempo de limite de espera, e só após esse período é que tentará forçar a interrupção da execução do contêiner.

### Diretórios
- diretorio-01: este container compila e executa uma classe Java.
- diretorio-02: este container executa um arquivo .jar que contém a classe Java como sendo a classe principal.
- diretorio-03: estes contêineres fazem uma comunicação entre uma aplicação web e um banco de dados.
- diretorio-04: este container mantem um diretório compartilhado (entre outros containers e o host) com os dados persistentes da image do PostgreSQL.
- diretorio-05: este container executa a aplicação da _Atividade prática_.

### Atividade prática

No diretório `src`, há os códigos que cumprem os requisítos propostos.
