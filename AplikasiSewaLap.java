package Latihan2;

import javax.swing.*; 
import java.awt.event.*;

public class AplikasiSewaLap extends JFrame 
{
JLabel lblnama=new JLabel("NAMA PENYEWA");    
JTextField txnama=new JTextField(20);    
JLabel lblno=new JLabel("NO. TELP");    
JTextField txnno=new JTextField(7);    
JLabel lblpembelian=new JLabel("JENIS LAPANGAN");    
JRadioButton sintetis=new JRadioButton("SINTETIS");    
JRadioButton karpet=new JRadioButton("KARPET");    
ButtonGroup harga=new ButtonGroup();    
JLabel lblharga=new JLabel("HARGA");    
JCheckBox seratuslimapuluhribu=new JCheckBox("150 RIBU");    
JCheckBox duaratusribu=new JCheckBox("200 RIBU");    
JCheckBox duaratuslimapuluh=new JCheckBox("250 RIBU");    
JButton cetak=new JButton("Cetak");    
JTextArea hasil=new JTextArea();    
    
AplikasiSewaLap()    
{       
 setTitle("PENYEWAAN LAPANGAN FUTSAL");       
 setLocation(300,100);       
 setSize(300,320);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}  
 
 void KomponenVisual()    
 {       
  getContentPane().setLayout(null);
  getContentPane().add(lblnama);       
  lblnama.setBounds(10,10,80,20);       
  getContentPane().add(txnama);       
  txnama.setBounds(105,10,175,20);       
  getContentPane().add(lblno);       
  lblno.setBounds(10,33,80,20);       
  getContentPane().add(txnno);       
  txnno.setBounds(105,33,70,20);       
  getContentPane().add(lblpembelian);      
  lblpembelian.setBounds(10,56,80,20);  
  harga.add(sintetis);    
  harga.add(karpet);      
  getContentPane().add(sintetis);  
  sintetis.setBounds(105,56,65,20);    
  getContentPane().add(karpet);
  karpet.setBounds(160,56,100,20);       
  getContentPane().add(lblharga);       
  lblharga.setBounds(10,80,70,20);       
  getContentPane().add(seratuslimapuluhribu);       
  seratuslimapuluhribu.setBounds(105,80,100,20);       
  getContentPane().add(duaratusribu);       
  duaratusribu.setBounds(105,103,100,20);       
  getContentPane().add(duaratuslimapuluh);       
  duaratuslimapuluh.setBounds(105,126,100,20);       
  getContentPane().add(cetak);       
  cetak.setBounds(10,150,270,20);       
  getContentPane().add(hasil);       
  hasil.setBounds(10,180,270,100);       
  setVisible(true); 
 }

 void AksiReaksi()    
 {       
  cetak.addActionListener(new ActionListener()       
  {          
   public void actionPerformed(ActionEvent e)          
   {             
    hasil.append(txnama.getText()+"\n");             
    hasil.append(txnno.getText()+"\n");             
    if(sintetis.isSelected()==true)             
    {                
     hasil.append(sintetis.getText()+"\n");             
    }             
    else             
    {                
    hasil.append(karpet.getText()+"\n");             
    }  
    if(seratuslimapuluhribu.isSelected()==true)             
    {                
     hasil.append(seratuslimapuluhribu.getText()+"\n");             
    }             
    if(duaratusribu.isSelected()==true)             
    {                
     hasil.append(duaratusribu.getText()+"\n");             
    }             
    if(duaratuslimapuluh.isSelected()==true)             
    {                
     hasil.append(duaratuslimapuluh.getText()+"\n");             
    } 
  }       
  });    
 }  
  public static void main(String args[])    
  {       
   AplikasiSewaLap e5=new AplikasiSewaLap();       
   e5.KomponenVisual();       
   e5.AksiReaksi();    
  }

}