package music;

import java.util.ArrayList;
import java.util.Scanner;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @ClassName: SongDrive 
* @Description: ������������������
* @author ��ʤ��
* @date 2018��10��16�� ����10:35:00
 */
public class SongDrive {
		public Master master;// ������
		public Player player;// ���

	public SongDrive() {
		master = new Master();
		player = new Player();
		// ��ȡplayer�����������Ϣ���жϵ���Ƿ����
		Scanner in = new Scanner(System.in);
		boolean judge = true;
		while (judge) {
			System.out.println("������������֣�");
			String songName = in.nextLine();
			System.out.println("��������֣�");
			String singer = in.nextLine();
			System.out.println("���������ʱ����");
			String time = in.nextLine();
			player.addSong(new Song(songName, singer, time));
			System.out.println("�Ƿ������裺��Y or N��");
			String isContinue = in.nextLine();
			if (isContinue.equals("N"))
				judge = false;
			}
		master.play();
	}

	public static void main(String[] args) {
		
		SongDrive songDrive = new SongDrive();
	}
}