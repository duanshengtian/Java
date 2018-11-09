package music;

import java.util.ArrayList;
import java.util.Scanner;
import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @ClassName: SongDrive 
* @Description: 让整个程序运行起来
* @author 段胜甜
* @date 2018年10月16日 下午10:35:00
 */
public class SongDrive {
		public Master master;// 主持人
		public Player player;// 点歌

	public SongDrive() {
		master = new Master();
		player = new Player();
		// 获取player所点歌曲的信息并判断点歌是否完毕
		Scanner in = new Scanner(System.in);
		boolean judge = true;
		while (judge) {
			System.out.println("请输入歌曲名字：");
			String songName = in.nextLine();
			System.out.println("请输入歌手：");
			String singer = in.nextLine();
			System.out.println("请输入歌曲时长：");
			String time = in.nextLine();
			player.addSong(new Song(songName, singer, time));
			System.out.println("是否继续点歌：（Y or N）");
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