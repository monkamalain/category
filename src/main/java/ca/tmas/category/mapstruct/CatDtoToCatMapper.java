package ca.tmas.category.mapstruct;

import ca.tmas.category.repository.CategoryRepository;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public abstract class CatDtoToCatMapper {

    @Autowired
    protected CategoryRepository categoryRepository;

}
