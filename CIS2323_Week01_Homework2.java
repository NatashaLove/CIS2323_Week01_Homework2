//Create and set up the window.
JFrame frame = new JFrame("TextDemo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Create our text area
JTextArea textArea = new JTextArea(
			"==========================================================================\n" +
			"Natasha Love\n" +
			"Student, CIS, OSU - OKC				 p: (405) 641-3181\n" +
			"900 N. Portland Ave.					 e: debora@inbox.ru\n" +
			"Oklahoma City, OK						 g: github.com/Natashalove\n" +				 
			"==========================================================================\n");
textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);
textArea.setEditable(false);

// Add textarea to our window, and make it visible.
frame.add(textArea);
frame.pack();
frame.setVisible(true);