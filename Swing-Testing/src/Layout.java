
import java.awt.*;
import javax.swing.*;

public class Layout {

    private String layoutType;
    private String direction;
    private int gridRows;
    private int gridColumns;
    private LayoutManager layout;

    public Layout(String layoutType) {
        switch (layoutType.toLowerCase()) {
            case "flow":
                this.layoutType = layoutType;
                layout = new FlowLayout();
                this.direction = "center";
                break;
            case "border":
                this.layoutType = layoutType;
                layout = new BorderLayout();
                break;
            default:
                layout = null;
                this.layoutType = null;
                break;
        }
    }

    public Layout(String layoutType, String direction) {
        switch (layoutType.toLowerCase()) {
            case "flow":
                this.layoutType = layoutType;
                switch (direction.toLowerCase()) {
                    case "right":
                        this.direction = direction;
                        layout = new FlowLayout(FlowLayout.RIGHT);
                        break;
                    case "left":
                        this.direction = direction;
                        layout = new FlowLayout(FlowLayout.LEFT);
                        break;
                    case "leading":
                        this.direction = direction;
                        layout = new FlowLayout(FlowLayout.LEADING);
                        break;
                    case "trailing":
                        this.direction = direction;
                        layout = new FlowLayout(FlowLayout.TRAILING);
                        break;
                    default:
                        this.direction = "center";
                        layout = new FlowLayout(FlowLayout.CENTER);
                        break;
                }
                break;
            default:
                layout = null;
                this.layoutType = null;
                break;
        }
    }

    public Layout(String layoutType, int rows, int columns) {
        switch (layoutType.toLowerCase()) {
            case "grid":
                this.layoutType = layoutType;
                layout = new GridLayout(rows, columns);
                break;
            default:
                layout = null;
                this.layoutType = null;
                break;
        }
    }

    public Layout(String layoutType, JComponent comp) {
        switch (layoutType.toLowerCase()) {
            case "group":
                this.layoutType = layoutType;
                layout = new GroupLayout(comp);
                break;
            default:
                layout = null;
                this.layoutType = null;
                break;
        }
    }

    public String getLayoutType() {
        return layoutType;
    }

    public int getGridRows() {
        return gridRows;
    }

    public void setGridRows(int gridRows) {
        this.gridRows = gridRows;
    }

    public int getGridColumns() {
        return gridColumns;
    }

    public void setGridColumns(int gridColumns) {
        this.gridColumns = gridColumns;
    }

    public LayoutManager getLayout() {
        return layout;
    }

    public String getDirection() {
        return direction;
    }

    public void setFlowDirection(String direction) {
        if (!layoutType.equals("flow")) {
            System.out.println("Layout type needs to be \"flow\" to use this method!");
        }
        if (layout instanceof FlowLayout) {
            FlowLayout flow = (FlowLayout) layout;
            switch (direction.toLowerCase()) {
                case "left":
                    flow.setAlignment(FlowLayout.LEFT);
                    break;
                case "right":
                    flow.setAlignment(FlowLayout.RIGHT);
                    break;
                case "leading":
                    flow.setAlignment(FlowLayout.LEADING);
                    break;
                case "trailing":
                    flow.setAlignment(FlowLayout.TRAILING);
                    break;
                default:
                    flow.setAlignment(FlowLayout.CENTER);
                    break;
            }
        }
    }
}
