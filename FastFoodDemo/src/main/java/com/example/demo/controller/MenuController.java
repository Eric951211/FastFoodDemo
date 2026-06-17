package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MenuController {

    @GetMapping("/menu")
    public List<Map<String, Object>> getMenu() {
        return List.of(
            Map.of(
                "id", 1,
                "name", "大麥克",
                "description", "兩層純牛肉、特製醬料、生菜、起司、洋蔥與酸黃瓜",
                "price", 119,
                "category", "漢堡"
            ),
            Map.of(
                "id", 2,
                "name", "麥克雞塊 (6塊)",
                "description", "香脆多汁的雞胸肉雞塊，附上沾醬",
                "price", 89,
                "category", "點心"
            ),
            Map.of(
                "id", 3,
                "name", "雙層牛肉吉事堡",
                "description", "雙層純牛肉搭配融化起司、番茄醬與黃芥末醬",
                "price", 59,
                "category", "漢堡"
            ),
            Map.of(
                "id", 4,
                "name", "麥香魚",
                "description", "香煎魚排佐塔塔醬，夾入鬆軟麵包",
                "price", 69,
                "category", "漢堡"
            ),
            Map.of(
                "id", 5,
                "name", "薯條 (大)",
                "description", "金黃酥脆的現炸薯條",
                "price", 55,
                "category", "配餐"
            )
        );
    }
}
