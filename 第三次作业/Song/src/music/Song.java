package music;

/**
 * @ClassName: Song 
* @Description: 实现参数的传递
* @author 段胜甜
* @date 2018年10月16日 下午10:24:55
 */
public class Song {
		String songName;// 歌曲名字
		String singer;// 歌手
		String time;// 歌曲时长

		public Song(String songName, String singer, String time) {
			this.songName = songName;
			this.singer = singer;
			this.time = time;
		}
}
