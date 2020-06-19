package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        if (texto.isEmpty())
            throw new IllegalArgumentException();

        StringBuilder builder = new StringBuilder();

        for (Character character: texto.toCharArray()) {
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
        if (texto.isEmpty())
            throw new IllegalArgumentException();

        StringBuilder builder = new StringBuilder();

        for (Character character: texto.toCharArray()) {
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
