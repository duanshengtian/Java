package music;
import java.util.ArrayList;

/**
 * @ClassName: Master 
* @Description: 定义一个数组，打印出要播放歌曲的基本信息
* @author 段胜甜 
* @date 2018年10月16日 下午10:35:40
 */
public class Master {
	public static ArrayList<Song> listsong;
	public Master() {
		listsong = new ArrayList<>();
		}
	// 打印出要播放的歌曲的基本信息
		public void play() {
			for (Song song : listsong) {
				System.out.println("歌名：" + song.songName);
				System.out.println("演唱歌手：" + song.singer);
				System.out.println("歌曲时长：" + song.time);
				}
			}
}
