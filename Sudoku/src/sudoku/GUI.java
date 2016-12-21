package sudoku;

import javax.swing.JOptionPane;

/**
 * Define la clase GUI.
 * Tiene como atributos: <ul>
 * <li> Los diferentes botones, "Solve" y "Clear".</li>
 * <li> Los TextField para mostrar los resultados, un TextField por casilla del sudoku </li>
 * </ul>
 * @author CARLOS OCTAVIO ORDAZ BERNAL
 * @author ALFREDO LOZANO ORTEGA
 * @author GUILLERMO CARMONA OLIVERA
 */
public class GUI<T> extends javax.swing.JFrame {

    /**
     * Constructor que inicializa una GUI nueva
     */
    public GUI() {
        initComponents();
    }

    /**
     * Incializa todos los elementos que están dentro de la GUI
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        L1C1 = new javax.swing.JTextField();
        L1C2 = new javax.swing.JTextField();
        L1C3 = new javax.swing.JTextField();
        L1C4 = new javax.swing.JTextField();
        L1C5 = new javax.swing.JTextField();
        L1C6 = new javax.swing.JTextField();
        L1C7 = new javax.swing.JTextField();
        L1C8 = new javax.swing.JTextField();
        L1C9 = new javax.swing.JTextField();
        L2C1 = new javax.swing.JTextField();
        L2C2 = new javax.swing.JTextField();
        L2C3 = new javax.swing.JTextField();
        L2C4 = new javax.swing.JTextField();
        L2C5 = new javax.swing.JTextField();
        L2C6 = new javax.swing.JTextField();
        L2C7 = new javax.swing.JTextField();
        L2C8 = new javax.swing.JTextField();
        L2C9 = new javax.swing.JTextField();
        L3C5 = new javax.swing.JTextField();
        L3C6 = new javax.swing.JTextField();
        L3C8 = new javax.swing.JTextField();
        L3C7 = new javax.swing.JTextField();
        L3C3 = new javax.swing.JTextField();
        L3C4 = new javax.swing.JTextField();
        L3C1 = new javax.swing.JTextField();
        L3C9 = new javax.swing.JTextField();
        L3C2 = new javax.swing.JTextField();
        L5C6 = new javax.swing.JTextField();
        L5C4 = new javax.swing.JTextField();
        L5C5 = new javax.swing.JTextField();
        L5C2 = new javax.swing.JTextField();
        L5C3 = new javax.swing.JTextField();
        L4C9 = new javax.swing.JTextField();
        L5C1 = new javax.swing.JTextField();
        L4C8 = new javax.swing.JTextField();
        L5C8 = new javax.swing.JTextField();
        L5C7 = new javax.swing.JTextField();
        L5C9 = new javax.swing.JTextField();
        L6C1 = new javax.swing.JTextField();
        L6C2 = new javax.swing.JTextField();
        L6C3 = new javax.swing.JTextField();
        L6C4 = new javax.swing.JTextField();
        L6C5 = new javax.swing.JTextField();
        L6C6 = new javax.swing.JTextField();
        L6C7 = new javax.swing.JTextField();
        L4C7 = new javax.swing.JTextField();
        L6C8 = new javax.swing.JTextField();
        L4C4 = new javax.swing.JTextField();
        L4C3 = new javax.swing.JTextField();
        L4C2 = new javax.swing.JTextField();
        L6C9 = new javax.swing.JTextField();
        L4C1 = new javax.swing.JTextField();
        L4C6 = new javax.swing.JTextField();
        L4C5 = new javax.swing.JTextField();
        L8C6 = new javax.swing.JTextField();
        L8C4 = new javax.swing.JTextField();
        L8C5 = new javax.swing.JTextField();
        L8C2 = new javax.swing.JTextField();
        L8C3 = new javax.swing.JTextField();
        L7C9 = new javax.swing.JTextField();
        L8C1 = new javax.swing.JTextField();
        L7C8 = new javax.swing.JTextField();
        L8C8 = new javax.swing.JTextField();
        L8C7 = new javax.swing.JTextField();
        L8C9 = new javax.swing.JTextField();
        L9C1 = new javax.swing.JTextField();
        L9C2 = new javax.swing.JTextField();
        L9C3 = new javax.swing.JTextField();
        L9C4 = new javax.swing.JTextField();
        L9C5 = new javax.swing.JTextField();
        L9C6 = new javax.swing.JTextField();
        L9C7 = new javax.swing.JTextField();
        L7C7 = new javax.swing.JTextField();
        L9C8 = new javax.swing.JTextField();
        L7C4 = new javax.swing.JTextField();
        L7C3 = new javax.swing.JTextField();
        L7C2 = new javax.swing.JTextField();
        L9C9 = new javax.swing.JTextField();
        L7C1 = new javax.swing.JTextField();
        L7C6 = new javax.swing.JTextField();
        L7C5 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btClear = new javax.swing.JButton();
        btSolve = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SUDOKU"));

        L1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1C1ActionPerformed(evt);
            }
        });

        L2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L2C1ActionPerformed(evt);
            }
        });

        L3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L3C1ActionPerformed(evt);
            }
        });

        L5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L5C4ActionPerformed(evt);
            }
        });

        L5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L5C1ActionPerformed(evt);
            }
        });

        L6C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L6C1ActionPerformed(evt);
            }
        });

        L4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L4C1ActionPerformed(evt);
            }
        });

        L8C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L8C1ActionPerformed(evt);
            }
        });

        L9C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L9C1ActionPerformed(evt);
            }
        });

        L7C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L7C1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L9C1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(L8C1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L7C1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L6C1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L5C1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L4C1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L3C1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L1C1)
                    .addComponent(L2C1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L9C2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(L8C2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L7C2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L6C2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L5C2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L4C2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L3C2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L1C2)
                    .addComponent(L2C2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L9C3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(L8C3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L7C3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L6C3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L5C3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L4C3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L3C3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L1C3)
                    .addComponent(L2C3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L6C4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(L5C4)
                            .addComponent(L4C4)
                            .addComponent(L3C4)
                            .addComponent(L1C4)
                            .addComponent(L2C4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L8C4)
                            .addComponent(L7C4)
                            .addComponent(L9C4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L7C5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(L6C5)
                    .addComponent(L5C5)
                    .addComponent(L4C5)
                    .addComponent(L3C5)
                    .addComponent(L1C5)
                    .addComponent(L2C5)
                    .addComponent(L8C5)
                    .addComponent(L9C5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L9C6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(L8C6)
                    .addComponent(L7C6)
                    .addComponent(L6C6)
                    .addComponent(L5C6)
                    .addComponent(L4C6)
                    .addComponent(L3C6)
                    .addComponent(L1C6)
                    .addComponent(L2C6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(L5C7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(L4C7)
                            .addComponent(L1C7)
                            .addComponent(L2C7)
                            .addComponent(L3C7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L7C7)
                            .addComponent(L6C7)
                            .addComponent(L8C7)
                            .addComponent(L9C7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L6C8, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(L5C8)
                    .addComponent(L4C8)
                    .addComponent(L1C8)
                    .addComponent(L2C8)
                    .addComponent(L3C8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L7C8)
                    .addComponent(L8C8)
                    .addComponent(L9C8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(L6C9, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(L1C9)
                    .addComponent(L2C9)
                    .addComponent(L3C9)
                    .addComponent(L4C9)
                    .addComponent(L5C9)
                    .addComponent(L8C9)
                    .addComponent(L7C9)
                    .addComponent(L9C9))
                .addContainerGap(18, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L1C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L1C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L2C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L3C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L3C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L4C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L4C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L5C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L5C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L6C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L6C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L7C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L7C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L7C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L7C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L7C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L7C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L7C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(L7C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(L7C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L8C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L8C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L9C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L9C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L9C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L9C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L9C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L9C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L9C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L9C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L9C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btSolve.setText("Solve");
        btSolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSolveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSolve)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSolve)
                    .addComponent(btClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L1C1ActionPerformed

    private void L2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L2C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L2C1ActionPerformed

    private void L3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L3C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L3C1ActionPerformed

    private void L5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L5C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L5C1ActionPerformed

    private void L6C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L6C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L6C1ActionPerformed

    private void L4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L4C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L4C1ActionPerformed

    private void L8C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L8C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L8C1ActionPerformed

    private void L9C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L9C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L9C1ActionPerformed

    private void L7C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L7C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L7C1ActionPerformed

    private void L5C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L5C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_L5C4ActionPerformed

    /**
     * Método que borra el contenido de las casillas del sudoku, asignado a un botón con su escuchador.
     * @param evt - ActionEvent, cuando el botón es presionado se ejecuta el "Clear"
     */
    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        //Borrar primera línea...
                L1C1.setText("");
                L1C2.setText("");
                L1C3.setText("");
                L1C4.setText("");
                L1C5.setText("");
                L1C6.setText("");
                L1C7.setText("");
                L1C8.setText("");
                L1C9.setText("");
                
        //Borrar segunda línea...
                
                L2C1.setText("");
                L2C2.setText("");
                L2C3.setText("");
                L2C4.setText("");
                L2C5.setText("");
                L2C6.setText("");
                L2C7.setText("");
                L2C8.setText("");
                L2C9.setText("");
        
        //Borrar tercera línea...        
                L3C1.setText("");
                L3C2.setText("");
                L3C3.setText("");
                L3C4.setText("");
                L3C5.setText("");
                L3C6.setText("");
                L3C7.setText("");
                L3C8.setText("");
                L3C9.setText("");
                
        //4ta...        
                L4C1.setText("");
                L4C2.setText("");
                L4C3.setText("");
                L4C4.setText("");
                L4C5.setText("");
                L4C6.setText("");
                L4C7.setText("");
                L4C8.setText("");
                L4C9.setText("");
                
                
        //5ta...        
                L5C1.setText("");
                L5C2.setText("");
                L5C3.setText("");
                L5C4.setText("");
                L5C5.setText("");
                L5C6.setText("");
                L5C7.setText("");
                L5C8.setText("");
                L5C9.setText("");
                
        //6ta...        
                L6C1.setText("");
                L6C2.setText("");
                L6C3.setText("");
                L6C4.setText("");
                L6C5.setText("");
                L6C6.setText("");
                L6C7.setText("");
                L6C8.setText("");
                L6C9.setText("");
                
        //7...      
                L7C1.setText("");
                L7C2.setText("");
                L7C3.setText("");
                L7C4.setText("");
                L7C5.setText("");
                L7C6.setText("");
                L7C7.setText("");
                L7C8.setText("");
                L7C9.setText("");
                
        //8...        
                L8C1.setText("");
                L8C2.setText("");
                L8C3.setText("");
                L8C4.setText("");
                L8C5.setText("");
                L8C6.setText("");
                L8C7.setText("");
                L8C8.setText("");
                L8C9.setText("");
                
        //9...        
                L9C1.setText("");
                L9C2.setText("");
                L9C3.setText("");
                L9C4.setText("");
                L9C5.setText("");
                L9C6.setText("");
                L9C7.setText("");
                L9C8.setText("");
                L9C9.setText("");
                
    }//GEN-LAST:event_btClearActionPerformed

    /**
     * Método que permite la resolución del sudoku.
     * @param evt - ActionEvent, empieza a validar y a resolver cuando se presiona el botón "Solve"
     */
    private void btSolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSolveActionPerformed
 
        int mat[][]=volverMat();
              
        if(mat[0][0] == -11){
            JOptionPane.showMessageDialog(null, "¡Error en el Sudoku!");
        }
        else{
            Sudoku su = new Sudoku(mat);
            boolean resp = su.getExecution();
            if(resp){
                su.solve();
                suMat(su);
            }
            else{
                JOptionPane.showMessageDialog(null, "¡Error en el Sudoku!");
            }            
        }

    }//GEN-LAST:event_btSolveActionPerformed
    
    /**
     * Método que convierte el texto de la GUI en número para crear un arreglo bidimensional.
     * @return matN - int[][], la matriz de integers con los valores del sudoku.
     */
    public int[][] volverMat(){
        String[][] mat=new String[9][9];
        
        mat[0][0]=L1C1.getText();
        mat[0][1]=L1C2.getText();
        mat[0][2]=L1C3.getText();
        mat[0][3]=L1C4.getText();
        mat[0][4]=L1C5.getText();
        mat[0][5]=L1C6.getText();
        mat[0][6]=L1C7.getText();
        mat[0][7]=L1C8.getText();
        mat[0][8]=(L1C9.getText());
        
        mat[1][0]=(L2C1.getText());
        mat[1][1]=(L2C2.getText());
        mat[1][2]=(L2C3.getText());
        mat[1][3]=(L2C4.getText());
        mat[1][4]=(L2C5.getText());
        mat[1][5]=(L2C6.getText());
        mat[1][6]=(L2C7.getText());
        mat[1][7]=(L2C8.getText());
        mat[1][8]=(L2C9.getText());
        
        mat[2][0]=(L3C1.getText());
        mat[2][1]=(L3C2.getText());
        mat[2][2]=(L3C3.getText());
        mat[2][3]=(L3C4.getText());
        mat[2][4]=(L3C5.getText());
        mat[2][5]=(L3C6.getText());
        mat[2][6]=(L3C7.getText());
        mat[2][7]=(L3C8.getText());
        mat[2][8]=(L3C9.getText());
        
        
        mat[3][0]=(L4C1.getText());
        mat[3][1]=(L4C2.getText());
        mat[3][2]=(L4C3.getText());
        mat[3][3]=(L4C4.getText());
        mat[3][4]=(L4C5.getText());
        mat[3][5]=(L4C6.getText());
        mat[3][6]=(L4C7.getText());
        mat[3][7]=(L4C8.getText());
        mat[3][8]=(L4C9.getText());
        
        mat[4][0]=(L5C1.getText());
        mat[4][1]=(L5C2.getText());
        mat[4][2]=(L5C3.getText());
        mat[4][3]=(L5C4.getText());
        mat[4][4]=(L5C5.getText());
        mat[4][5]=(L5C6.getText());
        mat[4][6]=(L5C7.getText());
        mat[4][7]=(L5C8.getText());
        mat[4][8]=(L5C9.getText());
        
        mat[5][0]=(L6C1.getText());
        mat[5][1]=(L6C2.getText());
        mat[5][2]=(L6C3.getText());
        mat[5][3]=(L6C4.getText());
        mat[5][4]=(L6C5.getText());
        mat[5][5]=(L6C6.getText());
        mat[5][6]=(L6C7.getText());
        mat[5][7]=(L6C8.getText());
        mat[5][8]=(L6C9.getText());
        
        mat[6][0]=(L7C1.getText());
        mat[6][1]=(L7C2.getText());
        mat[6][2]=(L7C3.getText());
        mat[6][3]=(L7C4.getText());
        mat[6][4]=(L7C5.getText());
        mat[6][5]=(L7C6.getText());
        mat[6][6]=(L7C7.getText());
        mat[6][7]=(L7C8.getText());
        mat[6][8]=(L7C9.getText());
        
        mat[7][0]=(L8C1.getText());
        mat[7][1]=(L8C2.getText());
        mat[7][2]=(L8C3.getText());
        mat[7][3]=(L8C4.getText());
        mat[7][4]=(L8C5.getText());
        mat[7][5]=(L8C6.getText());
        mat[7][6]=(L8C7.getText());
        mat[7][7]=(L8C8.getText());
        mat[7][8]=(L8C9.getText());
        
        mat[8][0]=(L9C1.getText());
        mat[8][1]=(L9C2.getText());
        mat[8][2]=(L9C3.getText());
        mat[8][3]=(L9C4.getText());
        mat[8][4]=(L9C5.getText());
        mat[8][5]=(L9C6.getText());
        mat[8][6]=(L9C7.getText());
        mat[8][7]=(L9C8.getText());
        mat[8][8]=(L9C9.getText());

        int[][] matN=new int[9][9];
        int i=0;
        int j=0;
        String aux;
        int num;
        while(i<9){
            while(j<9){
                aux=mat[i][j];
                    try{
                        num=Integer.parseInt(aux);
                        matN[i][j]=num;
                        if(matN[i][j] < 0){
                            matN[0][0] = -11;
                        }
                    }catch(NumberFormatException nfe){
                        if(!aux.equals("") && !aux.equals(" ")){
                            matN[0][0]=-11;
                            i=9;
                            j=9;
                        }
                    }
                j++;
            }
            j=0;
            i++;
        }
        
        return matN;
    }
    
    /**
     * Método que pasa la matriz a la GUI al final de la solución.
     * @param su - Sudoku, es el sudoku que se construyó y se resolvió.
     */
    private void suMat(Sudoku su) {
               
        for (int x=0; x < su.matriz.length; x++) {
            for (int y=0; y < su.matriz[x].length; y++) {
                if(su.matriz[x][y] < 0){
                    su.matriz[x][y] = su.matriz[x][y] * -1;
                }
            }
        }
    
        L1C1.setText("" + su.matriz[0][0]);
        L1C2.setText("" + su.matriz[0][1]);
        L1C3.setText("" + su.matriz[0][2]);
        L1C4.setText("" + su.matriz[0][3]);
        L1C5.setText("" + su.matriz[0][4]);
        L1C6.setText("" + su.matriz[0][5]);
        L1C7.setText("" + su.matriz[0][6]);
        L1C8.setText("" + su.matriz[0][7]);
        L1C9.setText("" + su.matriz[0][8]);

        L2C1.setText("" + su.matriz[1][0]);
        L2C2.setText("" + su.matriz[1][1]);
        L2C3.setText("" + su.matriz[1][2]);
        L2C4.setText("" + su.matriz[1][3]);
        L2C5.setText("" + su.matriz[1][4]);
        L2C6.setText("" + su.matriz[1][5]);
        L2C7.setText("" + su.matriz[1][6]);
        L2C8.setText("" + su.matriz[1][7]);
        L2C9.setText("" + su.matriz[1][8]);

        L3C1.setText("" + su.matriz[2][0]);
        L3C2.setText("" + su.matriz[2][1]);
        L3C3.setText("" + su.matriz[2][2]);
        L3C4.setText("" + su.matriz[2][3]);
        L3C5.setText("" + su.matriz[2][4]);
        L3C6.setText("" + su.matriz[2][5]);
        L3C7.setText("" + su.matriz[2][6]);
        L3C8.setText("" + su.matriz[2][7]);
        L3C9.setText("" + su.matriz[2][8]);

        L4C1.setText("" + su.matriz[3][0]);
        L4C2.setText("" + su.matriz[3][1]);
        L4C3.setText("" + su.matriz[3][2]);
        L4C4.setText("" + su.matriz[3][3]);
        L4C5.setText("" + su.matriz[3][4]);
        L4C6.setText("" + su.matriz[3][5]);
        L4C7.setText("" + su.matriz[3][6]);
        L4C8.setText("" + su.matriz[3][7]);
        L4C9.setText("" + su.matriz[3][8]);

        L5C1.setText("" + su.matriz[4][0]);
        L5C2.setText("" + su.matriz[4][1]);
        L5C3.setText("" + su.matriz[4][2]);
        L5C4.setText("" + su.matriz[4][3]);
        L5C5.setText("" + su.matriz[4][4]);
        L5C6.setText("" + su.matriz[4][5]);
        L5C7.setText("" + su.matriz[4][6]);
        L5C8.setText("" + su.matriz[4][7]);
        L5C9.setText("" + su.matriz[4][8]);

        L6C1.setText("" + su.matriz[5][0]);
        L6C2.setText("" + su.matriz[5][1]);
        L6C3.setText("" + su.matriz[5][2]);
        L6C4.setText("" + su.matriz[5][3]);
        L6C5.setText("" + su.matriz[5][4]);
        L6C6.setText("" + su.matriz[5][5]);
        L6C7.setText("" + su.matriz[5][6]);
        L6C8.setText("" + su.matriz[5][7]);
        L6C9.setText("" + su.matriz[5][8]);

        L7C1.setText("" + su.matriz[6][0]);
        L7C2.setText("" + su.matriz[6][1]);
        L7C3.setText("" + su.matriz[6][2]);
        L7C4.setText("" + su.matriz[6][3]);
        L7C5.setText("" + su.matriz[6][4]);
        L7C6.setText("" + su.matriz[6][5]);
        L7C7.setText("" + su.matriz[6][6]);
        L7C8.setText("" + su.matriz[6][7]);
        L7C9.setText("" + su.matriz[6][8]);

        L8C1.setText("" + su.matriz[7][0]);
        L8C2.setText("" + su.matriz[7][1]);
        L8C3.setText("" + su.matriz[7][2]);
        L8C4.setText("" + su.matriz[7][3]);
        L8C5.setText("" + su.matriz[7][4]);
        L8C6.setText("" + su.matriz[7][5]);
        L8C7.setText("" + su.matriz[7][6]);
        L8C8.setText("" + su.matriz[7][7]);
        L8C9.setText("" + su.matriz[7][8]);

        L9C1.setText("" + su.matriz[8][0]);
        L9C2.setText("" + su.matriz[8][1]);
        L9C3.setText("" + su.matriz[8][2]);
        L9C4.setText("" + su.matriz[8][3]);
        L9C5.setText("" + su.matriz[8][4]);
        L9C6.setText("" + su.matriz[8][5]);
        L9C7.setText("" + su.matriz[8][6]);
        L9C8.setText("" + su.matriz[8][7]);
        L9C9.setText("" + su.matriz[8][8]);
    }
    
    /**
     * Método main que ejecuta la GUI y abre el programa.
     * @param args 
     */
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            /**
             * Hace visible la pantalla de la GUI.
             */
            public void run() {
                new GUI().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField L1C1;
    private javax.swing.JTextField L1C2;
    private javax.swing.JTextField L1C3;
    private javax.swing.JTextField L1C4;
    private javax.swing.JTextField L1C5;
    private javax.swing.JTextField L1C6;
    private javax.swing.JTextField L1C7;
    private javax.swing.JTextField L1C8;
    private javax.swing.JTextField L1C9;
    private javax.swing.JTextField L2C1;
    private javax.swing.JTextField L2C2;
    private javax.swing.JTextField L2C3;
    private javax.swing.JTextField L2C4;
    private javax.swing.JTextField L2C5;
    private javax.swing.JTextField L2C6;
    private javax.swing.JTextField L2C7;
    private javax.swing.JTextField L2C8;
    private javax.swing.JTextField L2C9;
    private javax.swing.JTextField L3C1;
    private javax.swing.JTextField L3C2;
    private javax.swing.JTextField L3C3;
    private javax.swing.JTextField L3C4;
    private javax.swing.JTextField L3C5;
    private javax.swing.JTextField L3C6;
    private javax.swing.JTextField L3C7;
    private javax.swing.JTextField L3C8;
    private javax.swing.JTextField L3C9;
    private javax.swing.JTextField L4C1;
    private javax.swing.JTextField L4C2;
    private javax.swing.JTextField L4C3;
    private javax.swing.JTextField L4C4;
    private javax.swing.JTextField L4C5;
    private javax.swing.JTextField L4C6;
    private javax.swing.JTextField L4C7;
    private javax.swing.JTextField L4C8;
    private javax.swing.JTextField L4C9;
    private javax.swing.JTextField L5C1;
    private javax.swing.JTextField L5C2;
    private javax.swing.JTextField L5C3;
    private javax.swing.JTextField L5C4;
    private javax.swing.JTextField L5C5;
    private javax.swing.JTextField L5C6;
    private javax.swing.JTextField L5C7;
    private javax.swing.JTextField L5C8;
    private javax.swing.JTextField L5C9;
    private javax.swing.JTextField L6C1;
    private javax.swing.JTextField L6C2;
    private javax.swing.JTextField L6C3;
    private javax.swing.JTextField L6C4;
    private javax.swing.JTextField L6C5;
    private javax.swing.JTextField L6C6;
    private javax.swing.JTextField L6C7;
    private javax.swing.JTextField L6C8;
    private javax.swing.JTextField L6C9;
    private javax.swing.JTextField L7C1;
    private javax.swing.JTextField L7C2;
    private javax.swing.JTextField L7C3;
    private javax.swing.JTextField L7C4;
    private javax.swing.JTextField L7C5;
    private javax.swing.JTextField L7C6;
    private javax.swing.JTextField L7C7;
    private javax.swing.JTextField L7C8;
    private javax.swing.JTextField L7C9;
    private javax.swing.JTextField L8C1;
    private javax.swing.JTextField L8C2;
    private javax.swing.JTextField L8C3;
    private javax.swing.JTextField L8C4;
    private javax.swing.JTextField L8C5;
    private javax.swing.JTextField L8C6;
    private javax.swing.JTextField L8C7;
    private javax.swing.JTextField L8C8;
    private javax.swing.JTextField L8C9;
    private javax.swing.JTextField L9C1;
    private javax.swing.JTextField L9C2;
    private javax.swing.JTextField L9C3;
    private javax.swing.JTextField L9C4;
    private javax.swing.JTextField L9C5;
    private javax.swing.JTextField L9C6;
    private javax.swing.JTextField L9C7;
    private javax.swing.JTextField L9C8;
    private javax.swing.JTextField L9C9;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btSolve;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
    
}
