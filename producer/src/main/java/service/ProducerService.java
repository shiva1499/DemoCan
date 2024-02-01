package service;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    //private final Logger logger = LoggerFactory.getLogger(ProducerService.class);

    public void updateLocation(String location) {
        this.kafkaTemplate.send("consume", location);
    }
}

