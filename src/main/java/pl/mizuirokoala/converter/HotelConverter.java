package pl.mizuirokoala.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.mizuirokoala.entity.Hotel;
import pl.mizuirokoala.repository.HotelRepository;

public class HotelConverter  implements Converter<String, Hotel> {
        @Autowired
        private HotelRepository hotelRepository;

        @Override
        public Hotel convert(String source) {
            try {
                Hotel hotel = hotelRepository.findOne(Long.parseLong(source));
                return hotel;
            } catch (Exception e) {
                return null;
            }
        }
    }
