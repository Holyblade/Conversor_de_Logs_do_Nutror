package Function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;
import java.util.Scanner;

public class File {
	
	public void readFile(String File, double Value, String OutputDirectory) throws Exception {
		BufferedReader Buffer = new BufferedReader(new InputStreamReader(new FileInputStream(File), "UTF-8"));
		String Line = Buffer.readLine();
		while (Line != null) {
			Line = Buffer.readLine();
			Scanner helperScanner = new Scanner(Line);
			helperScanner.useDelimiter(",");
			int usableData = 0;
			while (helperScanner.hasNext()) {
				String WritingData = helperScanner.next();
				if (usableData == 1) {
					String textToWritePreFormated = WritingData + ";" + helperScanner.next() + ";" + Value;
					String variableForFormat = Character.toString('"');
					String textToWriteFormated = textToWritePreFormated.replaceAll(variableForFormat, "");
					writeFile(textToWriteFormated, OutputDirectory);
					usableData = 5;
				}
				usableData++;
			}
			helperScanner.close();
		}
		Buffer.close();
	}
	
	public void writeFile(String Line, String OutputDirectory) throws IOException {
		Writer File = new BufferedWriter(new FileWriter(OutputDirectory+"Output_NUTROR.txt", true));
		File.append(Line + "\n");
		File.close();
	}
	
}
