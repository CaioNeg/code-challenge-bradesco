package br.com.cn.dto;

import java.util.List;

public record ProductResponseList(
        List<ProductResponse> products
) {
}
