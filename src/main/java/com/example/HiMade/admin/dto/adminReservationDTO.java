package com.example.HiMade.admin.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class adminReservationDTO {

  private int categoryId;
  private int categoryLevel;
  private int parentCategoryId;
  private String serviceName;
  private int servicePrice;
  private String serviceContent;
  private String storeId;

  private String imageUrl;

}
