import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class LuongLamViec extends Thread{
	Socket socketClient;
	int id;
	
	public LuongLamViec(Socket socketClient, int id) {
		super();
		this.socketClient = socketClient;
		this.id = id;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print(socketClient.getInetAddress().getHostAddress());
		System.out.print(id); 
		System.out.print("\n");
		try {
			OutputStream osToClient = socketClient.getOutputStream();
			OutputStreamWriter write2Client = new OutputStreamWriter(osToClient);
			BufferedWriter buffWrite = new BufferedWriter(write2Client);
			
			InputStream in = socketClient.getInputStream();
			InputStreamReader inReader = new InputStreamReader(in);
			BufferedReader buffRead = new BufferedReader(inReader);
			
			while (true) {
				//Nhan du lieu
				String chuoiNhan = buffRead.readLine();
				//Gui tra
				if (chuoiNhan.equals("1"))
				{
					buffWrite.write("One");
					buffWrite.flush();
				}
				else {
					if (chuoiNhan.equals("2"))
					{
						buffWrite.write("Two");
						buffWrite.flush();
					}
					else {
						if (chuoiNhan.equals("3"))
						{
							buffWrite.write("Three");
							buffWrite.flush();
						}
						else {
							if (chuoiNhan.equals("4"))
							{
								buffWrite.write("Four");
								buffWrite.flush();
							}
							else {
								if (chuoiNhan.equals("5"))
								{
									buffWrite.write("Five");
									buffWrite.flush();
								}
								else {
									if (chuoiNhan.equals("6"))
									{
										buffWrite.write("Six");
										buffWrite.flush();
									}
									else {
										if (chuoiNhan.equals("7"))
										{
											buffWrite.write("Seven");
											buffWrite.flush();
										}
										else {
											if (chuoiNhan.equals("8"))
											{
												buffWrite.write("Eight");
												buffWrite.flush();
											}
											else {
												if (chuoiNhan.equals("9"))
												{
													buffWrite.write("Nine");
													buffWrite.flush();
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if(chuoiNhan.equals("10")) break;
			}				
			//Dong socket
			socketClient.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println(e.getMessage());
		}
		
	}
	
}
