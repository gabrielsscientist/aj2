public class TesteRuntimeExceptions {

    public static void main(String[] args) {
        try {
            // Leitura do parametro digitado pelo usuario como parametro do main
            String parametro1 = args[0];
            int numero = Integer.parseInt(parametro1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Informe um parametro na execucao da classe.");
        } catch (NumberFormatException e) {
            System.out.println("Informe um parametro numerico na execucao da classe.");
        }
    }
}
