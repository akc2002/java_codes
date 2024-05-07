class TestString
{
    public static void main(String[] args)
    {
        String s1 = new String("Arjun");
        String s2 = new String();
        int n;
        boolean x;
        char y;
        // n = s1.length();
        // System.out.println(n);
        // s2 = s1.toLowerCase();
        // System.out.println(s2);
        // s2 = s1.replace('A','K');
        // System.out.println(s2);
        // s1 = "  Arjun ";
        // System.out.println(s1);
        // s2 = s1.trim();//remove white space at the beggining and end of the string s1
        // System.out.println(s2);
        // s1 = "ArjuN" ;
        // x = s1.equals(s2);
        // System.out.println(x);
        // x = s1.equalsIgnoreCase(s2);
        // System.out.println(x);
        // y = s1.charAt(4);
        // System.out.println(y);
        s1 = "arjun";
        s2 = "kumar";
        n = s1.compareTo(s2);
        System.out.println(n);
        s2 = s1.concat(s2);
        System.out.println(s2);
        s2 = s1.substring(1);
        System.out.println(s2);
        s2 = s1.substring(1,3);
        System.out.println(s2);
        System.out.println(s2.indexOf('j'));
        s2.indexOf('j');
        s1 = "arjunkumar";
        System.out.println(s1.indexOf('r',1));
        
    }
}