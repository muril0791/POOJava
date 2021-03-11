package poolista2ex2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PooLista2Ex2 {

    public static void main(String[] args) {
        int opc = 0;
        int codigo;
        String nome;
        double percent;
        double desconto;
        double valorvenda;
        Vendedor vendedor = null;
        ArrayList<Vendedor> listaVendedor = new ArrayList<Vendedor>();
        while (opc != 3) {
            opc = Integer.parseInt(
                    JOptionPane.showInputDialog("" + "1 - Cadastrar Vendedor: " + " \n2 - Calcular Venda: " + "\n3 - Sair"));
            switch (opc) {
                case 1:
                    codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo"));
                    nome = JOptionPane.showInputDialog("Nome");
                    percent = Integer.parseInt(JOptionPane.showInputDialog("Percentual Comissão"));
                    vendedor = new Vendedor(codigo, nome, percent);
                    listaVendedor.add(vendedor);
                    break;
                case 2:
                    if (vendedor == null) {
                        JOptionPane.showMessageDialog(null, "Vendedor nao cadastrado");
                    } else {
                        codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do vendedor"));
                        valorvenda = Double.parseDouble(JOptionPane.showInputDialog("Valor de venda"));
                        desconto = Double.parseDouble(JOptionPane.showInputDialog("Desconto: "));
                        for (Vendedor vddr : listaVendedor) {
                            if (codigo == vddr.getCodigo()) {
                                JOptionPane.showMessageDialog(null, vddr.imprimir(valorvenda, desconto));
                            }
                        }
                    }
                    break;

                case 3:
                    break;
                default:

            }
        }
    }

}
