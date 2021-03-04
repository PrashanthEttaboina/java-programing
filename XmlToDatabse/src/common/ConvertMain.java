package common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConvertMain {

	public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/lotus";
		String username = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url, username, password);

		String sql = "insert into location (id, date, time, location_id, status, alarm) VALUES (?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		try {
			FileInputStream file = new FileInputStream(new File("D:\\File.xlsx"));

			
			XSSFWorkbook workbook = new XSSFWorkbook(file);   //xxsfWorkbook is used to read xslx file

			
			XSSFSheet sheet = workbook.getSheetAt(0);        // index of excel sheet starts at 1

			
			Iterator<Row> rowIterator = sheet.iterator();	// Iterate through each rows one by one
			rowIterator.next();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();				// For each row, iterate through all the columns
				
				Iterator<Cell> cellIterator = row.cellIterator();

				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();		// Check the cell type and format accordingly
					
					int a = cell.getColumnIndex();
					System.out.print(a + "------>");
					switch (a) {
					case 0:
						int id = (int) cell.getNumericCellValue();
						System.out.print(id);
						ps.setInt(1, id);
						break;
					case 1:
						String date = cell.getStringCellValue();
						System.out.print(date);
						ps.setString(2, date);
						break;
					case 2:
						Date time = cell.getDateCellValue();
						Time time1 = new Time(time.getTime());
						System.out.print(time1);
						ps.setTime(3, time1);
						break;
					case 3:
						int location = (int) cell.getNumericCellValue();
						System.out.print(location);
						ps.setInt(4, location);
						break;
					case 4:
						String status = cell.getStringCellValue();
						System.out.print(status);
						ps.setString(5, status);
						break;
					case 5:
						String alarm = cell.getStringCellValue();
						System.out.print(alarm);
						ps.setString(6, alarm);
						break;
					}
					System.out.println();
				}
				System.out.println("");
				ps.executeUpdate();
			}
			System.out.println("imported complete");
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
