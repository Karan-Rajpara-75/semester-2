interface EventListener {
    void performEvent();
}
interface MouseListener extends EventListener {
    void mouseClicked();
    void mousePressed();
    void mouseReleased();
    void mouseMoved();
    void mouseDragged();
}
interface KeyListener extends EventListener {
    void keyPressed();
    void keyReleased();
}
public class BB implements MouseListener, KeyListener {
    @Override
    public void performEvent() {
        System.out.println("Event performed successfully!");
    }
    @Override
    public void mouseClicked() {
        System.out.println("Mouse Clicked Event");
    }
    @Override
    public void mousePressed() {
        System.out.println("Mouse Pressed Event");
    }
    @Override
    public void mouseReleased() {
        System.out.println("Mouse Released Event");
    }
    @Override
    public void mouseMoved() {
        System.out.println("Mouse Moved Event");
    }
    @Override
    public void mouseDragged() {
        System.out.println("Mouse Dragged Event");
    }
    @Override
    public void keyPressed() {
        System.out.println("Key Pressed Event");
    }
    @Override
    public void keyReleased() {
        System.out.println("Key Released Event");
    }

    public static void main(String[] args) {
        System.out.println("===== Event Listener Demonstration =====\n");
        BB demo = new BB();
        System.out.println("--- EventListener ---");
        demo.performEvent();
        System.out.println("\n--- MouseListener Events ---");
        demo.mouseClicked();
        demo.mousePressed();
        demo.mouseReleased();
        demo.mouseMoved();
        demo.mouseDragged();
        System.out.println("\n--- KeyListener Events ---");
        demo.keyPressed();
        demo.keyReleased();
        System.out.println("\n===== Demonstration Complete =====");
    }
}

