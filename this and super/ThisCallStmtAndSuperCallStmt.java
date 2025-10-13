package basicCodes.thisAndSuperKeyword;

class Parent1{
	public Parent1() {
		System.out.println("Default Parent");
	}
	public Parent1(int a) {
		System.out.println("Parent int");
	}
	public Parent1(String b) {
		System.out.println("Parent String");
	}
	
}

public class ThisCallStmtAndSuperCallStmt extends Parent1{
	
	public ThisCallStmtAndSuperCallStmt() {
		super(2);
		System.out.println("Default child");
	}
	
	public ThisCallStmtAndSuperCallStmt(int a)
	{
		super(" ");
		System.out.println("1st");
	}
	
	public ThisCallStmtAndSuperCallStmt(int a, int b)
	{
		System.out.println("int a, int b");
	}
	
	public ThisCallStmtAndSuperCallStmt(String a)
	{
		this(5,6);
		System.out.println("3rd");
	}

	public static void main(String[] args) {
		ThisCallStmtAndSuperCallStmt obj = new ThisCallStmtAndSuperCallStmt();
		ThisCallStmtAndSuperCallStmt obj1 = new ThisCallStmtAndSuperCallStmt(5);
		ThisCallStmtAndSuperCallStmt obj2 = new ThisCallStmtAndSuperCallStmt(5,6);
		ThisCallStmtAndSuperCallStmt obj3 = new ThisCallStmtAndSuperCallStmt("Rahul");
		
	}

}
