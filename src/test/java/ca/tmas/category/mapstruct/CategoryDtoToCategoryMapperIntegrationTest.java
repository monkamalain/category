package ca.tmas.category.mapstruct;

import ca.tmas.category.dto.CategoryDto;
import ca.tmas.category.model.Category;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CategoryDtoToCategoryMapperIntegrationTest {

    @Test
    public void givenCategoryDtoToCategory_whenMaps_thenCorrect() {
        // given
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setNameCategory("Viande");
        categoryDto.setTotalCategory(30);

        // when
        Category category = CategoryDtoToCategoryMapper.MAPPER.categoryDtoToCategory(categoryDto);

        // then
        assertEquals(category.getNameCategory(), categoryDto.getNameCategory());
        assertEquals(category.getTotalCategory(), categoryDto.getTotalCategory());

    }
}
