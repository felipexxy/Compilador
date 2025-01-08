plugins {
    // Plugin para aplicações Java.
    application

    // Plugin para suporte ao ANTLR.
    antlr
}

repositories {
    // Repositório Maven Central para resolução de dependências.
    mavenCentral()
}

dependencies {
    // Dependências de testes.
    testImplementation(libs.junit.jupiter)
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // Dependência de exemplo fornecida.
    implementation(libs.guava)

    // Dependências do ANTLR.
    antlr("org.antlr:antlr4:4.13.0") // Atualizado para a versão mais recente.
    implementation("org.antlr:antlr4-runtime:4.13.0")
}

java {
    // Configuração da versão da linguagem Java.
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

application {
    // Define a classe principal da aplicação.
    mainClass = "fejosa.Jofel"
}

tasks.named<Test>("test") {
    // Configura o uso do JUnit Platform para testes.
    useJUnitPlatform()
}

tasks.jar {
    // Configura o manifest para definir a classe principal.
    manifest {
        attributes(mapOf("Main-Class" to application.mainClass))
    }
}

tasks.generateGrammarSource {
    arguments = listOf("-visitor", "-no-listener")
    source = fileTree("src/main/antlr").matching { include("**/*.g4") }
}

sourceSets {
    main {
        // Adiciona o diretório de saída padrão do ANTLR como fonte do projeto.
        java.srcDirs("app/src/main/antlr")
    }
}
