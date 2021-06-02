package bbideal;

public class menuForm extends javax.swing.JFrame {
    public menuForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnBerat = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBerat.setText("BERAT");
        btnBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeratActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(btnBerat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnBerat))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        pack();
    }

    private void btnBeratActionPerformed(java.awt.event.ActionEvent evt) 
        bbideal formbb = new bbideal();
        formbb.setVisible(true);
        this.dispose();
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) 
        System.exit(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuForm().setVisible(true);
            }
        });
    }
    private javax.swing.JButton btnBerat;
    private javax.swing.JButton btnExit;
}