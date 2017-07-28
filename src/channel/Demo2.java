package channel;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * channel to channel
 * @Package: channel 
 * @author: xiawq   
 * @date: 2017年7月29日 上午12:53:57
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile fromFile = new RandomAccessFile("fromFile.txt", "rw");
		FileChannel      fromChannel = fromFile.getChannel();

		RandomAccessFile toFile = new RandomAccessFile("toFile.txt", "rw");
		FileChannel      toChannel = toFile.getChannel();

		long position = 0;
		long count = fromChannel.size();

//		toChannel.transferFrom(fromChannel, position, count);
		fromChannel.transferTo(position, count, toChannel);
	}
}
