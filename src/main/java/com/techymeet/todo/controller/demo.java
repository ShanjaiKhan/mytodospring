/*
 * package com.techymeet.todo.controller;
 * 
 * public class demo {
 * 
 * @RequestMapping(value = REQ_MAP_STAFF_UPLOAD, method = RequestMethod.POST)
 * public String staffUpload(@Valid @ModelAttribute("uploadFile") Staff staffBo,
 * BindingResult result, HttpServletRequest request, ModelMap model, HttpSession
 * session,
 * 
 * @RequestParam("uploadStaff") MultipartFile excelfile) throws IOException,
 * SerialException, SQLException, SMSAppException { int staffId = 0; try {
 * List<Staff> uploadStaffsucess = new ArrayList<Staff>(); Staff staff = new
 * Staff();
 * 
 * List<Staff> existuploadStaff = new ArrayList<Staff>(); List<Staff>
 * uploadStaff = new ArrayList<Staff>(); int i = 0; // Creates a workbook object
 * from the uploaded excelfile XSSFWorkbook workbook = new
 * XSSFWorkbook(excelfile.getInputStream()); // Creates a worksheet object
 * representing the first sheet XSSFSheet worksheet = workbook.getSheetAt(0); //
 * Reads the data in excel file until last row is encountered Iterator<Row>
 * rowIterator = worksheet.iterator(); while (rowIterator.hasNext()) { Row row =
 * rowIterator.next(); // Read Rows from Excel document if (row.getRowNum() >=
 * 1) { staffBo = new Staff(); Iterator<Cell> cellIterator =
 * row.cellIterator();// Read every // column // for every // row that // is
 * READ while (cellIterator.hasNext()) { if (row.getRowNum() >= 1) { Cell cell =
 * cellIterator.next(); // Fetch CELL
 * 
 * if(cell.getColumnIndex()==0) { if (null!=cell.getStringCellValue()) {
 * staffBo.setFullName(cell.getStringCellValue()); } }
 * if(cell.getColumnIndex()==1) { if (null!=cell.getStringCellValue()) {
 * staffBo.setNameWithIntials(cell.getStringCellValue()); }
 * 
 * } if(cell.getColumnIndex()==2) { if (null!=cell.getStringCellValue()) {
 * staffBo.setLastName(cell.getStringCellValue()); } }
 * if(cell.getColumnIndex()==3) { if (0<cell.getNumericCellValue()) {
 * staffBo.setNationalID(String.valueOf((long)cell.getNumericCellValue())); } }
 * if(cell.getColumnIndex()==4) { if (null!=cell.getStringCellValue()) {
 * staffBo.setGender(cell.getStringCellValue().charAt(0)); } }
 * if(cell.getColumnIndex()==5) { if (null!=cell.getStringCellValue()) {
 * staffBo.setStaffCategories(cell.getStringCellValue()); } }
 * if(cell.getColumnIndex()==6) { if (null!=cell.getStringCellValue()) {
 * staffBo.setSubject(cell.getStringCellValue()); } }
 * if(cell.getColumnIndex()==7) { if (null!=cell.getStringCellValue()) {
 * staffBo.setMedium(cell.getStringCellValue()); } }if(cell.getColumnIndex()==8)
 * { if (null!=cell.getDateCellValue()) {
 * staffBo.setDateOfHire(cell.getDateCellValue()); } }
 * 
 * if(cell.getColumnIndex()==9) { if (null!=cell.getStringCellValue()) {
 * staffBo.setEmail(cell.getStringCellValue()); } }if(cell.getColumnIndex()==10)
 * { if (null!=cell.getStringCellValue()) { //String []
 * classGrades=cell.getStringCellValue();
 * 
 * staffBo.setClassGrade(cell.getStringCellValue()); } }
 * 
 * if(cell.getColumnIndex()==11) { if (null!=cell.getStringCellValue()) {
 * staffBo.setAcadamicYear(cell.getStringCellValue()); } }
 * if(cell.getColumnIndex()==12) { if (null!=cell.getStringCellValue()) {
 * staffBo.setClasses(cell.getStringCellValue()); } }
 * if(cell.getColumnIndex()==13) { switch (cell.getCellType()) { case
 * Cell.CELL_TYPE_NUMERIC: if(null==staffBo.getGrades()){ Integer grade=(int)
 * cell.getNumericCellValue(); staffBo.setGrades(grade.toString()); break; }
 * case Cell.CELL_TYPE_STRING: if(null==staffBo.getGrades()){
 * staffBo.setGrades(cell.getStringCellValue()); break; } } }
 * 
 * } } }
 */