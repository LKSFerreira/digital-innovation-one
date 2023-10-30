public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = System.console().readLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numeroDaConta = Integer.parseInt(System.console().readLine());

        System.out.println("Por favor, digite o nome do Titular: ");
        String nomeDoTitular = System.console().readLine();

        System.out.println("Por favor, digite o saldo da Conta: ");
        double saldo = Double.parseDouble(System.console().readLine());

        System.out.println("Olá " + nomeDoTitular + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo é de R$" + saldo + " já disponível para saque.");
    }
}
