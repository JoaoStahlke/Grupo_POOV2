public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        System.out.println("Cachorro: " + cachorro.emitirSom());

        Animal gato = new Gato();
        System.out.println("Gato: " + gato.emitirSom());

        FormaGeometrica quadrado = new Quadrado(5);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        FormaGeometrica circulo = new Circulo(3);
        System.out.println("Área do círculo: " + circulo.calcularArea());

        Veiculo carro = new Carro();
        carro.acelerar();

        Veiculo moto = new Moto();
        moto.acelerar();

        Pessoa aluno = new Aluno();
        aluno.saudar();

        Pessoa professor = new Professor();
        professor.saudar();

        Animal2 peixe = new Peixe();
        peixe.movimentar();

        Animal2 ave = new Ave();
        ave.movimentar();

        Calculadora calculadora = new Calculadora();

        // Testando soma de dois inteiros
        int resultadoSomaInteiros = calculadora.soma(1, 2);
        System.out.println(resultadoSomaInteiros);

        // Testando soma de dois números de ponto flutuante
        double resultadoSomaDouble = calculadora.soma(1.5, 2.5);
        System.out.println(resultadoSomaDouble);

        // Testando soma de um inteiro e um número de ponto flutuante
        double resultadoSomaMisto = calculadora.soma(1, 2.5);
        System.out.println(resultadoSomaMisto);

        // Testando soma de uma matriz de inteiros
        int[] numeros = {1, 2, 3};
        int resultadoSomaArray = calculadora.soma(numeros);
        System.out.println(resultadoSomaArray);

        // Testando conversão de metros para centímetros
        double metros = 1.5;
        double centimetros = ConversorUnidades.converterMetrosParaCentimetros(metros);
        System.out.println(centimetros);

        // Testando conversão de quilogramas para gramas
        double quilogramas = 0.5;
        double gramas = ConversorUnidades.converterQuilogramasParaGramas(quilogramas);
        System.out.println(gramas);

        // Testando conversão de horas para minutos
        int horas = 2;
        int minutos = ConversorUnidades.converterHorasParaMinutos(horas);
        System.out.println(minutos);

// Testando concatenar duas strings
        String str1 = "Olá";
        String str2 = "Mundo!";
        String resultadoConcatenar2 = ManipuladorStrings.concatenar(str1, str2);
            System.out.println(resultadoConcatenar2);


        // Testando concatenar três strings
        String str3 = " Boa noite!";
        String resultadoConcatenar3 = ManipuladorStrings.concatenar(str1, str2, str3);
            System.out.println(resultadoConcatenar3);
        }
    }