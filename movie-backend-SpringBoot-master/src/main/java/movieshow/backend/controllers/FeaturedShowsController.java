package movieshow.backend.controllers;

import movieshow.backend.models.FeaturedShow;
import movieshow.backend.services.FeaturedShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FeaturedShowsController {
    @Autowired
    private FeaturedShowService service;
    @GetMapping("/featured-shows")
    public ResponseEntity getFeaturedShows(){
        return new ResponseEntity(service.getFeaturedShows(), HttpStatus.OK);
    }

    @GetMapping("/featured-shows/{id}")
    public ResponseEntity getFeaturedShowById(@PathVariable("id") String id){


        return new ResponseEntity(service.getFeaturedShowById(id), HttpStatus.OK);
    }

    @PostMapping(value="/featured-shows", consumes={MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity createFeaturedShows(@RequestBody FeaturedShow featuredShow){
        service.insertIntoFeaturedShows(featuredShow);

        return new ResponseEntity(featuredShow, HttpStatus.OK);
    }


}
