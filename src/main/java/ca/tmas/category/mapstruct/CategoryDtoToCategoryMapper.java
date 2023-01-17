package ca.tmas.category.mapstruct;

import ca.tmas.category.dto.CategoryDto;
import ca.tmas.category.model.Category;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CategoryDtoToCategoryMapper {

    CategoryDtoToCategoryMapper MAPPER = Mappers.getMapper(CategoryDtoToCategoryMapper.class);

    @BeanMapping(ignoreByDefault = true)
    @Mapping(source = "nameCategory", target = "nameCategory")
    @Mapping(source = "totalCategory", target = "totalCategory")
    Category categoryDtoToCategory(CategoryDto categoryDto);

    CategoryDto categoryToCategoryDto(Category category);

}
