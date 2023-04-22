import java.util.Random;

public class Password {
    private int lenght;
    private String password;



    public Password()
    {
        lenght = 0;
        password = "";
    }

    public Password(int lenght)
    {
        this.lenght = lenght;
        this.password = generatePassword();
    }

    /**
     * getters

     */
    public int getLenght() {
        return lenght;
    }

    public String getPassword() {
        return password;
    }




    /**
     * setter
     *
     * @return
     */

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public String generatePassword()
    {
        String pass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(lenght);

        for (int i  = 0 ; i < lenght ; i++)
        {
            int index = (int)(pass.length() * Math.random());
            sb.append(pass.charAt(index));
        }
        return sb.toString();
    }

    public boolean isStrong()
    {
        int lower = 0;
        int upper = 0;
        int number = 0;

        boolean strong = false;

        for(int i  = 0 ; i < password.length() ; i++)
        {
            if (Character.isLowerCase(password.charAt(i)))
            {
                lower += 1;
            }
            else if (Character.isUpperCase(password.charAt(i)))
            {
                upper +=1;
            }
            else
            {
                number +=1;
            }
        }

        if(lower>1 && upper>2 && number > 5)
        {
            strong = true;
        }
        return strong;
    }

}
