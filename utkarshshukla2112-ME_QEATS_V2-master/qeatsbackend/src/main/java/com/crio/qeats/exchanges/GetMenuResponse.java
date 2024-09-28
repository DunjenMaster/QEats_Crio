package com.crio.qeats.exchanges;

import com.crio.qeats.dto.MenuItemDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetMenuResponse {
    private MenuItemDTO menu;
}
