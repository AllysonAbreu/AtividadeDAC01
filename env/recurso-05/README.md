### Executando Banco
Seguir o passos:

Gerar a build da imagem:
```
sudo docker image build banco -t r5-db
```
Criar e executar o container:
```
sudo docker run -d --name ativ_bd r5-db
```