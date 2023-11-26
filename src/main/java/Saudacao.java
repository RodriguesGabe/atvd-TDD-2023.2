public class Saudacao {

    public String saudacao(String... names) {
        if (names == null || names.length == 0 || names[0] == null) {
            return "Olá, compre uma rifa minha";
        }

        if (names.length == 1) {
            String name = names[0];
            if (name.equals(name.toUpperCase())) {
                return "OLÁ, " + name + "!";
            }
            return "Olá, " + name + "!";
        }

        StringBuilder builder = new StringBuilder("Olá");
        for (int i = 0; i < names.length; i++) {
            if (i == names.length - 1) {
                builder.append(" e ");
            } else if (i > 0) {
                builder.append(", ");
            }
            builder.append(names[i]);
        }
        builder.append("!");
        return builder.toString();
    }
}
