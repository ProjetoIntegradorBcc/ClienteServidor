package regraDeNegocio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Valida um ip de acordo com uma expressao regular.
 * Baseado em http://www.mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/
 * @author diogo
 */
public class ValidadorIP {

    /**
     * Versao compilada da REGEX.
     */
    private final Pattern pattern;
    /**
     * Classe que trata a REGEX.
     */
    private Matcher matcher;

    /**
     * Constante contendo a expressao regular formatada.
     */
    private static final String REGEX =
        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
        +"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
        +"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\."
        +"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    /**
     * Contrutor da classe ValidadorIP.
     */
    public ValidadorIP(){
        pattern = Pattern.compile(REGEX);
    }

   /**
    * Valida o ip com um expressao regular.
    * @param ip ip a ser validado
    * @return verdadeiro se valido, falso se invalido
    */
    public boolean validaIP(final String ip){
        matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
