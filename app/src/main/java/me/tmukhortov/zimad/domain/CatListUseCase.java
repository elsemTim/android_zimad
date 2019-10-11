package me.tmukhortov.zimad.domain;

import java.util.List;

import io.reactivex.Single;
import io.reactivex.functions.Function;
import me.tmukhortov.zimad.data.entity.AnimalDto;
import me.tmukhortov.zimad.data.entity.Response;
import me.tmukhortov.zimad.data.repository.AnimalRepository;
import me.tmukhortov.zimad.data.repository.AnimalRepositoryImpl;

public class CatListUseCase {

    private final AnimalRepository animalRepository;

    public CatListUseCase() {
        this.animalRepository = new AnimalRepositoryImpl();
    }

    public Single<List<AnimalDto>> execute() {
        return animalRepository.getCatList().map(Response::getData);
    }
}
