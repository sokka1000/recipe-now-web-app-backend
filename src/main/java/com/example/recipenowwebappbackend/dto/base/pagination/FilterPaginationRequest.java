package com.example.recipenowwebappbackend.dto.base.pagination;

import com.example.recipenowwebappbackend.dto.base.request.PaginationRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FilterPaginationRequest<Filtration> extends PaginationRequest {
    private Filtration criteria;
    private Boolean deletedRecords;
}
