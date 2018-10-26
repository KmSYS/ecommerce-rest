package com.domain.ecommerce.customer.item;

import com.domain.ecommerce.customer.category.Category;
import com.domain.ecommerce.customer.user.User;

import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data @Builder @AllArgsConstructor @NoArgsConstructor
public class Item {

    private long id;
    private String name;
    private String description;
    private String price;
    private Date addDate;
    private String countryMade;
    private String image;
    private String status;
    private byte rating;
    private byte approve;
    private String tags;
    private User user;
    private Category category;
}

