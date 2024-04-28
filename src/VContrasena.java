import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class VContrasena {
    private static final String EXPRESION_REGULAR = "^(?=.*[0-9])(?=.*[a-z]{3,})(?=.*[A-Z]{2,})(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
    private static final Pattern PATRON = Pattern.compile(EXPRESION_REGULAR);

    public static boolean validarContrasena(String contrasena) {
        Matcher matcher = PATRON.matcher(contrasena);
        return matcher.matches();
    }
}