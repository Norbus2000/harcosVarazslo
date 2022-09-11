package nezet;

import static javax.swing.JOptionPane.showMessageDialog;
import modell.Karakter;

public class Gui extends javax.swing.JFrame {

    Karakter harcos = new Karakter();
    Karakter varazslo = new Karakter();

    public Gui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        harcosL = new javax.swing.JLabel();
        varazsloL = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        harcosHpLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        varazsloHPLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        harcosSebzesLabel = new javax.swing.JLabel();
        varazsloSebzesLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        visszaJelzes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Harcos és varázsló játék");

        harcosL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/jo_harcos-arc.jpg"))); // NOI18N

        varazsloL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/2011-05-12_varazslo.jpg"))); // NOI18N

        jButton1.setText("Kezdés");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("A játék lényege hogy 3 elemű pályán van 2 karakter és harcolnak egymással. Minden körben véletlenszerű\nhelyre kerülnek, akkor harcolnak, ha ugyanarra a mezőre léptek. Akkor van vége a játéknak,\nha az egyiknek elfogyott az életereje.");
        jScrollPane1.setViewportView(jTextArea1);

        harcosHpLabel.setText(String.valueOf(harcos.getEletero())
        );

        jLabel3.setText("HP");

        jLabel5.setText("HP");

        varazsloHPLabel.setText(String.valueOf(varazslo.getEletero())
        );

        jLabel7.setText("Sebzés");

        jLabel8.setText("Sebzés");

        harcosSebzesLabel.setText(String.valueOf(harcos.getTamadas())
        );

        varazsloSebzesLabel.setText(String.valueOf(varazslo.getTamadas()));

        visszaJelzes.setColumns(20);
        visszaJelzes.setRows(5);
        visszaJelzes.setText("Itt fognak megjelenni a statok");
        jScrollPane2.setViewportView(visszaJelzes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(harcosL, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(harcosHpLabel)
                                    .addComponent(jLabel7)
                                    .addComponent(harcosSebzesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(240, 240, 240)
                                        .addComponent(jButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(varazsloHPLabel)
                            .addComponent(jLabel8)
                            .addComponent(varazsloSebzesLabel)
                            .addComponent(varazsloL, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(68, 68, 68)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harcosL, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(varazsloL, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jButton1)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harcosHpLabel)
                    .addComponent(varazsloHPLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harcosSebzesLabel)
                    .addComponent(varazsloSebzesLabel))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText("Következő kör");
        helyBeallit();
        harc();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

    }//GEN-LAST:event_jButton1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel harcosHpLabel;
    private javax.swing.JLabel harcosL;
    private javax.swing.JLabel harcosSebzesLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel varazsloHPLabel;
    private javax.swing.JLabel varazsloL;
    private javax.swing.JLabel varazsloSebzesLabel;
    private javax.swing.JTextArea visszaJelzes;
    // End of variables declaration//GEN-END:variables

    private void harc() {
        int harcosHely = harcos.getHely();
        int varazsloHely = varazslo.getHely();
        int varazsloHP = varazslo.getEletero();
        int harcosHP = harcos.getEletero();
        int harcosSebzes = harcos.getTamadas();
        int varazsloSebzes = varazslo.getTamadas();

        if (varazsloHely == harcosHely) {
            varazsloHP = varazsloHP - harcosSebzes;
            harcosHP = harcosHP - varazsloSebzes;
            varazslo.setEletero(varazsloHP - harcosSebzes);
            harcos.setEletero(harcosHP - varazsloSebzes);
            visszaJelzes.setText("A harc megtörtént!\nAz új értékek: \nHarcos HP :" + harcosHP + "\n" + "Varázsló HP" + varazsloHP);
            harcosHpLabel.setText(String.valueOf(harcosHP));
            varazsloHPLabel.setText(String.valueOf(varazsloHP));

        } else {
            visszaJelzes.setText("Nem találkoztak!");
        }

        if (harcosHP <= 0) {
            showMessageDialog(null, "A varazsló nyert");
        } else if (varazsloHP <= 0) {
            showMessageDialog(null, "A harcos nyert");
        } else if (varazsloHP <= 0 && harcosHP <= 0) {
            showMessageDialog(null, "Döntetlen");
        }
    }

    
    
    private void helyBeallit() {
        harcos.setHely();    
        varazslo.setHely();
    }

}
