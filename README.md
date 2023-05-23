# Projeto Java com Selenium WebDriver

Este é um projeto Java de exemplo que utiliza a tecnologia Selenium WebDriver para realizar testes automatizados em um navegador web.

## Pré-requisitos

Certifique-se de ter o seguinte software instalado em seu sistema:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Apache Maven](https://maven.apache.org/download.cgi)
- Um IDE Java de sua escolha (recomendado: [Eclipse](https://www.eclipse.org/downloads/) ou [IntelliJ IDEA](https://www.jetbrains.com/idea/download/))
- [WebDriver executável](https://www.selenium.dev/documentation/en/webdriver/driver_requirements/) adequado para o navegador de sua escolha (por exemplo, [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/))

## Configuração do projeto

1. Clone o repositório para o seu sistema local:
2. Importe o projeto em seu IDE Java.
3. Configure o WebDriver executável:
- Faça o download do WebDriver adequado para o navegador que você deseja utilizar.
- Adicione o caminho do WebDriver ao seu sistema PATH.
- No arquivo de código-fonte do projeto (`src/main/java/SeuTeste.java`), certifique-se de atualizar o caminho do WebDriver para o local correto em sua máquina:

  ```java
  System.setProperty("webdriver.chrome.driver", "/caminho/para/chromedriver");
  ```

