package music;
import java.util.ArrayList;

/**
 * @ClassName: Master 
* @Description: ����һ�����飬��ӡ��Ҫ���Ÿ����Ļ�����Ϣ
* @author ��ʤ�� 
* @date 2018��10��16�� ����10:35:40
 */
public class Master {
	public static ArrayList<Song> listsong;
	public Master() {
		listsong = new ArrayList<>();
		}
	// ��ӡ��Ҫ���ŵĸ����Ļ�����Ϣ
		public void play() {
			for (Song song : listsong) {
				System.out.println("������" + song.songName);
				System.out.println("�ݳ����֣�" + song.singer);
				System.out.println("����ʱ����" + song.time);
				}
			}
}
