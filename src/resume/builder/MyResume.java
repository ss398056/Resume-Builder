package resume.builder;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Header;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class MyResume extends JFrame implements ActionListener {
	
	/*private static final String BASE_FONT = "Trebuchet MS";
    private static final String BASE_FONT_BOLDITALIC = "Trebuchet MS BI";
    private static final String BASE_FONT_BOLD = "Trebuchet MS B";

    private static final Font titlefontSmall = FontFactory.getFont(
            BASE_FONT_BOLD, 10, Font.UNDERLINE);*/
	
	JTextField name = new JTextField(15);
	JTextField dob = new JTextField(15);
	
	String gender;
	JRadioButton gender1 = new JRadioButton("Male");
	JRadioButton gender2 = new JRadioButton("Female");
	ButtonGroup bg = new ButtonGroup();
	
	JTextArea address = new JTextArea(5,20);
	JTextField email = new JTextField(15);
	JTextField father = new JTextField(15);
	JTextField mother = new JTextField(15);
	JTextField mobile = new JTextField(15);
	JTextField nty = new JTextField(15);
	JTextField lang = new JTextField(15);
	JTextArea exp = new JTextArea(5,20);
	JTextArea education = new JTextArea(5,20);
	
	JButton jb1 = new JButton("Create Resume");
	JButton jb2 = new JButton("Cancel");
	JButton jb3 = new JButton("Reset");
	
	public MyResume() {

		setLayout(new BorderLayout());
		JLabel h1 = new JLabel("ONLINE RESUME BUILDER");
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		jp2.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		JLabel jl1 = new JLabel("Name* : ");
		gbc.gridx=0;
		gbc.gridy=0;
		jp2.add(jl1,gbc);
		
		gbc.gridx=1;
		gbc.gridy=0;
		gbc.gridwidth=2;
		jp2.add(name,gbc);
		
		
		JLabel jl2 = new JLabel("DOB* : ");
		gbc.gridx=0;
		gbc.gridy=1;
		gbc.gridwidth=1;
		jp2.add(jl2,gbc);
		
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridwidth=2;
		jp2.add(dob,gbc);

		
		JLabel jl3 = new JLabel("Gender* : ");
		gbc.gridx=0;
		gbc.gridy=2;
		gbc.gridwidth=1;
		jp2.add(jl3,gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		gbc.gridwidth=1;
		jp2.add(gender1,gbc);
		
		gbc.gridx=2;
		gbc.gridy=2;
		gbc.gridwidth=1;
		jp2.add(gender2,gbc);
		
		bg.add(gender1);
		bg.add(gender2);
		
		
		JLabel jl4 = new JLabel("Address* : ");
		gbc.gridx=0;
		gbc.gridy=3;
		jp2.add(jl4,gbc);	
		
		gbc.gridx=1;
		gbc.gridy=3;
		gbc.gridwidth=2;
		jp2.add(address,gbc);
		
		
		JLabel jl5 = new JLabel("Email* : ");
		gbc.gridx=0;
		gbc.gridy=4;
		gbc.gridwidth=1;
		jp2.add(jl5,gbc);
		
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.gridwidth=2;
		jp2.add(email,gbc);
		
		
		JLabel jl6 = new JLabel("Father's Name* : ");
		gbc.gridx=0;
		gbc.gridy=5;
		jp2.add(jl6,gbc);
		
		gbc.gridx=2;
		gbc.gridy=5;
		gbc.gridwidth=2;
		jp2.add(father,gbc);
		
	
		JLabel jl7 = new JLabel("Mother's Name* : ");
		gbc.gridx=0;
		gbc.gridy=6;
		jp2.add(jl7,gbc);
		
		gbc.gridx=2;
		gbc.gridy=6;
		gbc.gridwidth=2;
		jp2.add(mother,gbc);
		
		
		JLabel jl8 = new JLabel("Mobile No.* : ");
		gbc.gridx=0;
		gbc.gridy=7;
		jp2.add(jl8,gbc);
		
		gbc.gridx=2;
		gbc.gridy=7;
		gbc.gridwidth=2;
		jp2.add(mobile,gbc);
		
		
		JLabel jl9 = new JLabel("Nationality* : ");
		gbc.gridx=0;
		gbc.gridy=8;
		jp2.add(jl9,gbc);
		
		gbc.gridx=2;
		gbc.gridy=8;
		gbc.gridwidth=2;
		jp2.add(nty,gbc);
		
		JLabel jl10 = new JLabel("Language* : ");
		gbc.gridx=0;
		gbc.gridy=9;
		jp2.add(jl10,gbc);
		
		gbc.gridx=2;
		gbc.gridy=9;
		gbc.gridwidth=2;
		jp2.add(lang,gbc);
		
		
		JLabel jl11 = new JLabel("Work Experience* : ");
		gbc.gridx=0;
		gbc.gridy=10;
		jp2.add(jl11,gbc);
		
		gbc.gridx=2;
		gbc.gridy=10;
		gbc.gridwidth=2;
		jp2.add(exp,gbc);
		
		JLabel jl12 = new JLabel("Education Details* : ");
		gbc.gridx=0;
		gbc.gridy=11;
		jp2.add(jl12,gbc);
		
		gbc.gridx=2;
		gbc.gridy=11;
		gbc.gridwidth=2;
		jp2.add(education,gbc);
		
		
		
		jp1.setLayout(new FlowLayout());
		jp3.setLayout(new FlowLayout());
		
		jp1.add(h1);
		
		jp3.add(jb1);
		jb1.addActionListener(this);
		
		jp3.add(jb2);
		jb2.addActionListener(this);
		jp3.add(jb3);
		jb3.addActionListener(this);
		
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jp3,BorderLayout.SOUTH);
		
		setSize(500,600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Create Resume")) {
			if(!name.getText().equals("") && !dob.getText().equals("") && !address.getText().equals("") && !email.getText().equals("") && !father.getText().equals("") && !mother.getText().equals("") && !mobile.getText().equals("") && !nty.getText().equals("") && !exp.getText().equals("") && !education.getText().equals("")) {
				if(gender1.isSelected() || gender2.isSelected()) {
					generatePDFFile();
					JOptionPane.showMessageDialog(this, "Resume pdf successfully generated.", "Success Message", JOptionPane.PLAIN_MESSAGE);
					reset();
				}else {
					JOptionPane.showMessageDialog(this, "Select gender please!", "Warning Message", JOptionPane.WARNING_MESSAGE);
				}
			}else {
				JOptionPane.showMessageDialog(this, "Please enter all details!", "Warning Message", JOptionPane.WARNING_MESSAGE);
			}
		}
		
		if(e.getActionCommand().equals("Cancel")) {
			this.dispose();
		}
		
		if(e.getActionCommand().equals("Reset")) {
			reset();
		}
		
	}

	public void generatePDFFile() {
		    
		// Create a new document.
		Document document = new Document();
		
		
		  // Create a new PDF writer.
		try {
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("resume_"+name.getText()+".pdf"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		if(gender1.isSelected()) {
			gender = "Male"; 
		}else if(gender2.isSelected()){
			gender = "Female";  
		}
		  // Open the document.
		  document.open();
		  
		  // Add the user's resume information to the document.
		  try {
			document.add(new Paragraph("____________________________________RESUME__________________________________\n\n"));
			document.add(new Paragraph(name.getText().toUpperCase()+"\n"+address.getText()+"\nMOBILE NO.:- "+mobile.getText()+"\nEMAIL:- "+email.getText()));
			
			document.add(new Paragraph("\nObjective:\n______________________________________________________________________________"));
			document.add(new Paragraph("A  Good Work Opportunity and Good Working Ambience That Can Utilize My Abilities Developed Through Experience and Education and Also Provide Me an Opportunity to Grow.\n"));
			
			document.add(new Paragraph("\nExperiance:\n______________________________________________________________________________"));
			document.add(new Paragraph(exp.getText()));
			
			document.add(new Paragraph("\nEducation Details:\n______________________________________________________________________________"));
			document.add(new Paragraph(education.getText()));
			
			document.add(new Paragraph("\nPersonal Details :-\n______________________________________________________________________________"));  
			document.add(new Paragraph("Name : "+name.getText()));
			document.add(new Paragraph("Date Of Birth : "+dob.getText()));
			document.add(new Paragraph("Father's Name : "+father.getText()));
			document.add(new Paragraph("Mother's Name : "+mother.getText()));
			document.add(new Paragraph("Gender : "+gender));
			document.add(new Paragraph("Nationality : "+nty.getText()));
			document.add(new Paragraph("Language : "+lang.getText()));
			document.add(new Paragraph("\nDeclaration:\n______________________________________________________________________________"));
			document.add(new Paragraph("I hereby declare that all the above mentioned information is correct to the best of my knowledge.\n\n"));
			document.add(new Paragraph("Date : "));
			document.add(new Paragraph("Place : "));
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		  // Close the document.
		  document.close();
	}
	
	public void reset() {
		name.setText("");
		dob.setText("");
		address.setText("");
		email.setText("");
		father.setText("");
		mother.setText("");
		mobile.setText("");
		nty.setText("");
		lang.setText("");
		exp.setText("");
		education.setText("");
		
		bg.clearSelection();
	}

}
