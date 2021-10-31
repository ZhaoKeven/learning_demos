package com.example.shirodemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PermissionEntity {
    private String id;
    private String permissionsName;
}
