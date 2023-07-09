package doubts;

import java.util.ArrayList;
import java.util.Scanner;



public class AdminController {
	 
	
	public static void main(String args[]) {
	
		ArrayList<AdminBean> list = new ArrayList<>();
		int ch = 0;
		AdminBean bean;
		AdminDao dao = new AdminDao();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.println("\n1--Add data");
		System.out.println("2--Display data");
		System.out.println("3--Remove data with index");
		System.out.println("4--Remove data with Id");
		System.out.println("5--Remove data with Name");
		System.out.println("6--Update data with index");
		System.out.println("7--Update data with Id");
		System.out.println("8--Update data with Name");
		System.out.println("9--Exit\n");
		
		System.out.println("Enter your choice : ");
		ch = sc.nextInt();
		
		switch(ch) {
			
			case 1:{
				bean = new AdminBean();
				
				System.out.println("Enter the id: ");
				int id = sc.nextInt();
				System.out.println("Enter the name: ");
				String name = sc.next();
				System.out.println("Enter the email: ");
				String email = sc.next();
				
				bean.setId(id);
				bean.setName(name);
				bean.setEmail(email);
				
				list.add(bean);
				
				break;
				}
			case 2:{
				
				for(int i=0;i<list.size();i++) {
					bean = list.get(i);	//  for 2 objects we have taken i
					dao.getData(bean);	//method of AdminDao accepts an Object of type AdminBean as a parameter
					}
				break;
				}// case 2
			
			case 3:{
				bean= new AdminBean();
			//	AdminBean ab1=new AdminBean();
				
				for(int i=0;i<list.size();i++) {
					bean = list.get(i);	
					dao.getData(bean);	
					}
					
				System.out.println("Enter the index you want to delete");
				int index = sc.nextInt();
				list.remove(index);
				System.out.println("Index deleted successfully");
		
				break;
				}
				
			case 4:{
				
				
				for(int i=0;i<list.size();i++) {
					
					bean= new AdminBean();
					bean = list.get(i);	
					dao.getData(bean);	
					}
				
				
				System.out.println("Enter the id you want to delete");
				int id = sc.nextInt();
				bean.setId(id);
				
				if(list.contains(bean))	// are we checking object? or object.id 
				{
					
					System.out.println("contains....");
				int in = list.indexOf(bean);
				list.remove(in);
				System.out.println("Data deleted successfully");
				
				System.out.println("Remaining Data is as follows");
					for(int i=0;i<list.size();i++) {
					bean = list.get(i);	
					dao.getData(bean);	
					}
				}//if
				else {
					System.out.println("Id not found");
				}
			break;
			}
			
			case 5:{
				bean = new AdminBean();
				for(int i=0;i<list.size();i++) {
					bean = list.get(i);	
					dao.getData(bean);	
					}
				
				System.out.println("Enter the name you want to delete");
				String name = sc.next();
				bean.setName(name);
				
				if(list.contains(bean)) {
					int index=list.indexOf(bean);
					list.remove(index);
					System.out.println("Data Removed..");
				}
				else {
					System.out.println("Name not found");
				}
			
				break;
			
			}
			case 6:{
				
				bean=new AdminBean();
				System.out.println("Enter the index you want to update");
				int index=sc.nextInt();
				System.out.println("Enter the new id");
				int id = sc.nextInt();
				System.out.println("Enter the new name");
				String name=sc.next();
				System.out.println("Enter the new email");
				String email=sc.next();
				bean.setId(id);
				bean.setName(name);
				bean.setEmail(email);
				
				list.set(index, bean);
				System.out.println(index + "th index Updated Successfully");
				
				
				break;
			}
			
			case 7:{
				
				bean=new AdminBean();
				System.out.println("Enter the id you want to update");
				int ID=sc.nextInt();
				bean.setId(ID);
			
				System.out.println(list.contains(bean));
				
				if(list.contains(bean)) {
		
					int index=list.indexOf(bean);

					System.out.println("Enter the new id");
					int newid = sc.nextInt();
					System.out.println("Enter the new name");
					String name=sc.next();
					System.out.println("Enter the new email");
					String email=sc.next();
					bean.setId(newid);
					bean.setName(name);
					bean.setEmail(email);
				
					list.set(index, bean);
				}	
				else {
					System.out.println("Invalid Id");
				}
				
				break;
			}
			
			case 8:{
				bean =new AdminBean();
				System.out.println("Enter the name you want to update");
				String n = sc.next();
				bean.setName(n);
				
				if(list.contains(bean)) {
					
					int index = list.indexOf(bean);
					System.out.println("Enter the new id");
					int newid = sc.nextInt();
					System.out.println("Enter the new name");
					String name=sc.next();
					System.out.println("Enter the new email");
					String email=sc.next();
				
					bean = new AdminBean();
					bean.setId(newid);
					bean.setName(name);
					bean.setEmail(email);
				
					list.set(index, bean);
					System.out.println("Data updated");
				}
				else {
					System.out.println("Name not found");
					
				}
				
				
			break;
			}
	
			case 9:{
				System.exit(0);
				break;
				}//
			
			}//switch
		
		}//while
		
	}//main
}