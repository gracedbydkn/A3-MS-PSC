package com.mycompany.classes;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class CheckboxRenderer extends JCheckBox implements TableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        setSelected(value != null && (Boolean) value);
        setHorizontalAlignment(CENTER);
        return this;
    }
}
