package movieshow.backend.services;

import movieshow.backend.models.Slider;
import movieshow.backend.models.SliderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SliderService {

    @Autowired
    private SliderRepository repository;

    public List<Slider> getSlider(){
        return repository.findAll();
    }

    public void insertIntoSlider(Slider slider){repository.insert(slider);}

}
