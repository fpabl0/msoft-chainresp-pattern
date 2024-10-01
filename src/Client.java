public class Client {
    public static void main(String[] args) {
        SupportHandler  support = new ManagerSupportHandler(null);
        support = new SeniorSupportHandler(support);
        support = new JuniorSupportHandler(support);

        support.handleRequest(new Request(Request.Type.SIMPLE, "some message 1"));
        support.handleRequest(new Request(Request.Type.COMPLEX, "some message 2"));
        support.handleRequest(new Request(Request.Type.CRITICAL, "some message 3"));
    }
}
