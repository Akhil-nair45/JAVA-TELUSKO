public class demo {
    //demo.java is for string bcoz on giving string name to class it is creating an error like below so we have created a class with demo  name instead of string.java
    // https://stackoverflow.com/questions/46744956/type-missmatch-cannot-convert-from-java-lang-string-to-string
    // https://stackoverflow.com/questions/20268262/error-main-method-not-found-in-class-calculate-please-define-the-main-method-a
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Akhil");
        System.out.println(sb.length());
        sb.charAt(1);
        
    }
}

