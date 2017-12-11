package mypackage;

import java.io.Serializable;
import java.util.ArrayList;


public class StudentInfoBean implements Serializable {

	private ArrayList<StudentRecordBean> studentRecordArray
		= new ArrayList<StudentRecordBean>();

	public StudentInfoBean() {

	}

	public ArrayList<StudentRecordBean> getStudentRecordArray() {

		return this.studentRecordArray;

	}

	public void addStudentRecord(StudentRecordBean obj) {

		this.studentRecordArray.add(obj);

	}
	public int getArraySize() {

		return this.studentRecordArray.size();

	}
}