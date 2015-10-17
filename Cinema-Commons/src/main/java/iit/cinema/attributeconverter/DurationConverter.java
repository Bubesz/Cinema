package iit.cinema.attributeconverter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * Created by Attila on 2015.10.08..
 */
@Converter(autoApply = true)
public class DurationConverter implements AttributeConverter<Duration, Long> {

    public Long convertToDatabaseColumn(Duration attribute) {
        return attribute.getSeconds();
    }

    public Duration convertToEntityAttribute(Long dbData) {
        return Duration.ofSeconds(dbData);
    }
}
