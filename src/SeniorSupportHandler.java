public class SeniorSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public SeniorSupportHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.type == Request.Type.COMPLEX) {
            System.out.println("Senior Support: Handling complex request: " + request.message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Senior Support: Request not handled.");
        }
    }
}
