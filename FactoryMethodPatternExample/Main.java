public class Main {
    public static void main (String [] args) {
        DocFactory wordFactory = new WordDocFactory();
        Doc word = wordFactory.createDoc();
        word.open();

        DocFactory pdfFactory = new PdfDocFactory();
        Doc pdf = pdfFactory.createDoc();
        pdf.open();

        DocFactory excelFactory = new ExcelDocFactory();
        Doc excel = excelFactory.createDoc();
        excel.open();

    }
}


