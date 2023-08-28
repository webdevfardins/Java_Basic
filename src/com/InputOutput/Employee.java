package com.InputOutput;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	public String id = null;
	public String FirstName=null;
	public String LastName=null;
	public double salary=0;
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id =(String) in.readObject();
		FirstName =(String) in.readObject();
		LastName =(String) in.readObject();
		salary = in.readDouble();
	}



	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(id);
		out.writeObject(FirstName);
		out.writeObject(LastName);
		out.writeDouble(salary);
		
	}

}
