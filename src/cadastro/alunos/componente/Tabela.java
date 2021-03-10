/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastro.alunos.componente;

import cadastro.alunos.Eventos;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Administrador
 */
public class Tabela {
 
    JFrame frame = new JFrame();
    public Tabela(JFrame frame) {
        this.frame = frame;
    }

//Create columnTitle & Table Model 
    String[] columnTitle = { "Data 1", "Data 2", "Data 3", "Buttons " };
    DefaultTableModel model = new DefaultTableModel(columnTitle, 0);

    public Tabela(Eventos aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JTable sampleTable(){
            JTable _dataTable = new JTable(model) {
                @Override
                public void updateUI() {
                    super.updateUI();
                    setRowHeight(34);
                    setAutoCreateRowSorter(true);

     //------------ Placing button at your desired column ------------

                    TableColumn column;
                    column = getColumnModel().getColumn(3);
                    column.setCellRenderer(new TabelaModelo(frame).new viewRenderer());
                    column.setCellEditor(new TabelaModelo(frame).new ButtonsEditorView(this));
                }
            };
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);

       //-------- Adding data to your table row , use for loop for multiple data ---------

            model.addRow(new Object[]{"1","2","3"});
            return _dataTable;
    }

}
