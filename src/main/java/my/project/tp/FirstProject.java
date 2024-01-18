package my.project.tp;

import my.project.tp.source.FirstProjectDataSource;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class FirstProject {
    public static void main(String[] args) throws Exception {
//        Setup the execution environment
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//        Creation of datastream
        DataStream<String> streamOfStrings = env.addSource(new FirstProjectDataSource());
        streamOfStrings.print();
        env.execute(FirstProject.class.getName());
    }
}
