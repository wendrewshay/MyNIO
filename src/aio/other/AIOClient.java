package aio.other;

/**   
 * @ClassName: AIOClient   
 * @Description: TODO(这里用一句话描述这个类的作用)   
 * @author: XiaWenQiang
 * @date: 2017年7月31日 下午3:45:59   
 *      
 */
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousSocketChannel;
import java.util.concurrent.CountDownLatch;  
  
public class AIOClient {  
  
    public static void main(String... args) throws Exception { 
    	CountDownLatch latch = new CountDownLatch(1);
        AsynchronousSocketChannel client = AsynchronousSocketChannel.open();  
        client.connect(new InetSocketAddress("localhost", 9888));  
        client.write(ByteBuffer.wrap("test".getBytes())).get();
        latch.await();
    }  
}  
