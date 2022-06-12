package lab06;

public class Lab06_4 {

    public static void main(String[] args) {
        String url, protocol, domain = new String();
        url = "https://google.com";
        protocol = url.substring(0, 5);
        domain = url.substring(url.length() - 4, url.length());

        System.out.println("Your link is " + url);
        System.out.println("The link contains https? " + protocol.equals("https"));
        System.out.println("The link contains .com? " + domain.equals(".com"));
        System.out.println("The link contains http? " + protocol.equals("http"));
        System.out.println("The link contains .net? " + domain.equals(".net"));

    }
}

