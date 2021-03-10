/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.alunos.componente;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Administrador
 */
public class TabelaModelo extends Tabela {
       public TabelaModelo(JFrame frame) {
        super(frame);
    }


    class viewButton extends JPanel {
        public JButton viewbtnp = new JButton("View");
        protected viewButton() {
            setOpaque(true);
            setFocusable(false);
            add(viewbtnp);
        }
    }

    class viewRenderer implements TableCellRenderer {
        private final viewButton panel = new viewButton() {
            @Override
            public void updateUI() {
            super.updateUI();
            setName("Table.cellRenderer");
            }
        };

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
            int row, int column) {
            panel.setBackground(isSelected ? table.getSelectionBackground() : table.getBackground());
            return panel;
        }
    }

    class ViewAction extends AbstractAction {
        private final JTable table;

        protected ViewAction(JTable table) {
            super("view");
            this.table = table;     
        }

        @Override
        public void actionPerformed(ActionEvent e) {

        //--------------------------- Create your own function on what you want the button to do when button is clicked -------------
            System.out.println("Clicked ");
        }
    }

    class ButtonsEditorView extends AbstractCellEditor implements TableCellEditor {
        protected final viewButton panel = new viewButton();
        protected final JTable table;

        protected ButtonsEditorView(JTable table) {
            super();
            this.table = table;
            panel.viewbtnp.setAction(new ViewAction(table));
        }

        @Override
        public Component getTableCellEditorComponent(JTable tbl, Object value, boolean isSelected, int row,
            int column) {
            panel.setBackground(tbl.getSelectionBackground());
            return panel;
        }

        @Override
        public Object getCellEditorValue() {
            return "";
        }
    }
}
