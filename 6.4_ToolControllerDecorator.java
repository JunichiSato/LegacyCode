abstract class ToolControllerDecorator extends ToolController
{
    protected ToolController controller;
    public ToolControllerDecorator(ToolController controller) {
        this.controller = controller;
    }
    public void raise() { controller.raise(); }
    public void lower() { controller.lower(); }
    public void step() {controller.step(); }
    public void on() {controller.on(); }
    public void off() {controller.off(); }
}

public class StepNotifyingController extends ToolControllerDecorator
{
    private List notifyees;
    public StepNotifyingController(ToolController controller, List notifyees) {
        super(controller);
        this.notifyees = notifyees;
    }
    public void step() {
        // ここで、全ての通知待ちオブジェクト(notifyees)に通知する
        ...
        controller.step();
    }
}