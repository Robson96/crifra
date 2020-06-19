package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        //se for nulo ele ja lançca a NUllPionter
        if (texto.isEmpty())
            throw new IllegalArgumentException();
        if (texto == null)
            throw new NullPointerException();

        StringBuilder builder = new StringBuilder();

        for (Character character: texto.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(character)) {
                builder.append((char) (((int)character) + 3));
            } else {
                builder.append(character);
            }
        }
        System.out.println(builder);
        return builder.toString().toLowerCase();
    }

    @Override
    public String descriptografar(String texto) {
        //se for nulo ele ja lançca a NUllPionter
        if (texto.isEmpty())
            throw new IllegalArgumentException();
        if (texto == null)
            throw new NullPointerException();

        StringBuilder builder = new StringBuilder();

        for (Character character: texto.toLowerCase().toCharArray()) {
            if (Character.isAlphabetic(character)) {
                builder.append((char) (((int)character) - 3));
            } else {
                builder.append(character);
            }
        }
        System.out.println(builder);
        return builder.toString().toLowerCase();
    }

}
