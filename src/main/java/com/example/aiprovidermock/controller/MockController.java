package com.example.aiprovidermock.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class MockController {

    @GetMapping("/models")
    public Map<String, Object> listModels() {
        return Map.of(
                "object", "list",
                "data", List.of(
                        Map.of("id", "gpt-4", "object", "model", "owned_by", "openai"),
                        Map.of("id", "qwen-turbo", "object", "model", "owned_by", "alibaba"),
                        Map.of("id", "llama3", "object", "model", "owned_by", "meta")
                )
        );
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP", "service", "ai-provider-mock");
    }
}