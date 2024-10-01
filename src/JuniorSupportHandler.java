public class JuniorSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public JuniorSupportHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.type == Request.Type.SIMPLE) {
            System.out.println("Junior Support: Handling simple request: " + request.message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Junior Support: Request not handled.");
        }
    }
}
