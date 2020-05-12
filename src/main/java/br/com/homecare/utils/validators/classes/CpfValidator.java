package br.com.homecare.utils.validators.classes;

import br.com.homecare.utils.validators.interfaces.Cpf;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CpfValidator implements ConstraintValidator<Cpf, String> {
    private Pattern pattern =
            Pattern.compile("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");

    @Override
    public void initialize(Cpf constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value,
                           ConstraintValidatorContext context) {
        Matcher m = pattern.matcher(value);
        return m.matches() || this.validarCPF(value);
    }

    private boolean validarCPF(String strCpf){
        int iDigito1Aux = 0, iDigito2Aux = 0, iDigitoCPF;
        int iDigito1 = 0, iDigito2 = 0, iRestoDivisao = 0;
        String strDigitoVerificador, strDigitoResultado;

        if (! strCpf.substring(0,1).equals("")){
            try{
                strCpf = strCpf.replace('.',' ');
                strCpf = strCpf.replace('-',' ');
                strCpf = strCpf.replaceAll(" ","");
                for (int iCont = 1; iCont < strCpf.length() -1; iCont++) {
                    iDigitoCPF = Integer.valueOf(strCpf.substring(iCont -1, iCont)).intValue();
                    iDigito1Aux = iDigito1Aux + (11 - iCont) * iDigitoCPF;
                    iDigito2Aux = iDigito2Aux + (12 - iCont) * iDigitoCPF;
                }
                iRestoDivisao = (iDigito1Aux % 11);
                if (iRestoDivisao < 2) {
                    iDigito1 = 0;
                } else {
                    iDigito1 = 11 - iRestoDivisao;
                }
                iDigito2Aux += 2 * iDigito1;
                iRestoDivisao = (iDigito2Aux % 11);
                if (iRestoDivisao < 2) {
                    iDigito2 = 0;
                } else {
                    iDigito2 = 11 - iRestoDivisao;
                }
                strDigitoVerificador = strCpf.substring(strCpf.length()-2, strCpf.length());
                strDigitoResultado = String.valueOf(iDigito1) + String.valueOf(iDigito2);
                strDigitoVerificador.equals(strDigitoResultado);
                return true;
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

}