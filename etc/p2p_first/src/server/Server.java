package server;

public class Server 
{
	public static void main(String[] args) 
	{
		System.out.println("���� ����");
		
		// singleton pattern
		Receiver.getInstance();
	}
}