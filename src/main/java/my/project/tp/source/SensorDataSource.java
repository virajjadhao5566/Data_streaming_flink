package my.project.tp.source;

import org.apache.flink.streaming.api.functions.source.SourceFunction;

public class SensorDataSource implements SourceFunction<String> {

    @Override
    public void run(SourceContext<String> sourceContext) throws Exception {

    }

    @Override
    public void cancel() {

    }
}
