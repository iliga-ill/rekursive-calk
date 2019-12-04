public class RecursCompf {
    private static final int DEFSIZE = 255;
    private char[] str;
    private int index;

    private void compileF() {
        compileT();
        if (index >= str.length) return;
        if (str[index] == '+')
        {
            while(str[index] == '+'){
            index++;
            compileT();
            System.out.print("+ ");
            if (index >= str.length) return;
            }
            return;
        }
        if (str[index] == '-')
        {
            while(str[index] == '-') {
                index++;
                compileT();
                System.out.print("- ");
                if (index >= str.length) return;
            }
        }
    }
    private void compileT() {
        compileM();
        if (index >= str.length) return;
        if (str[index] == '*') {
            while(str[index] == '*') {
                index++;
                compileM();
                System.out.print("* ");
                if (index >= str.length) return;
            }
            return;
        }
        if (str[index] == '/') {
            while(str[index] == '/') {
                index++;
                compileM();
                System.out.print("/ ");
                if (index >= str.length) return;
            }
        }
    }

    private void compileM()
    {
        if ((str[index] == '('))
        {
            while(str[index] == '(') {
                index++;
                compileF();
                if (index >= str.length) return;
                index++;
                if (index >= str.length) return;

            }
        }
        else {compileV();}
    }

    private void compileV() {System.out.print("" + str[index++] + " "); }

    public RecursCompf() {str = new char[DEFSIZE];}

    public void compile(char[] str) {
        this.str = str;
        index = 0;
        compileF();
        System.out.print("\n");
        }

}
