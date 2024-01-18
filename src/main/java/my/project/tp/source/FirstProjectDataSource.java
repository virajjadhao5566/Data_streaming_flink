package my.project.tp.source;

import org.apache.flink.streaming.api.functions.source.SourceFunction;

import java.time.LocalDateTime;
import java.util.Random;

public class FirstProjectDataSource implements SourceFunction<String> {
    Random random = new Random();
    @Override
    public void run(SourceContext<String> sourceContext) throws Exception {
        for(int i = 0;i<1000;i++){
            int unique_id = i;
            LocalDateTime timestamp = LocalDateTime.now();
            String message = String.format("ID:%d Timestamp:%s",unique_id,timestamp.toString());
            sourceContext.collect(message);
            Thread.sleep(random.nextInt(150));
        }
    }

    @Override
    public void cancel() {

    }
}
