package channel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**   
 * @ClassName: Demo1   
 * @Description: channel读取数据示例   
 * @author: XiaWenQiang
 * @date: 2017年7月28日 下午5:06:00   
 *      
 */
public class Demo1 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile aFile = new RandomAccessFile("sanwen.txt", "rw");
		FileChannel inChannel = aFile.getChannel();

		ByteBuffer buf = ByteBuffer.allocate(200);

		int bytesRead = inChannel.read(buf);
		while (bytesRead != -1) {

			System.out.println("\n\rRead " + bytesRead);
			// 反转--flip的作用有两个：
			// 1. 把limit设置为当前的position值 ;
			// 2. 把position设置为0;
			// 然后处理的数据就是从position到limit直接的数据，也就是你刚刚读取过来的数据
			buf.flip(); 
			System.out.println("position = " + buf.position() + ", limit = " + buf.limit());
	
			while(buf.hasRemaining()){
				System.out.print((char) buf.get());
			}

			buf.clear();
			bytesRead = inChannel.read(buf);
		}
		aFile.close();	
	}
}
