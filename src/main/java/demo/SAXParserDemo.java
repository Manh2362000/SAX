package demo;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.List;

public class SAXParserDemo {
    public static void main(String[] args) {
        try {
            //doc file xml
            File inputFile = new File("input.xml");
            //khoi tao saxparser factory
            SAXParserFactory factory = SAXParserFactory.newInstance();
            //tao sax parser
            SAXParser saxParser = factory.newSAXParser();
            //parse file xml theo cach parse o tren
            StudentHandler studentHandler = new StudentHandler(); //cach parse tai lieu.
            //lay danh sach student.
            saxParser.parse(inputFile, studentHandler);
            List<Student> students = studentHandler.getStudents();
            for (int i = 0; i < students.size(); i++) {
                System.out.println(students.get(i).toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
