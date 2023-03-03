import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.FileDialog;
import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aldo
 */
public class Interfaz extends javax.swing.JFrame implements ActionListener{

    Matriz mat;

 public Interfaz() {
        initComponents();
        this.getContentPane().setBackground(Color.white);
        hidelabels();
    }
          
 public void crearMatriz(){

    int x=5;
    int y=5;
    JButton b;
    
    for (int i=0; i < mat.filas; i++){
        for (int j=0; j< mat.columnas; j++){
           b=mat.MATRIZ[i][j];
           b.addActionListener(this);
           b.setBackground(Color.white);
           b.setBounds(x,y,30,30);
            panel.add(b);
            x+=25;
        }
       x=5;
        y+=27;
    }
    
}
 
public void actionPerformed(ActionEvent e){
if(((JButton)e.getSource()).getBackground()== Color.black){   
        ((JButton)e.getSource()).setBackground(Color.white);
         }
          else{
        ((JButton)e.getSource()).setBackground(Color.black);
         }
    if(mat.checkMatrixErrors()== 1){
      mat.count=--mat.count;
      lives.setText("Lives "+mat.count);
    }
    
    if(mat.count==0){
    JOptionPane.showMessageDialog(this, "You loose!!");
    enableButtons();
    }
    
    if(mat.checkMatrixCompleted()==0){
    JOptionPane.showMessageDialog(this, "You win!!");
    enableButtons();
    }
    
    
    
}
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        labelFiveOne = new javax.swing.JLabel();
        lives = new javax.swing.JLabel();
        labelFiveTwo = new javax.swing.JLabel();
        jMenuBar = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        newGameOption = new javax.swing.JMenuItem();
        restartGameOption = new javax.swing.JMenuItem();
        saveOption = new javax.swing.JMenuItem();
        openFileOption = new javax.swing.JMenuItem();
        quitOption = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 31, 76));

        panel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );

        lives.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        lives.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lives.setText("Lives 3 ");

        labelFiveTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFiveTwo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        labelFiveTwo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        menu.setText("File");

        newGameOption.setText("New Game");
        newGameOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameOptionActionPerformed(evt);
            }
        });
        menu.add(newGameOption);

        restartGameOption.setText("Restart Game");
        restartGameOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartGameOptionActionPerformed(evt);
            }
        });
        menu.add(restartGameOption);

        saveOption.setText("Save Game");
        saveOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveOptionActionPerformed(evt);
            }
        });
        menu.add(saveOption);

        openFileOption.setText("Open Game");
        openFileOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileOptionActionPerformed(evt);
            }
        });
        menu.add(openFileOption);

        quitOption.setText("Close Game");
        quitOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitOptionActionPerformed(evt);
            }
        });
        menu.add(quitOption);

        jMenuBar.add(menu);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelFiveTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelFiveOne, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lives))
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lives))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(labelFiveOne, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFiveTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveOptionActionPerformed
        saveToFile();
    }//GEN-LAST:event_saveOptionActionPerformed

    private void openFileOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileOptionActionPerformed
        readFromFile();
        //readSolution();
        if(mat.filas==5){
                readSolutionOne();
        }
        if(mat.filas==10){
                readSolutionTwo();
        }
        putlabels();
    }//GEN-LAST:event_openFileOptionActionPerformed

    private void quitOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitOptionActionPerformed
        if(JOptionPane.showConfirmDialog(this,
                "Sure you want to quit?", "Nonogram",
                JOptionPane.YES_NO_OPTION) ==
                JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_quitOptionActionPerformed

    private void newGameOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameOptionActionPerformed
        hidelabels();
        JOptionPane.showMessageDialog(this, "Choose the game to play");
        readGame();
        putlabels();
        lives.setText("Lives "+mat.count);
    }//GEN-LAST:event_newGameOptionActionPerformed

    private void restartGameOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartGameOptionActionPerformed

        if(JOptionPane.showConfirmDialog(this,
                "Sure you want to restart?", "Nonogram",
                JOptionPane.YES_NO_OPTION) ==
                JOptionPane.YES_OPTION)
        {
        restartGame();
        if(mat.filas==5){
                readGameNew1();
        }
        if(mat.filas==10){
                readGameNew2();
        }
         putlabels();
         lives.setText("Lives "+mat.count);
        }
    }//GEN-LAST:event_restartGameOptionActionPerformed
    private void readGameNew1(){
        FileReader fr;
        BufferedReader bufReader;
        String lines;
        String numeros [];
        int filas,columnas,fila,i,j;
        int matrixnumbers [][];
        
        try{

        fr = new FileReader("C:\\Users\\Equipo\\Desktop\\ButtonsMatix_1\\src\\Nonogram5x5");
        bufReader = new BufferedReader(fr);
        filas = Integer.parseInt(bufReader.readLine()); //La primera línea nos dice las filas de la matriz
        columnas =Integer.parseInt(bufReader.readLine()); //La segunda línea nos dice las columnas de la matriz
        lines = bufReader.readLine(); //leemos la siguiente línea 
            
        panel.removeAll();
        panel.repaint();
        mat= new Matriz(filas, columnas);
        crearMatriz();

        //Creamos el arreglo 
        matrixnumbers = new int[filas][columnas];//Usamos uno de la matriz
        fila=0;//recorrer las filas de la matriz
        
        //Code adapted from Interactive Programmers Community (2020)
        while(lines != null){//leer todas las líneas hasta que no haya
            //separar cada número de cada línea en Strings
            numeros = lines.split(" ");//separar en Strings donde haya un espacio
            for(i=0;i<numeros.length;i++)
            matrixnumbers[fila][i] = Integer.parseInt (numeros[i]);
            fila++; //próxima lína
            lines = bufReader.readLine();//leemos las siguientes líneas
        }
        mat.gameMatrix = new int [filas][columnas];
        for (i=0; i < filas; i++){
        for (j=0; j< columnas; j++){
            mat.gameMatrix [i][j] = matrixnumbers [i][j];//Rellenar matriz de la clase MATRIZ con la solución
        } 
      }
        bufReader.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error in opening file: \n"
                    + e.getMessage());
    }
    }    
    private void readGameNew2(){
        FileReader fr;
        BufferedReader bufReader;
        String lines;
        String numeros [];
        int filas,columnas,fila,i,j;
        int matrixnumbers [][];
        
        try{

        fr = new FileReader("C:\\Users\\Equipo\\Desktop\\Carrera UDLAP\\2° Semestre UDLAP\\programa final\\ButtonsMatix_1\\Nonogram10x10");
        bufReader = new BufferedReader(fr);
        filas = Integer.parseInt(bufReader.readLine()); //La primera línea nos dice las filas de la matriz
        columnas =Integer.parseInt(bufReader.readLine()); //La segunda línea nos dice las columnas de la matriz
        lines = bufReader.readLine(); //leemos la siguiente línea 
            
        panel.removeAll();
        panel.repaint();
        mat= new Matriz(filas, columnas);
        crearMatriz();

        //Creamos el arreglo 
        matrixnumbers = new int[filas][columnas];//Usamos uno de la matriz
        fila=0;//recorrer las filas de la matriz
        
        //Code adapted from Interactive Programmers Community (2020)
        while(lines != null){//leer todas las líneas hasta que no haya
            //separar cada número de cada línea en Strings
            numeros = lines.split(" ");//separar en Strings donde haya un espacio
            for(i=0;i<numeros.length;i++)
            matrixnumbers[fila][i] = Integer.parseInt (numeros[i]);
            fila++; //próxima lína
            lines = bufReader.readLine();//leemos las siguientes líneas
        }
        mat.gameMatrix = new int [filas][columnas];
        for (i=0; i < filas; i++){
        for (j=0; j< columnas; j++){
            mat.gameMatrix [i][j] = matrixnumbers [i][j];//Rellenar matriz de la clase MATRIZ con la solución
        } 
      }
        bufReader.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error in opening file: \n"
                    + e.getMessage());
    }
    }
    private void restartGame(){
        panel.removeAll();
        panel.repaint();
        mat= new Matriz(mat.filas,mat.filas);
        crearMatriz();
        mat.count = 3;
    }
    private void readGame (){
        File inFile;
        FileReader fr;
        BufferedReader bufReader;
        FileDialog fd;
        String lines,doc,path,filename;
        String numeros [];
        int filas,columnas,fila,i,j;
        int matrixnumbers [][];
        
        try{
        fd = new FileDialog (this, "Choose game to play"
        ,FileDialog.LOAD);
        fd.setVisible(true);
        path = fd.getDirectory();
        filename = fd.getFile();
        if((path == null) || (filename == null)) return;
        doc = path + filename;
        inFile = new File(doc);
        fr = new FileReader(inFile);
        bufReader = new BufferedReader(fr);
        
        filas = Integer.parseInt(bufReader.readLine()); //La primera línea nos dice las filas de la matriz
        columnas =Integer.parseInt(bufReader.readLine()); //La segunda línea nos dice las columnas de la matriz
        lines = bufReader.readLine(); //leemos la siguiente línea   
        
        panel.removeAll();
        panel.repaint();
        mat= new Matriz(filas, columnas);
        crearMatriz();

        //Creamos el arreglo 
        matrixnumbers = new int[filas][columnas];//Usamos uno de la matriz
        fila=0;//recorrer las filas de la matriz
        
        //Code adapted from Interactive Programmers Community (2020)
        while(lines != null){//leer todas las líneas hasta que no haya
            //separar cada número de cada línea en Strings
            numeros = lines.split(" ");//separar en Strings donde haya un espacio
            for(i=0;i<numeros.length;i++)
            matrixnumbers[fila][i] = Integer.parseInt (numeros[i]);
            fila++; //próxima lína
            lines = bufReader.readLine();//leemos las siguientes líneas
        }
        mat.gameMatrix = new int [filas][columnas];
        for (i=0; i < filas; i++){
        for (j=0; j< columnas; j++){
            mat.gameMatrix [i][j] = matrixnumbers [i][j];//Rellenar matriz de la clase MATRIZ con la solución
        }
    }
        bufReader.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error in opening file: \n"
                    + e.getMessage());
    }
    }
    private void readFromFile(){
        File inFile;
        FileReader fr;
        BufferedReader bufReader;
        FileDialog fd;
        String lines,doc,path,filename;
        String numeros [];
        int filas,columnas,i,fila;
        int matrixnumbers [][];
        int count;
        
                
        try{
        fd = new FileDialog (this, "Choos file to open"
        ,FileDialog.LOAD);
        fd.setVisible(true);
        path = fd.getDirectory();
        filename = fd.getFile();
        if((path == null) || (filename == null)) return;
        doc = path + filename;
        inFile = new File(doc);
        fr = new FileReader(inFile);
        bufReader = new BufferedReader(fr);
        
        count= Integer.parseInt(bufReader.readLine());
        filas = Integer.parseInt(bufReader.readLine()); //La primera línea nos dice las filas de la matriz
        columnas =Integer.parseInt(bufReader.readLine()); //La segunda línea nos dice las columnas de la matriz
        lines = bufReader.readLine(); //leemos la siguiente línea
        
        panel.removeAll();
        panel.repaint(); 
        mat= new Matriz(filas, columnas);
        crearMatriz();
        mat.count = count;
        lives.setText("Lives "+mat.count);
        
        if(mat.count==0){
        enableButtons();
        }else{
        //Creamos el arreglo 
        matrixnumbers = new int[filas][columnas];
        fila=0;//recorrer las filas de la matriz
        
        //Code adapted from Interactive Programmers Community (2020)
        while(lines != null){//leer todas las líneas hasta que no haya
            //separar cada número de cada línea en Strings
            numeros = lines.split(" ");//separar en Strings donde haya un espacio
            for(i=0;i<numeros.length;i++)
            matrixnumbers[fila][i] = Integer.parseInt (numeros[i]);
            fila++; //próxima lína
            lines = bufReader.readLine();//leemos las siguientes líneas
        }
        
        mat.insertNewMatrix(matrixnumbers,filas,columnas);//Manda el arreglo con las filas y columnas al método
        //Se manda al método en Matriz para modificar el color de nuestra matriz de JButtons
        
        bufReader.close();
        }
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error in opening file: \n"
                    + e.getMessage());
    }
    }
    private void saveToFile(){
        File outFile;
        FileOutputStream outFileStream;
        PrintWriter outStream;
        FileDialog fd;
        String path,filename,doc;
        
        try{
        fd = new FileDialog (this, "Choos file to save"
        + " progress nonogram",
        FileDialog.SAVE);
        fd.setVisible(true);
        path = fd.getDirectory();
        filename = fd.getFile();
        if((path == null) || (filename == null)) return;
        doc = path + filename;
        System.out.println("PATH = "+doc);
        outFile = new File(doc);
        outFileStream = new FileOutputStream(outFile);
        outStream = new PrintWriter(outFileStream);
        outStream.print(mat.saveMatrix());//Se retorna un String del método en Matriz
        outStream.close();
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, "Error in saving file: \n"
                    + e.getMessage());
        }
    } 
    private void readSolutionOne(){
        FileReader fr;
        BufferedReader bufReader;
        String lines;
        String numeros [];
        int filas,columnas,fila,i,j;
        int matrixnumbers [][];
        
        try{

        fr = new FileReader("C:\\Users\\Equipo\\Desktop\\Carrera UDLAP\\2° Semestre UDLAP\\programa final\\ButtonsMatix_1\\Nonogram5x5");
        bufReader = new BufferedReader(fr);
        filas = Integer.parseInt(bufReader.readLine()); //La primera línea nos dice las filas de la matriz
        columnas =Integer.parseInt(bufReader.readLine()); //La segunda línea nos dice las columnas de la matriz
        lines = bufReader.readLine(); //leemos la siguiente línea 

        //Creamos el arreglo 
        matrixnumbers = new int[filas][columnas];//Usamos uno de la matriz
        fila=0;//recorrer las filas de la matriz
        
        //Code adapted from Interactive Programmers Community (2020)
        while(lines != null){//leer todas las líneas hasta que no haya
            //separar cada número de cada línea en Strings
            numeros = lines.split(" ");//separar en Strings donde haya un espacio
            for(i=0;i<numeros.length;i++)
            matrixnumbers[fila][i] = Integer.parseInt (numeros[i]);
            fila++; //próxima lína
            lines = bufReader.readLine();//leemos las siguientes líneas
        }
        mat.gameMatrix = new int [filas][columnas];
        for (i=0; i < filas; i++){
        for (j=0; j< columnas; j++){
            mat.gameMatrix [i][j] = matrixnumbers [i][j];//Rellenar matriz de la clase MATRIZ con la solución
        }
    }
        bufReader.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error in opening file: \n"
                    + e.getMessage());
    }
    }
    private void readSolutionTwo(){
      FileReader fr;
        BufferedReader bufReader;
        String lines;
        String numeros [];
        int filas,columnas,fila,i,j;
        int matrixnumbers [][];
        
        try{

        fr = new FileReader("C:\\Users\\Equipo\\Desktop\\ButtonsMatix_1\\src\\Nonogram10x10");
        bufReader = new BufferedReader(fr);
        filas = Integer.parseInt(bufReader.readLine()); //La primera línea nos dice las filas de la matriz
        columnas =Integer.parseInt(bufReader.readLine()); //La segunda línea nos dice las columnas de la matriz
        lines = bufReader.readLine(); //leemos la siguiente línea 

        //Creamos el arreglo 
        matrixnumbers = new int[filas][columnas];//Usamos uno de la matriz
        fila=0;//recorrer las filas de la matriz
        
        //Code adapted from Interactive Programmers Community (2020)
        while(lines != null){//leer todas las líneas hasta que no haya
            //separar cada número de cada línea en Strings
            numeros = lines.split(" ");//separar en Strings donde haya un espacio
            for(i=0;i<numeros.length;i++)
            matrixnumbers[fila][i] = Integer.parseInt (numeros[i]);
            fila++; //próxima lína
            lines = bufReader.readLine();//leemos las siguientes líneas
        }
        mat.gameMatrix = new int [filas][columnas];
        for (i=0; i < filas; i++){
        for (j=0; j< columnas; j++){
            mat.gameMatrix [i][j] = matrixnumbers [i][j];//Rellenar matriz de la clase MATRIZ con la solución
        }
    }
        bufReader.close();
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error in opening file: \n"
                    + e.getMessage());
    }  
    }
    private void hidelabels(){
        lives.setVisible(false);
        labelFiveOne.setVisible(false);
        labelFiveTwo.setVisible(false);
    }
    private void putlabels(){
     
     lives.setVisible(true);
     if((mat.filas==5)&&(mat.columnas==5)){
        labelFiveOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fiveOne.png")));
        labelFiveTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fiveTwo.png")));
        labelFiveOne.setVisible(true);
        labelFiveTwo.setVisible(true);
        
      } else if((mat.filas==10)&&(mat.columnas==10)){
       labelFiveOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tenOne.png")));
        labelFiveTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tenTwo.png")));
        labelFiveOne.setVisible(true);
        labelFiveTwo.setVisible(true);

      }
    }
    public void enableButtons(){
    JButton b;
    for (int i=0; i < mat.filas; i++){
        for (int j=0; j< mat.columnas; j++){
           b=mat.MATRIZ[i][j];
           b.setEnabled(false);   
        }
    }
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JLabel labelFiveOne;
    private javax.swing.JLabel labelFiveTwo;
    private javax.swing.JLabel lives;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem newGameOption;
    private javax.swing.JMenuItem openFileOption;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem quitOption;
    private javax.swing.JMenuItem restartGameOption;
    private javax.swing.JMenuItem saveOption;
    // End of variables declaration//GEN-END:variables

}
