public class ManagerSupportHandler implements SupportHandler {
    private SupportHandler nextHandler;

    public ManagerSupportHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.type == Request.Type.CRITICAL) {
            System.out.println("Manager Support: Handling critical request: " + request.message);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Manager Support: Request not handled.");
        }
    }
}
