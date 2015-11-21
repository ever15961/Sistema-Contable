package SIC.Vistas.tableModels;

import SIC.Entidades.Cargo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class CargosTableModel extends AbstractTableModel {
   public List<Cargo> cargos= new ArrayList<>();
    
    @Override
    public int getRowCount(){
        return cargos.size();
    }
    

    @Override
    public int getColumnCount() {
       return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cargo cargo = cargos.get(rowIndex);
        Object valor = null;
        switch(columnIndex){
           case 0: valor = cargo.getSueldo();
            break;
            case 1: valor = cargo.getNombreCargo();
        }
        return valor;
    }
    
}
