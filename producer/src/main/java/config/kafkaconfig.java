package config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaconfig {


    public NewTopic newTopic(){
        return TopicBuilder.name("consume").build();
    }
    
}
