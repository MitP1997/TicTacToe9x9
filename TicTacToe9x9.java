import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe9x9 extends JFrame implements ActionListener
{
	JFrame frmobj;
	JPanel frmpnl1,frmpnl2;
	JPanel pnl[]=new JPanel[10];
	JPanel pan[]=new JPanel[10];	
	JPanel pnel[]=new JPanel[10];
	BorderLayout bl,bl1;
	GridLayout grup,gr1,gr2,gr3,gr4,gr5,gr6,gr7,gr8,gr9,grdwn;
	JButton b[]=new JButton[82];
	JButton bt[]=new JButton[10];
	JLabel lbl1,lbl2,lbl3,lbl4;
	CardLayout card1,card2,card3,card4,card5,card6,card7,card8,card9;
	int i,j,turn=1,a,mod,p1=0,p2=0,k;
	boolean boo1=false,boo2=false,boo3=false,boo4=false,boo5=false,boo6=false,boo7=false,boo8=false,boo9=false,boobor=true;
	
	
	public void createComp()
	{
		frmobj=new JFrame("Big");
		bl=new BorderLayout();
		frmpnl1=new JPanel();
		frmpnl2=new JPanel();
		grup=new GridLayout(1,4,3,3);
		grdwn=new GridLayout(3,3,10,10);
		gr1=new GridLayout(3,3,2,2);
		gr2=new GridLayout(3,3,2,2);
		gr3=new GridLayout(3,3,2,2);
		gr4=new GridLayout(3,3,2,2);
		gr5=new GridLayout(3,3,2,2);
		gr6=new GridLayout(3,3,2,2);
		gr7=new GridLayout(3,3,2,2);
		gr8=new GridLayout(3,3,2,2);
		gr9=new GridLayout(3,3,2,2);	
		bl1=new BorderLayout();
		for(i=1;i<=9;i++)
		{
			pnl[i]=new JPanel();
		}
		for(i=1;i<=81;i++)
		{
			b[i]=new JButton();
			b[i].setFont(new Font("Arial",Font.PLAIN,30));
		}
		for(i=1;i<=9;i++)
		{
			bt[i]=new JButton();
			bt[i].setFont(new Font("Arial",Font.PLAIN,90));
		}
		for(i=1;i<=9;i++)
		{
			pan[i]=new JPanel();
		}
		for(i=1;i<=9;i++)
		{
			pnel[i]=new JPanel();
		}
		lbl1=new JLabel("P1->");
		lbl2=new JLabel("0");
		lbl3=new JLabel("P2->");
		lbl4=new JLabel("0");
		card1=new CardLayout(0,0);
		card2=new CardLayout(0,0);
		card3=new CardLayout(0,0);
		card4=new CardLayout(0,0);
		card5=new CardLayout(0,0);
		card6=new CardLayout(0,0);
		card7=new CardLayout(0,0);
		card8=new CardLayout(0,0);
		card9=new CardLayout(0,0);
		
		for(i=1;i<=9;i++)
		{
			bt[i]=new JButton();
			bt[i].setFont(new Font("Arial",Font.PLAIN,110));
			bt[i].setPreferredSize(new Dimension(220, 220));
		}
		
	}
	public void displayComp()
	{
		frmobj.setLayout(bl);
		frmobj.add(frmpnl1,BorderLayout.NORTH);
		frmpnl1.setLayout(grup);
		frmpnl1.add(lbl1);
		frmpnl1.add(lbl2);
		frmpnl1.add(lbl3);
		frmpnl1.add(lbl4);
		frmobj.add(frmpnl2,BorderLayout.CENTER);
		frmpnl2.setLayout(grdwn);
		for(i=1;i<=9;i++)
		{
			frmpnl2.add(pan[i]);
		}
		pan[1].setLayout(card1);
		pan[1].add(pnl[1]);
		pan[1].add(pnel[1]);
		pnl[1].setLayout(gr1);
		
		pan[2].setLayout(card2);		
		pan[2].add(pnl[2]);
		pan[2].add(pnel[2]);
		pnl[2].setLayout(gr2);

		pan[3].setLayout(card3);
		pan[3].add(pnl[3]);
		pan[3].add(pnel[3]);
		pnl[3].setLayout(gr3);

		pan[4].setLayout(card4);
		pan[4].add(pnl[4]);
		pan[4].add(pnel[4]);
		pnl[4].setLayout(gr4);

		pan[5].setLayout(card5);
		pan[5].add(pnl[5]);
		pan[5].add(pnel[5]);
		pnl[5].setLayout(gr5);

		pan[6].setLayout(card6);
		pan[6].add(pnl[6]);
		pan[6].add(pnel[6]);
		pnl[6].setLayout(gr6);

		pan[7].setLayout(card7);
		pan[7].add(pnl[7]);
		pan[7].add(pnel[7]);
		pnl[7].setLayout(gr7);

		pan[8].setLayout(card8);
		pan[8].add(pnl[8]);
		pan[8].add(pnel[8]);
		pnl[8].setLayout(gr8);

		pan[9].setLayout(card9);
		pan[9].add(pnl[9]);
		pan[9].add(pnel[9]);
		pnl[9].setLayout(gr9);
		
		for(i=1;i<=9;i++)
		{
			pnl[1].add(b[i]);
		}
		for(i=10;i<=18;i++)
		{
			pnl[2].add(b[i]);
		}for(i=19;i<=27;i++)
		{
			pnl[3].add(b[i]);
		}for(i=28;i<=36;i++)
		{
			pnl[4].add(b[i]);
		}for(i=37;i<=45;i++)
		{
			pnl[5].add(b[i]);
		}for(i=46;i<=54;i++)
		{
			pnl[6].add(b[i]);
		}for(i=55;i<=63;i++)
		{
			pnl[7].add(b[i]);
		}for(i=64;i<=72;i++)
		{
			pnl[8].add(b[i]);
		}for(i=73;i<=81;i++)
		{
			pnl[9].add(b[i]);
		}
		for(i=1;i<=9;i++)
		{
			pnel[i].add(bt[i]);
		}
		frmobj.setVisible(true);
		frmobj.setSize(700,710);
		frmobj.setResizable(false);
	}

	public void actionPerformed(ActionEvent ae)
	{
		for(i=1;i<=81;i++)
		{
			if(ae.getSource().equals(b[i]))
			{
					if(b[i].getParent().isEnabled() == true)
					{			
						if(assign(i))
						{
							mod=i%9;
							if(i%9!=0)
							{
								check(i,mod);
								if(boobor)
								border(mod);
						
							}
							else
							{
								mod=9;
								check(i,mod);
								if(boobor)
								border(mod);
							
							}
							
						}
				
						break;
					}
					else
					{
						JOptionPane.showMessageDialog(frmobj,"Choose In The Highligted Box","Error!",JOptionPane.ERROR_MESSAGE);
					}
			}
		
		}
		boobor=true;	
	}

	
	public boolean assign(int a)
	{
		if(b[a].getText().equals(""))
		{
			if(turn%2==0)
			{
				b[a].setText("O");
			}
			else
			{
				b[a].setText("X");
			}
			turn++;
			return true;
		
		}
		else
		{
			JOptionPane.showMessageDialog(frmobj,"Choose Another Box","Error!",JOptionPane.ERROR_MESSAGE);
			return false;
		}
	}

	public void border(int a)
	{
		int x;
		if(bt[a].getText().equals(""))
		{
			for(x=1;x<=9;x++)
			{
				pnl[x].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(0.0f)));
				pnl[x].setEnabled(false);
			}
			pnl[a].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(5.0f)));
			pnl[a].setEnabled(true);
		}
		else
		{
			for(x=1;x<=9;x++)
			{
				pnl[x].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(0.0f)));
				pnl[x].setEnabled(true);
				
			}
		}
	
	}
	
	public void check(int i,int mod)
	{
		if(mod==1)
		{
			if(b[i].getText().equals("X")&&b[i+1].getText().equals("X")&&b[i+2].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i+1].getText().equals("O")&&b[i+2].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i+3].getText().equals("X")&&b[i+6].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i+3].getText().equals("O")&&b[i+6].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i+4].getText().equals("X")&&b[i+8].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i+4].getText().equals("O")&&b[i+8].getText().equals("O"))
				wino(i);
		}
		else if(mod==2)
		{
			if(b[i-1].getText().equals("X")&&b[i].getText().equals("X")&&b[i+1].getText().equals("X"))
				winx(i);
			else if(b[i-1].getText().equals("O")&&b[i].getText().equals("O")&&b[i+1].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i+3].getText().equals("X")&&b[i+6].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i+3].getText().equals("O")&&b[i+6].getText().equals("O"))
				wino(i);
		}
		else if(mod==3)
		{
			if(b[i].getText().equals("X")&&b[i-1].getText().equals("X")&&b[i-2].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-1].getText().equals("O")&&b[i-2].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i+3].getText().equals("X")&&b[i+6].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i+3].getText().equals("O")&&b[i+6].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i+2].getText().equals("X")&&b[i+4].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i+2].getText().equals("O")&&b[i+4].getText().equals("O"))
				wino(i);
		}
		else if(mod==4)
		{
			if(b[i].getText().equals("X")&&b[i-3].getText().equals("X")&&b[i+3].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-3].getText().equals("O")&&b[i+3].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i+1].getText().equals("X")&&b[i+2].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i+1].getText().equals("O")&&b[i+2].getText().equals("O"))
				wino(i);
		}
		else if(mod==5)
		{
			if(b[i].getText().equals("X")&&b[i-1].getText().equals("X")&&b[i+1].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-1].getText().equals("O")&&b[i+1].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i+3].getText().equals("X")&&b[i-3].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i+3].getText().equals("O")&&b[i-3].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i-4].getText().equals("X")&&b[i+4].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-4].getText().equals("O")&&b[i+4].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i-2].getText().equals("X")&&b[i+2].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-2].getText().equals("O")&&b[i+2].getText().equals("O"))
				wino(i);
		}
		else if(mod==6)
		{
			if(b[i].getText().equals("X")&&b[i-3].getText().equals("X")&&b[i+3].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-3].getText().equals("O")&&b[i+3].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i-1].getText().equals("X")&&b[i-2].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-1].getText().equals("O")&&b[i-2].getText().equals("O"))
				wino(i);
		}
		else if(mod==7)
		{
			if(b[i].getText().equals("X")&&b[i-3].getText().equals("X")&&b[i-6].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-3].getText().equals("O")&&b[i-6].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i+1].getText().equals("X")&&b[i+2].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i+1].getText().equals("O")&&b[i+2].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i-4].getText().equals("X")&&b[i-2].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-4].getText().equals("O")&&b[i-2].getText().equals("O"))
				wino(i);
		}
		else if(mod==8)
		{
			if(b[i].getText().equals("X")&&b[i-1].getText().equals("X")&&b[i+1].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-1].getText().equals("O")&&b[i+1].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i-3].getText().equals("X")&&b[i-6].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-3].getText().equals("O")&&b[i-6].getText().equals("O"))
				wino(i);
		}
		else if(mod==9)
		{
			if(b[i].getText().equals("X")&&b[i-3].getText().equals("X")&&b[i-6].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-3].getText().equals("O")&&b[i-6].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i-1].getText().equals("X")&&b[i-2].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-1].getText().equals("O")&&b[i-2].getText().equals("O"))
				wino(i);
			else if(b[i].getText().equals("X")&&b[i-4].getText().equals("X")&&b[i-8].getText().equals("X"))
				winx(i);
			else if(b[i].getText().equals("O")&&b[i-4].getText().equals("O")&&b[i-8].getText().equals("O"))
				wino(i);
		}
			
			
	}


	public void winx(int i)
	{
		if(i<=9)
		{
			bt[1].setText("X");
			card1.next(pan[1]);
			boo1=true;
			m1();
		
		}
		else if(i>9&&i<=18)
		{
			bt[2].setText("X");
			card2.next(pan[2]);
			boo2=true;
			m2();
		
		}
		else if(i>18&&i<=27)
		{
			bt[3].setText("X");
			card3.next(pan[3]);
			boo3=true;
			m3();
		
		}	
		else if(i>27&&i<=36)
		{
			bt[4].setText("X");
			card4.next(pan[4]);
			boo4=true;
			m4();
		
		}
		else if(i>36&&i<=45)
		{
			bt[5].setText("X");
			card5.next(pan[5]);
			boo5=true;
			m5();
		
		}		
		else if(i>45&&i<=54)
		{
			bt[6].setText("X");
			card6.next(pan[6]);
			boo6=true;
			m6();
		
		}		
		else if(i>54&&i<=63)
		{
			bt[7].setText("X");
			card7.next(pan[7]);
			boo7=true;
			m7();
		
		}		
		else if(i>63&&i<=72)
		{
			bt[8].setText("X");
			card8.next(pan[8]);
			boo8=true;
			m8();
		
		}		
		else if(i>72&&i<=81)
		{
			bt[9].setText("X");
			card9.next(pan[9]);
			boo9=true;
			m9();
			
		}		
		
	}
	
	public void wino(int i)
	{
		if(i<=9)
		{
			bt[1].setText("O");
			card1.next(pan[1]);
			boo1=true;
			m1();
		
		}
		else if(i>9&&i<=18)
		{
			bt[2].setText("O");
			card2.next(pan[2]);
			boo2=true;
			m2();
		
		}
		else if(i>18&&i<=27)
		{
			bt[3].setText("O");
			card3.next(pan[3]);
			boo3=true;
			m3();
		
		}	
		else if(i>27&&i<=36)
		{
			bt[4].setText("O");
			card4.next(pan[4]);
			boo4=true;
			m4();
		
		}
		else if(i>36&&i<=45)
		{
			bt[5].setText("O");
			card5.next(pan[5]);
			boo5=true;
			m5();
		
		}		
		else if(i>45&&i<=54)
		{
			bt[6].setText("O");
			card6.next(pan[6]);
			boo6=true;
			m6();
		
		}		
		else if(i>54&&i<=63)
		{
			bt[7].setText("O");
			card7.next(pan[7]);
			boo7=true;
			m7();
		
		}		
		else if(i>63&&i<=72)
		{
			bt[8].setText("O");
			card8.next(pan[8]);
			boo8=true;
			m8();
		
		}		
		else if(i>72&&i<=81)
		{
			bt[9].setText("O");
			card9.next(pan[9]);
			boo9=true;
			m9();
			
		}		
		
	}

	public void m1()
	{
		if((bt[1].getText().equals("X")&&bt[2].getText().equals("X")&&bt[3].getText().equals("X"))||(bt[1].getText().equals("X")&&bt[4].getText().equals("X")&&bt[7].getText().equals("X"))||(bt[1].getText().equals("X")&&bt[5].getText().equals("X")&&bt[9].getText().equals("X")))
		{
			XWIN();
		}
		else if((bt[1].getText().equals("O")&&bt[2].getText().equals("O")&&bt[3].getText().equals("O"))||(bt[1].getText().equals("O")&&bt[4].getText().equals("O")&&bt[7].getText().equals("O"))||(bt[1].getText().equals("O")&&bt[5].getText().equals("O")&&bt[9].getText().equals("O")))
		{
			OWIN();
		}
	}
	
	public void m2()
	{
		if((bt[2].getText().equals("X")&&bt[5].getText().equals("X")&&bt[8].getText().equals("X"))||(bt[1].getText().equals("X")&&bt[2].getText().equals("X")&&bt[3].getText().equals("X")))
		{
			XWIN();
		}
		else if((bt[2].getText().equals("O")&&bt[5].getText().equals("O")&&bt[8].getText().equals("O"))||(bt[1].getText().equals("O")&&bt[2].getText().equals("O")&&bt[3].getText().equals("O")))
		{
			OWIN();
		}
	}

	public void m3()
	{
		if((bt[1].getText().equals("X")&&bt[2].getText().equals("X")&&bt[3].getText().equals("X"))||(bt[3].getText().equals("X")&&bt[6].getText().equals("X")&&bt[9].getText().equals("X"))||(bt[3].getText().equals("X")&&bt[5].getText().equals("X")&&bt[7].getText().equals("X")))
		{
			XWIN();
		}
		else if((bt[1].getText().equals("O")&&bt[2].getText().equals("O")&&bt[3].getText().equals("O"))||(bt[3].getText().equals("O")&&bt[6].getText().equals("O")&&bt[9].getText().equals("O"))||(bt[3].getText().equals("O")&&bt[5].getText().equals("O")&&bt[7].getText().equals("O")))
		{
			OWIN();
		}
	}

	public void m4()
	{
		if((bt[1].getText().equals("X")&&bt[4].getText().equals("X")&&bt[7].getText().equals("X"))||(bt[4].getText().equals("X")&&bt[5].getText().equals("X")&&bt[6].getText().equals("X")))
		{
			XWIN();
		}
		else if((bt[1].getText().equals("O")&&bt[4].getText().equals("O")&&bt[7].getText().equals("O"))||(bt[4].getText().equals("O")&&bt[5].getText().equals("O")&&bt[6].getText().equals("O")))
		{
			OWIN();
		}
	}

	public void m5()
	{
		if((bt[2].getText().equals("X")&&bt[5].getText().equals("X")&&bt[8].getText().equals("X"))||(bt[4].getText().equals("X")&&bt[6].getText().equals("X")&&bt[5].getText().equals("X"))||(bt[1].getText().equals("X")&&bt[5].getText().equals("X")&&bt[9].getText().equals("X"))||(bt[3].getText().equals("X")&&bt[5].getText().equals("X")&&bt[7].getText().equals("X")))
		{
			XWIN();
		}
		else if((bt[2].getText().equals("O")&&bt[5].getText().equals("O")&&bt[8].getText().equals("O"))||(bt[4].getText().equals("O")&&bt[6].getText().equals("O")&&bt[5].getText().equals("O"))||(bt[1].getText().equals("O")&&bt[5].getText().equals("O")&&bt[9].getText().equals("O"))||(bt[3].getText().equals("O")&&bt[5].getText().equals("O")&&bt[7].getText().equals("O")))
		{
			OWIN();
		}
	}
	
	public void m6()
	{
		if((bt[3].getText().equals("X")&&bt[6].getText().equals("X")&&bt[9].getText().equals("X"))||(bt[4].getText().equals("X")&&bt[5].getText().equals("X")&&bt[6].getText().equals("X")))
		{
			XWIN();
		}
		else if((bt[3].getText().equals("O")&&bt[6].getText().equals("O")&&bt[9].getText().equals("O"))||(bt[4].getText().equals("O")&&bt[5].getText().equals("O")&&bt[6].getText().equals("O")))
		{
			OWIN();
		}
	}
	
	public void m7()
	{
		if((bt[1].getText().equals("X")&&bt[4].getText().equals("X")&&bt[7].getText().equals("X"))||(bt[7].getText().equals("X")&&bt[8].getText().equals("X")&&bt[9].getText().equals("X"))||(bt[3].getText().equals("X")&&bt[5].getText().equals("X")&&bt[7].getText().equals("X")))
		{
			XWIN();
		}
		else if((bt[1].getText().equals("O")&&bt[4].getText().equals("O")&&bt[7].getText().equals("O"))||(bt[7].getText().equals("O")&&bt[8].getText().equals("O")&&bt[9].getText().equals("O"))||(bt[3].getText().equals("O")&&bt[5].getText().equals("O")&&bt[7].getText().equals("O")))
		{
			OWIN();
		}
	}
	
	public void m8()
	{	
		if((bt[2].getText().equals("X")&&bt[5].getText().equals("X")&&bt[8].getText().equals("X"))||(bt[7].getText().equals("X")&&bt[8].getText().equals("X")&&bt[9].getText().equals("X")))
		{
			XWIN();
		}
		else if((bt[2].getText().equals("O")&&bt[5].getText().equals("O")&&bt[8].getText().equals("O"))||(bt[7].getText().equals("O")&&bt[8].getText().equals("O")&&bt[9].getText().equals("O")))
		{
			OWIN();
		}
	}
	
	public void m9()
	{
		if((bt[3].getText().equals("X")&&bt[6].getText().equals("X")&&bt[9].getText().equals("X"))||(bt[7].getText().equals("X")&&bt[8].getText().equals("X")&&bt[9].getText().equals("X"))||(bt[1].getText().equals("X")&&bt[5].getText().equals("X")&&bt[9].getText().equals("X")))
		{
			XWIN();
		}
		else if((bt[3].getText().equals("O")&&bt[6].getText().equals("O")&&bt[9].getText().equals("O"))||(bt[7].getText().equals("O")&&bt[8].getText().equals("O")&&bt[9].getText().equals("O"))||(bt[1].getText().equals("O")&&bt[5].getText().equals("O")&&bt[9].getText().equals("O")))
		{
			OWIN();
		}
	}
						
	public void XWIN()
	{
		JOptionPane.showMessageDialog(frmobj,"X is the boss","Congratulations",JOptionPane.INFORMATION_MESSAGE);
		p1++;
		lbl2.setText(""+p1);	
		reset();
	}
	
	public void OWIN()
	{
		JOptionPane.showMessageDialog(frmobj,"O is the boss","Congratulations",JOptionPane.INFORMATION_MESSAGE);			
		p2++;
		lbl4.setText(""+p2);
		reset();
	}
	
	public void reset()
	{
		for(k=1;k<=81;k++)
		{
			b[k].setText("");
		}
		if(boo1)
			card1.previous(pan[1]);
		if(boo2)
			card2.previous(pan[2]);
		if(boo3)
			card3.previous(pan[3]);
		if(boo4)
			card4.previous(pan[4]);
		if(boo5)
			card5.previous(pan[5]);
		if(boo6)
			card6.previous(pan[6]);
		if(boo7)
			card7.previous(pan[7]);
		if(boo8)
			card8.previous(pan[8]);
		if(boo9)
			card9.previous(pan[9]);
		turn=1;
		for(k=1;k<=9;k++)
		{
			bt[k].setText("");
			pnl[k].setBorder(BorderFactory.createStrokeBorder(new BasicStroke(0.0f)));
			pnl[k].setEnabled(true);
		}
		boobor=false;
		
		
	}

	public void reg()
	{
		int r;
		for(r=1;r<=81;r++)
		{
			b[r].addActionListener(this);
		}
	}
		
	public static void main(String a[])
	{
		TTT obj=new TTT();
		obj.createComp();
		obj.displayComp();
		obj.reg();
	}
}		