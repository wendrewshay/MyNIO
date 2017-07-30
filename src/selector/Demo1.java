package selector;

import java.io.IOException;
import java.nio.channels.Selector;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		Selector selector = Selector.open();
//		channel.configureBlocking(false);
//		SelectionKey key = channel.register(selector, SelectionKey.OP_READ);
//		while(true) {
//		  int readyChannels = selector.select();
//		  if(readyChannels == 0) continue;
//		  Set selectedKeys = selector.selectedKeys();
//		  Iterator<SelectionKey> keyIterator = selectedKeys.iterator();
//		  while(keyIterator.hasNext()) {
//		    SelectionKey key1 = keyIterator.next();
//		    if(key1.isAcceptable()) {
//		        // a connection was accepted by a ServerSocketChannel.
//		    } else if (key1.isConnectable()) {
//		        // a connection was established with a remote server.
//		    } else if (key1.isReadable()) {
//		        // a channel is ready for reading
//		    } else if (key1.isWritable()) {
//		        // a channel is ready for writing
//		    }
//		    keyIterator.remove();
//		  }
//		}
		
	}
}
