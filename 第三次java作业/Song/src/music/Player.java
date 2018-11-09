package music;
import java.util.Scanner;

/**
 * @ClassName: Player 
* @Description: 调用Master类中的数组来点歌
* @author 段胜甜
* @date 2018年10月16日 下午10:35:14
 */
public class Player {
		public void addSong(Song song) {
			Master.listsong.add(song);
		}
}
