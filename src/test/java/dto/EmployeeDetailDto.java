package dto;

public class EmployeeDetailDto {
	private int empId;
	private String empName;
	private float empSal;
	
	public EmployeeDetailDto(int empId, String empName, float empSal ){
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	
	public int getEmpId(){
		return this.empId;
	}
	
	public String getEmpName(){
		return this.empName;
	}
	
	public float getEmpSal(){
		return this.empSal;
	}

}
