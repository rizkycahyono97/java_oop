package com.package1.order;

import com.package1.product.ProductForSale;

public record OrderedItem(ProductForSale product, int qty) {

}
